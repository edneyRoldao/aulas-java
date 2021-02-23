package aula03.orientacaoObjetos.classesAbstratas;

public class ContaFisica extends Conta {

	private String cpf;

	public ContaFisica(Integer numeroConta, Integer agencia, String endereco, String nomeCliente, String cpf) {
		super(numeroConta, agencia, endereco, nomeCliente);
		this.cpf = cpf;
	}
	
	
	
	@Override
	public void mostrarSaldo() {
		System.out.println("sobrescrita");
		System.out.println("sou uma especializacao do metodo mostrar saldo");
	}
	
	
	@Override
	public void consultarDocumento() {
		System.out.println("Sou um doc do tipo CPF: " + cpf);
	}

	
	// getters and setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
