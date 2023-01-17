package br.com.magnasistemas.enums;

public enum FormadasAsas {
	TRAPEZOIDAL("trapezoidal"),ENFLECHADA("enflechada"), ENFLECHAMENTONEGATIVO("enflechamento negativo"),DELTA("delta"),GEOMETRIAVARIAVEL("geometria vari�vel"),OBLIQUA("obl�qua");
	private final String asaFormato;
	FormadasAsas(String valorOpcao){
		asaFormato = valorOpcao;
	}
}
