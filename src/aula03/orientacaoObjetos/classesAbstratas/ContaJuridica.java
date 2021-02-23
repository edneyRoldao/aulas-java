package aula03.orientacaoObjetos.classesAbstratas;

public class ContaJuridica extends Conta {

	private String cnpj;
	
	public ContaJuridica(Integer numeroConta, Integer agencia, String endereco, String nomeCliente, String doc) {
		super(numeroConta, agencia, endereco, nomeCliente);
		cnpj = doc;
	}
	
	@Override
	public void consultarDocumento() {
		System.out.println("Sou um doc do tipo CNPJ: " + cnpj);
	}

	
	// getters and setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
		
}
