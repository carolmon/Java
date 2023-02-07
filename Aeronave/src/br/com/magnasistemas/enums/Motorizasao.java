package br.com.magnasistemas.enums;

public enum Motorizasao {
	NMOTORIZADO("não motorizado "), MOTORPISTAO("motor pistão "), MOTORROTATORIO("motor rotatorio "),
	MOTORJATO("motor a jato "), MOTORJATOPISTAO("motor pistão ou jato "),
	MOTORPISTAOROTATORIO("motor a pistão e motor rotatorio ");

	private final String motorizao;

	Motorizasao(String valorOpcao) {
		motorizao = valorOpcao;
	}
	public String getMotorizasao() {
		return "\n" + "MOTORIÇASÃO: "+this.motorizao;
	}
}
