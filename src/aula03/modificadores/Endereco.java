package aula03.modificadores;

public class Endereco {
	
	private String cep;
	private String numero;
	private String logradouro;
	
	// constructors
	public Endereco() {}

	public Endereco(String cep, String numero, String logradouro) {
		this.cep = cep;
		this.numero = numero;
		this.logradouro = logradouro;
	}

	// getters and setters
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
			
}
