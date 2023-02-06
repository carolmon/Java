package br.com.magnasistemas.enums;

public enum TipoDeAsa {
	FIXA("asa fixa "), ROTATIVA("asa rotativa "), HIBRIDA("asa hibrida ");

	private final String tipoDeAsa;

	TipoDeAsa(String valorOpcao) {
		tipoDeAsa = valorOpcao;

	}

	public String getTipoDeAsa() {
		return tipoDeAsa;
	}
}
