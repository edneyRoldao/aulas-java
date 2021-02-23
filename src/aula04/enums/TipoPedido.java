package aula04.enums;

public enum TipoPedido {
	CAD("EM CADASTRAMENTO"),
	FEC("FINALIZADO"),
	REJ("REFEITADO"),
	CAN("CANCELADO");

	private final String descricao;

	TipoPedido(String descricao) {
	    this.descricao = descricao;
	}
	
	public String getDescricao( ) {
		return descricao;
	}

}
