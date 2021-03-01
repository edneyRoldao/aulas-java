package aula06.generics;

import java.util.ArrayList;
import java.util.List;

public class Teste2 {

	public static void main(String[] args) {
		
		MeuArray list = new MeuArray();
		
		list.add("dfsgasd");
		list.add(10);
		list.add(true);
		list.add(new Animal());
		
		list.printArray();
		
		MeuArrayV2<String> list2 = new MeuArrayV2<String>();
		list2.add("");
		
		List<String> list3 = new ArrayList<String>();
	}
	
}

class Animal {
	
}