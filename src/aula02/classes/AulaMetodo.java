package aula02.classes;

public class AulaMetodo {
	
	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco(1, "Edney", 50.00);
		ContaBanco c2 = new ContaBanco(2, "Marjorie", 50.00);

		double sacado = c1.sacar(20);
		System.out.println(sacado);
		
		System.out.println("----------------------");
		c1.consultaSimples();

		System.out.println("----------------------");
		double saldo = c1.consulta();
		System.out.println("saldo pela consulta normal: " + saldo);

		System.out.println("----------------------");
		// c1 = 30
		// c2 = 50
		boolean transferiu = c1.transferir(c2, 20);

		if (transferiu) {
			c1.consultaSimples();
			c2.consultaSimples();
			
		} else {
			System.out.println("saldo insuficiente para transferencia");
		}
		
		System.out.println("----------------------");
		// c1 = 10
		// c2 = 70
		c1.depositar(190);
		ContaBanco.depositar(c2, 30);
		c1.consultaSimples();
		c2.consultaSimples();
				
	}

}


class ContaBanco {
	
	int idCliente;
	String nomeCliente;
	double saldo;
	
	public ContaBanco(int id, String nome, double valor) {
		idCliente = id;
		nomeCliente = nome;
		saldo = valor;
	}
	
	// sacar (verificar saldo, subtrair o valor, entregar o dinhero
	public double sacar(double valorSaque) {
		if (saldo < valorSaque) {
			System.out.println("saldo insuficiente");
			return 0.0;
		}
		
		saldo -= valorSaque;
		System.out.println("saque realizado. Saldo atual: " + saldo);
		
		return valorSaque;
	}
	
	
	// consultar
	public void consultaSimples() {
		System.out.println("simples: " + saldo);
	}

	public double consulta() {
		return saldo;
	}

	
	// transferir
	public boolean transferir(ContaBanco destino, double valorTransferir) {
		if (saldo < valorTransferir) return false;
		
		saldo -= valorTransferir;
		destino.saldo += valorTransferir;
		
		return true;
	}
	
	
	// depositar
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public static void depositar(ContaBanco conta, double valorDeposito) {
		conta.saldo += valorDeposito;
	}
		
}

