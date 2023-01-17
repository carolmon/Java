package br.com.magnasistemas.enums;

public enum PosicaoDasAsas {
	ALTA("alta"),BAIXA("baixa"), MEDIA("media"), PARASOL("parasol");
	private final String asaPosicao;
	PosicaoDasAsas(String valorOpcao){
		asaPosicao = valorOpcao;
	}
	//escrever parte q recebe o input do csv para implementação do enum
}
