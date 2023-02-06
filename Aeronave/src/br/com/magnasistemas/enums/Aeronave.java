package br.com.magnasistemas.enums;

public enum Aeronave {
	AVIAO("Avião")
	, BALAO("Balão")
	, DIRIGIVEL("Dirigivel")
	, HELICOPTERO("Helicoptero")
	, DRONE_ASA_FIXA("Drone Asa Fixa")
	, DRONE_ASA_ROTATIVA("Drone Asa Rotativa")
	, PLANADOR("Planador")
	, MOTOPLANADOR("MotoPlanafor")
	, HIBRIDO("MotoPlanafor");

	private final String Aeronave;

	Aeronave(String valorOpcao) {
		Aeronave = valorOpcao;
	}

	public String getTipoAeronove() {
		return Aeronave;
	}
}
