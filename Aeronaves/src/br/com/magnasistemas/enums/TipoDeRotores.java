package br.com.magnasistemas.enums;

public enum TipoDeRotores {
	RIGIDO("rígido"),SEMIRIGIDO("semirígido"), ARTICULADO("articulado");
	private final String rotores;
	TipoDeRotores(String valorOpcao){
		rotores = valorOpcao;
	}
	//escrever parte q recebe o input do csv para implementação do enum
}
