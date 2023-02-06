package br.com.magnasistemas.enums;

public enum Rigidez {
	RIGIDO("Rigido")
	,N_RIGIDO("N Rigido")
	,SEMIRIGIDO("semirigido")
	,METAL_CLAD("metal-clad")
	,HIBRIDO("hibrido")
	,N_TEM("não usa rigidez");
	private final String rigidez;

	Rigidez(String valorOpcao) {
		rigidez = valorOpcao;
	}

	public String getRigidez() {
		return rigidez;
	}
}
