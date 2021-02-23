package aula02.classes;

public class MetodosClassesWrapper {
	
	public static void main(String[] args) {
		
		// conversoes com as classes wrapper				
		double d = 10.0;
		
		String numberAsString = Double.toString(d);
		System.out.println(numberAsString);
		
		Double d2 = 20.0;
		System.out.println(d2.toString());
	
		long l = 10;
		int i = (int) l;
		imprimirNumero(i);

		String s10 = "250";
		int n10 = Integer.valueOf(s10);
		System.out.println(n10);
	}
	
	public static void imprimirNumero(int n) {
		System.out.println(n);
	}
	

}

