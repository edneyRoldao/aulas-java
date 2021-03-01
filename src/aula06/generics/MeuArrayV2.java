package aula06.generics;

public class MeuArrayV2<T> {
	
	private int size;
	private T[] itens;
	
	@SuppressWarnings("unchecked")
	public MeuArrayV2() {
		size = 0;
		itens = (T[]) new Object[10];
	}
	
	public void add(T o) {		
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
		@SuppressWarnings("unchecked")
		T[] arrayMaior = (T[]) new Object[itens.length * 2];
		
		for (int i = 0; i < itens.length; i++) {
			arrayMaior[i] = itens[i];
		}
		
		itens = arrayMaior;
	}

}
