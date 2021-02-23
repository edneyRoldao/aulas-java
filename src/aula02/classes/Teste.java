package aula02.classes;
/*
 * - classes sao as formas para criacao dos nossos objetos
 * - passui atributos (variaveis) e comportamentos (métodos)
 * - usamos classes para abstrair coisas do mundo real
 * - no java só trabalhamos com classes
 * */

public class Teste {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		c1.nomeCliente = "vitoria";
		c1.saldo = 100000.00;

		ContaBancaria c2 = new ContaBancaria();
		c1.nomeCliente = "ricardo";
		c1.saldo = 1.00;

	}

}

class ContaBancaria {
	
	// atributos (variaveis membro)
	String nomeCliente;
	double saldo;
	
	// comportamentos (metodos)
	double sacar() {
		return 0;
	}
	
	void depositar() {
		
	}
		
}