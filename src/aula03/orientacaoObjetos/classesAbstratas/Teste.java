package aula03.orientacaoObjetos.classesAbstratas;

public class Teste {

	public static void main(String[] args) {
		
		Conta c = new ContaFisica(25672, 6804, "rua mere", "edney", "300");
		c.consultarDocumento();		
		System.out.println(c.getAgencia());
		
		// como acessar o metodo do filho quando a referencia e do pai
		String documento = ((ContaFisica) c).getCpf();
		System.out.println(documento);

		System.out.println(c instanceof Conta);
		System.out.println(c instanceof ContaFisica);
		
		c.mostrarSaldo();
	}
	
}
