package br.com.magnasistemas.Criacao;

import java.io.IOException;

import br.com.magnasistemas.aerodinos.Aerodinos;
import br.com.magnasistemas.arquivos.Inputs;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.tipoAsa;

public class CriaAerodino extends Inputs {

	static boolean inputTripulacao;
	static String trataTripulacao = null;
	static boolean inputMotor;
	static String trataMotor = null;
	static String trataCombustivel = null;
	static String trataAlcance = null;
	static String trataPorte = null;
	static String trataFuncao = null;
	static String trataFixacaoAsas = null;
	static boolean inputFixacaoAsas;
	static String trataRotorDeCalda = null;
	static boolean inputRotorDeCalda;
	static String trataEstabilizador = null;
	static String trataTipoDeMotor = null;
	static String trataAterragem = null;
	static String trataPosicaoDasAsas = null;
	static String trataFormaDasAsas = null;
	static String trataTipoDasAsas = null;
	static String trataTipoDeRotores = null;
	static String trataClassificacaoDeRotores = null;
	static Integer trataQuantidadeMotores = 0;
	static Integer trataQuantidadeAsas = 0;

	public static boolean getInputTripulacao() throws IOException {
		if (tripulacao.contains("true")) {
			inputTripulacao = true;
		} else if (tripulacao.contains("false")) {
			inputTripulacao = false;
		}
		return inputTripulacao;
	}

	public static boolean getTrataMotor() {
		if (motor.contains("true")) {
			inputTripulacao = true;
		} else if (motor.contains("false")) {
			inputTripulacao = false;
		}
		return inputTripulacao;
	}

	public static void getTrataCombustivel() throws IOException {

		trataCombustivel = pegaCombustivel();

	}

	public static String getTrataAlcance() throws IOException {
		trataAlcance = pegaAlcance();
		return trataAlcance;
	}

	public static void getTrataPorte() throws IOException {
		trataPorte = pegaPorte();
	}

	public static void getTrataFuncao() throws IOException {
		trataFuncao = pegaFuncao();

	}

	public static boolean getTrataRotorDeCalda() {
		if (rotorDeCalda.contains("sem rotor de calda")) {
			inputRotorDeCalda = true;
		} else if (rotorDeCalda.contains("com rotor de calda")) {
			inputRotorDeCalda = false;
		}
		return inputRotorDeCalda;

	}

	public static void getTrataEstabilizador() {
		if (estabilazador.isEmpty()) {
			// verificar tipo de asa

		}

	}

	public static void getTrataAterragem() throws IOException {
		trataAterragem = pegaAterragem();

	}

	public static void getTrataTipoDasAsas() throws IOException {
		if (tipoAsa.FIXA != null) {
			trataTipoDasAsas = "Fixa";
			trataPosicaoDasAsas = pegaPosicaoDasAsas();
			trataEstabilizador = pegaEstabilazador();
			trataQuantidadeMotores = Integer.parseInt(pegaQuantidadeMotores());
			trataFixacaoAsas = pegaFixacaoAsas();
			if (Combustivel.FORCA != null) {
				trataQuantidadeMotores = 0;
			}
			if (Combustivel.LIQUIDO != null) {
				trataTipoDeMotor = pegaTipoDeMotor();
			}

		} else if (tipoAsa.RODATIVA != null) {
			trataTipoDeRotores = pegaTipoDeRotores();
			trataClassificacaoDeRotores = pegaClassificacaoDeRotores();
			trataQuantidadeMotores = Integer.parseInt(pegaQuantidadeMotores());
			if (Combustivel.FORCA != null) {
				// escreve na saida, motor invalido
			}

		} else if (tipoAsa.HIBRIDA != null) {
			trataTipoDasAsas = pegaTipoDeAsas();
			trataPosicaoDasAsas = pegaPosicaoDasAsas();
			trataAterragem = pegaAterragem();
			trataEstabilizador = pegaEstabilazador();
			trataTipoDeRotores = pegaTipoDeRotores();
			trataClassificacaoDeRotores = pegaClassificacaoDeRotores();
			trataQuantidadeMotores = Integer.parseInt(pegaQuantidadeMotores());
			if (Combustivel.FORCA != null) {
				// escreve na saida, motor invalido
			}
		}

	}

	
}
