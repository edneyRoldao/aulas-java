package aula06.generics;

public class Teste {

	public static void main(String[] args) {
		Object[] lista = new Object[10];
		
		lista[0] = 10;
		lista[1] = new Pessoa();
		lista[2] = "asdf";
	
		int n = (int) lista[2]; // classCastException
	}
	
}

class Pessoa {
	
}