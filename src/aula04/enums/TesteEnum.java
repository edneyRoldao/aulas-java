package aula04.enums;

public class TesteEnum {

	public static void main(String[] args) {
		
		TipoConta tp = TipoConta.CONTA_POUPANCA;		
		System.out.println(tp.name());
		System.out.println(tp.ordinal());
		
		String tipo = "";
		
		switch (tp) {
			case CONTA_POUPANCA:
				tipo = "tipo p";
			case CONTA_CORRETE:
				tipo = "tipo c";
				break;
			default:
				tipo = "tipo d";				
				break;
		}
		
		System.out.println(tipo);
		
		TipoPedido pp = TipoPedido.CAD;
		System.out.println(pp.getDescricao());
	}
	
}
