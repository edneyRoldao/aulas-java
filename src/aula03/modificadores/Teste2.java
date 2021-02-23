package aula03.modificadores;

public class Teste2 {
	
	public static void main(String[] args) {
		Endereco e = new Endereco("0234303", "472", "rua mere marie");
		
		ContaBancaria cb1 = new ContaBancaria(1);
		cb1.setSaldo(10.00);
		cb1.setNomeCliente("Edney");
		cb1.setEndereco(e);
		
		System.out.println(cb1.getNomeCliente());
		System.out.println(cb1.getId());
		System.out.println(cb1.getEndereco().getLogradouro());		
	}
	
	

}
