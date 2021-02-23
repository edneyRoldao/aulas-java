package aula03.modificadores;

public class Pessoa {

	// so pode ser acessado dentro da classe
	private int idade;
	
	// package default (so pode ser acessado por classes que estao mesmo pacote)
	String nome;
	
	// pode ser acessado de qualquer lugar
	public String sobrenome;
	
	
	public void teste() {
		Pessoa p = new Pessoa();
		System.out.println(p.idade);
	}
	
}
