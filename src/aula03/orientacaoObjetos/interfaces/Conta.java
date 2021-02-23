package aula03.orientacaoObjetos.interfaces;

public class Conta {

	private long id;
	private String nomeCliente;
	private float saldo;
	
	// usando composicao
	private ContaBancariaService contaService;
	
	public Conta(ContaBancariaService contaService) {
		this.contaService = contaService;
	}
	
	public float sacar() {
		return contaService.sacar(this, id);
	}
	
	public void depositar(float valorTransferir) {
		contaService.depositar(this, valorTransferir);
	}
	
	public boolean transferir(Conta destino, float valorTransferir) {
		return contaService.transferir(this, destino, valorTransferir);
	}
	
	public void consultarSaldo() {
		contaService.consultar(this);
	}
	

	// getters and setters
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
