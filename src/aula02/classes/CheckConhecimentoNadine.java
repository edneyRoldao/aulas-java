package aula02.classes;

public class CheckConhecimentoNadine {
	
	
	public static void main(String[] args) {
		
		// tipos primitivos
		double b = 10.0;
		int a = 10;
		String s = new String("sdafgasdf");
		
		
		// ponteiro
		// referencia em memoria
		Pessoa p = new Pessoa();
		p.genero = 'F';
		p.idade = 18;
		
		Pessoa p2 = new Pessoa();
		p.genero = 'F';
		p.idade = 18;
		
		if (p == p2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");			
		}
		
		
		
		System.out.println("###################################");
		
		Pessoa p3 = new Pessoa();
		p3.genero = 'F';
		p3.idade = 18;
		
		Pessoa p4 = p3;

		
		if (p3 == p4) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");			
		}
		
		
		System.out.println("###################################");
		System.out.println(p3.idade);
		System.out.println(p4.idade);

		p3.idade = 29;
		p4.idade = 30;
		
		System.out.println("###################################");
		System.out.println(p3.idade);
		System.out.println(p4.idade);
		
		p4 = new Pessoa();
		p4.idade = 40;
		
		System.out.println("###################################");
		System.out.println(p3.idade);
		System.out.println(p4.idade);

		p3 = new Pessoa();
		p3.idade = 5;
		p4 = new Pessoa();
		p4.idade = 10;
		
		
		Pessoa[] pessoasOriginal = new Pessoa[2];
		pessoasOriginal[0] = p3;
		pessoasOriginal[1] = p4;
		
		Pessoa[] pessoasCopia = pessoasOriginal; 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Pessoa p10 = pessoasCopia[0];
		p10.idade = 70;
		
		
		
		
		System.out.println("#############################");
		System.out.println("#############################");
		System.out.println(pessoasOriginal[0].idade);
		
		
		
		Pessoa p5 = copiar(p4);
		
		if (p5 == p4) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");			
		}

		
	}
	
	public static Pessoa copiar(Pessoa pessoa) {
		Pessoa pComNovaReferencia = new Pessoa();
		pComNovaReferencia.genero = pessoa.genero;
		pComNovaReferencia.idade = pessoa.idade;
		return pComNovaReferencia;
	}
		

}


class Pessoa {
	int idade;
	char genero;
}
