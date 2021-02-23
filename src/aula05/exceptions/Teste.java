package aula05.exceptions;

public class Teste {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();

		try {
			int i = Integer.valueOf("10x");
			System.out.println(p.nome.toUpperCase());
			
			System.out.println("nao pode exibir");
			
		} catch (NullPointerException e) {
			System.out.println("cai no nullPointer");			
		} catch (NumberFormatException e) {
			System.out.println("cai no numberFormat");
		} finally {
			
		}
		
		System.out.println(p);

		Pessoa p2 = null;
		System.out.println(p2.nome);
		
	}
	
}


class Pessoa {
	String nome;
	
	void imprimir() {}
}
