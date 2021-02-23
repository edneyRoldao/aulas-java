package aula03.orientacaoObjetos.interfaces;

public class Teste {

	public static void main(String[] args) {
		
		String cliente = "itau";
		ContaBancariaService contaService;
		
		if (cliente.equalsIgnoreCase("brasil")) {
			contaService = new BancoBrasilService();
			
		} else if(cliente.equalsIgnoreCase("itau")) {
			contaService = new BancoItauService();
			
		} else {
			throw new IllegalArgumentException("o cliente no foi especificado");
		}
		
		Conta c1 = new Conta(contaService);
		Conta c2 = new Conta(contaService);
		
		c1.depositar(100.0f);
		c1.consultarSaldo();
		c1.transferir(c2, 50.0f);
		
		c1.consultarSaldo();
		c2.consultarSaldo();
		
		System.out.println("------------------------------------------");
		c1.depositar(10.0f);
		c1.consultarSaldo();
	}
	
}

