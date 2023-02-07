package br.com.magnasistemas.enums;

public enum Tripulacao {
	NTRIPULADO("não tripulado "),TRIPULACAOUNICA("tripulçao unica "), TRIPULACAODUPLA("tripulçao dupla "), TRIPULACAOPOLI("tripulcao poli ");
	private final String tripulacao;
	Tripulacao(String valorOpcao){
		tripulacao = valorOpcao;
	}
	public String getTripulacao() {
		return "\n" + "TRIPULAÇÃO: "+this.tripulacao;
	}
}
