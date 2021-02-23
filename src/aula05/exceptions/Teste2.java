package aula05.exceptions;

public class Teste2 {

	public static void main(String[] args) throws Exception {
		System.out.println(stringToNumber("10x"));

		System.out.println(stringToNumber2("10x"));

	}

	// exemplo de unchecked
	public static int stringToNumber(String numberAsString) throws IllegalArgumentException {
		if (numberAsString == null || !numberAsString.matches("\\d+")) {
			throw new IllegalArgumentException("o argumento informado no pode ser nulo e deve ser um numero");
		}
		
		int n = Integer.valueOf(numberAsString);
		return n;
	}

	// exemplo de checked
	public static int stringToNumber2(String numberAsString) throws Exception {
		if (numberAsString == null || !numberAsString.matches("\\d+")) {
			throw new Exception("o argumento informado no pode ser nulo e deve ser um numero");
		}
		
		int n = Integer.valueOf(numberAsString);
		return n;
	}

}

