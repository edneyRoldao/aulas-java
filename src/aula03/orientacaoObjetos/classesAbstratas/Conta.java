package aula03.orientacaoObjetos.classesAbstratas;

/**
 * 01 - uma classe abstrata nao pode ser instanciada, pois ela nao é uma classe concreta
 * 02 - uma classe abstrata pode ter metodos concretos e abstratos
 * 03 - uma classe concreta só pode extender uma única classe abstrata
 * 04 - uma classe filha (especializacao) deve implementar os metodos abstratos da superclass
 * 05 - uma classe pode extender outra que nao seja abstrata
 * 06 - só conseguimos criar um objeto a partir de uma classe concreta
 * 
 */
public abstract class Conta {

	private Integer numeroConta;
	private Integer agencia;
	private String endereco;
	private String nomeCliente;

	public Conta(Integer numeroConta, Integer agencia, String endereco, String nomeCliente) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.endereco = endereco;
		this.nomeCliente = nomeCliente;
	}
	
	
	
	public void mostrarSaldo() {
		System.out.println("implementacao gererica do mostrar saldo");
	}
	

	
	// metodo concreto
	public void consultarEndereco() {
		System.out.println(endereco);
	}
	
	// metodo abstrato
	public abstract void consultarDocumento();

	
	// getters and setters
	public Integer getNumeroConta() {
		return numeroConta;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
}
