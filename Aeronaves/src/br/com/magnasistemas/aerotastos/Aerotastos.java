package br.com.magnasistemas.aerotastos;

import br.com.magnasistemas.aeronave.Aeronave;
import br.com.magnasistemas.arquivos.Inputs;
import java.io.IOException;

import br.com.magnasistemas.aerodinos.Aerodinos;
import br.com.magnasistemas.arquivos.Inputs;
import br.com.magnasistemas.enums.Combustivel;

public class Aerotastos extends Aeronave {
	static boolean inputTripulacao;
	static String trataTripulacao = null;
	static boolean inputMotor;
	static String trataMotor = null;
	static String trataCombustivel = null;
	static String trataAlcance = null;
	static String trataPorte = null;
	static String trataFuncao = null;
	static boolean inputControle;
	static String trataControle = null;
	static boolean inputCabine;
	static String trataCabine = null;

	public static boolean getInputTripulacao() {
		if (trataTripulacao.contains("true")) {
			inputTripulacao = true;
		} else if (trataTripulacao.contains("false")) {
			inputTripulacao = false;
		}
		return inputTripulacao;
	}

	public static boolean getTrataMotor() {
		if (trataTripulacao.contains("true")) {
			inputTripulacao = true;
		} else if (trataTripulacao.contains("false")) {
			inputTripulacao = false;
		}
		return inputTripulacao;
	}

	public static boolean getTrataControle() {
		if (trataControle.contains("true")) {
			inputControle = true;
		} else if (trataControle.contains("false")) {
			inputControle = false;
		}
		return inputTripulacao;
	}

}
