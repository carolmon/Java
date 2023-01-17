package br.com.magnasistemas.enums;

public enum tipoAsa {
FIXA("fixa"),RODATIVA("rodativa"), HIBRIDA("hibrida");
	private final String asa;
	tipoAsa(String valorOpcao){
		asa = valorOpcao;
	}
}
