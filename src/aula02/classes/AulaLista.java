package aula02.classes;

public class AulaLista {

	public static void main(String[] args) {
		
		// criacao de um array (lista)
		// o 4 significa quantas posisoes tem o array
		int[] numeros = new int[3]; 
			
		// como adicinar um dado em uma lista
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		
	
		// como ler um dado dentro de uma lista
		System.out.println(numeros[2]);

		
		// erros em tempo de compilacao (o codigo nao compila, nao gera o ponto class)
//		int n = "sdrfg";
		
		// erros em tempo de execucao
		numeros[10] = 30;

	}
	
}
