package br.com.magnasistemas.enums;

public enum Combustivel {
	AR_QUENTE("Ar quente")
	, HELIO("Helio")
	, AR_QUENTE_HELIO("Ar quente e Helio")
	, FORCA("Força")
	, GASOLINA("Gasolina")
	, ETANOL("Etanol")
	, BATERIA("Bateria")
	, FORCA_E_GASOLINA("Bateria");
	private final String combustivel;

	Combustivel(String valorOpcao) {
		combustivel = valorOpcao;
	}

	public String getTipoGases() {
		return combustivel;
	}
}
