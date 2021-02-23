package aula02.classes;

import java.util.List;

public class Teste2 {
	
	List<String> lista;
	
	// uma classe pertence a um pacote
	// uma classes possui imports de outras classes
	// uma classe public tem que ter o nome do arquivo igual da classe
	// uma classe java possuí: variaveis, metodos e construtores
	// toda classe possui um construtor padrao
	// uma classe pode ter vários construtores

	
	
	public static void main(String[] args) {
		
		// instanciando um objeto (criando um objeto)
		Conta conta = new Conta();
		
		// adicionando dados no objeto apos a criacao do mesmo
		conta.idConta = 1;
		conta.saldo = 250.45;
		conta.nomeCliente = "edney";		
		System.out.println(conta.idConta);
		System.out.println(conta.saldo);
		System.out.println(conta.nomeCliente);		
		
		System.out.println("-------------------------------------------");
		
		Conta conta2 = new Conta(2, 1000.00, "Joao");
		
		System.out.println(conta2.idConta);
		System.out.println(conta2.saldo);
		System.out.println(conta2.nomeCliente);		

		System.out.println("-------------------------------------------");

		CalculoRendimento calc = new CalculoRendimento(45.00);
				
	}
	
}

class Conta {
	int idConta;
	double saldo;
	String nomeCliente;
	
	// (PADRAO) criando um construtor padrao de forma explicita
	public Conta() {}
	
	// criando nosso proprio construtor
	public Conta(int id, double valor, String nome) {
		idConta = id;
		saldo = valor;
		nomeCliente = nome;
	}
		
}



class CalculoRendimento {
	
	double saldoCliente;
	
	
	// esse classe nao funciona se nao tiver o saldo do cliente
	// ela nao consegue obter esta informacao sozinha, ela precisa ser setada por quem instancia	
	public CalculoRendimento(double saldo) {
		saldoCliente = saldo;
	}
	
	
	
	
	void calcularRendimentoAnual() {
		System.out.println(saldoCliente);
	}

	void calcularRendimentoMensal() {
		System.out.println(saldoCliente);
	}
	
	void calcularImpostoA() {
		System.out.println(saldoCliente);
	}
	

	void calcularImpostoB() {
		System.out.println(saldoCliente);
	}

	void calcularImpostoC() {
		System.out.println(saldoCliente);		
	}

}

class Animal {
	public Animal(int id) {}
}

