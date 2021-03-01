package aula06.generics;

public class MeuArray {

	private int size;
	private Object[] itens;
	
	public MeuArray() {
		size = 0;
		itens = new Object[10];
	}
	
	public void add(Object o) {		
		itens[size] = o;
		size++;
		
		if (size > itens.length) 
			aumentarArray();	
	}
	
	public int getSize() {
		return size;
	}
	
	public void printArray() {
		for(int i = 0; i < size; i++)
			System.out.println(itens[i]);
	}
	
	private void aumentarArray() {
		Object[] arrayMaior = new Object[itens.length * 2];
		
		for (int i = 0; i < itens.length; i++) {
			arrayMaior[i] = itens[i];
		}
		
		itens = arrayMaior;
	}
	
}
