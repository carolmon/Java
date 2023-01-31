package br.com.magnasistemas.aeronave;

import java.io.IOException;

import br.com.magnasistemas.Criacao.CriaAerodino;
import br.com.magnasistemas.arquivos.Inputs;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.tipoAsa;

public abstract class Aeronave {

	// tripula��o
	public static  String tripulacao;

	public String getTripulacao() {
		return tripulacao;
	}

	public  void setTripulacao() throws IOException {
		this.tripulacao = Inputs.pegaTripulacao();
	}

	// motor
	public String motor;

	public String getMotor() {
		return motor;
	}

	public void setMotor() throws IOException {
		this.motor = Inputs.pegaMotor();
	}

	// porte
	public String porte;

	public String getPorte() {
		return porte;
	}

	public void setPorte() throws IOException {
		this.porte = Inputs.pegaPorte();
	}

	// fun��o
	public String funcao;

	public String getFuncao() throws IOException {
		return funcao = Inputs.pegaFuncao();
	}

	public void setFuncao(String funcao) throws IOException {
		this.funcao = Inputs.pegaFuncao();
	}

	// combustivel
	public String combustivel;

	public Combustivel getCombustivel() throws IOException {
		if (Inputs.pegaCombustivel().contains("ar quante") || Inputs.pegaCombustivel().contains("helio")
				|| Inputs.pegaCombustivel().contains("hidrogenio")
				|| Inputs.pegaCombustivel().contains("amonia")
				|| Inputs.pegaCombustivel().contains("carvao")
				|| Inputs.pegaCombustivel().contains("hibrido")) {
			return Combustivel.GAS;
		} else if (Inputs.pegaCombustivel().contains("gasolina")
				|| Inputs.pegaCombustivel().contains("etanol")) {
			return Combustivel.LIQUIDO;
		} else if (Inputs.pegaCombustivel().contains("bateria")) {
			return Combustivel.BATERIA;
		} else if (Inputs.pegaCombustivel().contains("força")) {
			return Combustivel.FORCA;
		}
		return null;

	}

	public void setCombustivel() throws IOException {
		this.combustivel = Inputs.pegaCombustivel();
	}

	// area de pouso
	public String areaDePouso;

	public String getAreaDePouso() {
		return areaDePouso;
	}

	public void setAreaDePouso() throws IOException {
		this.areaDePouso = Inputs.pegaAreaDePouso();
	}

	public String alcance;

	public String getAlcance() {
		return areaDePouso;
	}

	public void setAlcance() throws IOException {
		this.areaDePouso = Inputs.pegaAlcance();
	}

	public static void decolagem() {

	}

	public static void pousa() {

	}

	public static void abastace() {
	}

}
