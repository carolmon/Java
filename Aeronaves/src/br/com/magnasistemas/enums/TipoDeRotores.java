package br.com.magnasistemas.enums;

public enum TipoDeRotores {
	RIGIDO("r�gido"),SEMIRIGIDO("semir�gido"), ARTICULADO("articulado");
	private final String rotores;
	TipoDeRotores(String valorOpcao){
		rotores = valorOpcao;
	}
	//escrever parte q recebe o input do csv para implementa��o do enum
}
