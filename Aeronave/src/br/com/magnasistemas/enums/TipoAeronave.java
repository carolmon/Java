package br.com.magnasistemas.enums;

public enum TipoAeronave {
	AERODINO("aerodino "), AEROSTATOS("aerostatos ");

	private final String tipoAeronave;

	TipoAeronave(String valorOpcao) {
		tipoAeronave = valorOpcao;
	}

	public String getTipoAeronove() {
		return tipoAeronave;
	}
}
