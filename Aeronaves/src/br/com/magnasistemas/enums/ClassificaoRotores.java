package br.com.magnasistemas.enums;

public enum ClassificaoRotores {
	SIMPLES("simpes"),COAXIAIS("coaxiais"), LADOALADO("lado a lado"), TANDEM("tandem");
	private final String classificacao;
	ClassificaoRotores(String valorOpcao){
		classificacao = valorOpcao;
	}
	//escrever parte q recebe o input do csv para implementação do enum
}
