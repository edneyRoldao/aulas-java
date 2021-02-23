package aula02.classes;

public class AulaArray {
	
	
	
	public static void main(String[] args) {
		
		String[] lista = new String[11];
		lista[0] = "teste1";
		lista[1] = "teste1";
		
		Conta10[] lista2 = new Conta10[10];
		
		// erros em tempo de compilacao
//		String lista3 = new String[10];
		
		
		// erros em tempo de execucao
//		lista2[100] = new Conta10();
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		for (String el : lista) {
			System.out.println(el);
		}		
		
	}
	

}

class Conta10 {
	
}
