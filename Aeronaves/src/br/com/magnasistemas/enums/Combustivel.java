package br.com.magnasistemas.enums;

public enum Combustivel {
	FORCA("força"), GAS("GAS"),BATERIA("bateria"), LIQUIDO("liquido");
	
	private final String combustivel;

	Combustivel(String valorOpcao) {
		combustivel = valorOpcao;
	}
}
