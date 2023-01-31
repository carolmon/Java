package br.com.magnasistemas.arquivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inputs {
	static String caminhoArquivo = "C:\\dev\\workspaces\\2022_12\\Aeronaves\\src\\br\\com\\magnasistemas\\arquivos\\Aeronaves.csv";
	static String caminhoArquivoRemoto = "C:\\Users\\carol\\eclipse-workspace\\Aeronaves\\src\\br\\com\\magnasistemas\\arquivos\\Inputs.csv";
	protected static String tripulacao = null;
	protected static String motor = null;
	protected static String combustivel = null;
	protected static String alcance = null;
	protected static String porte = null;
	protected static String funcao = null, rotorDeCalda = null , controle = null;
	protected static String fixacaoAsas = null, estabilazador = null, tipoDeMotor = null, aterragem = null,posicaoDasAsas = null;
	protected static String tipoDeRotores = null, classificacaoDeRotores = null, tipoDeAsas = null;
	protected static String formaDasAsas = null, areaDePouso = null, cabine = null;
	protected static String quantidadeMotores = null, quantidadeAsas = null, nome = null, tipo = null, rigidez = null;

	public static String pegaTripulacao() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			tripulacao = cols[0];
			
		}

		arqIn.close();
		return tripulacao;

	}

	public static String pegaMotor() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			motor = cols[1];

		}

		arqIn.close();
		return motor;

	}

	public static String pegaCombustivel() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			combustivel = cols[2];

		}

		arqIn.close();
		return combustivel;

	}

	public static String pegaAlcance() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			alcance = cols[3];

		}

		arqIn.close();
		return alcance;

	}

	public static String pegaPorte() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			porte = cols[4];

		}

		arqIn.close();
		return porte;

	}

	public static String pegaFuncao() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			funcao = cols[5];

		}

		arqIn.close();
		return funcao;

	}

	public static String pegaAreaDePouso() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			areaDePouso = cols[6];

		}

		arqIn.close();
		return areaDePouso;

	}

	public static String pegaQuantidadeMotores() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			quantidadeMotores = cols[7];
		

		}

		arqIn.close();
		return quantidadeMotores;

	}

	public static String pegaQuantidadeAsas() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			quantidadeAsas = cols[8];

		}

		arqIn.close();
		return quantidadeAsas;

	}

	public static String pegaFixacaoAsas() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			fixacaoAsas = cols[9];

		}

		arqIn.close();
		return fixacaoAsas;

	}

	public static String pegaEstabilazador() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			estabilazador = cols[10];

		}

		arqIn.close();
		return estabilazador;

	}

	public static String pegaTipoDeMotor() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			tipoDeMotor = cols[11];

		}

		arqIn.close();
		return tipoDeMotor;

	}

	public static String pegaAterragem() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			aterragem = cols[12];

		}

		arqIn.close();
		return aterragem;

	}

	public static String pegaPosicaoDasAsas() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			posicaoDasAsas = cols[13];

		}

		arqIn.close();
		return posicaoDasAsas;

	}

	public static String pegaFormaDasAsas() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			formaDasAsas = cols[14];

		}

		arqIn.close();
		return formaDasAsas;

	}

	public static String pegaTipoDeAsas() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			tipoDeAsas = cols[15];

		}

		arqIn.close();
		return tipoDeAsas;

	}

	public static String pegaTipoDeRotores() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			tipoDeRotores = cols[16];

		}

		arqIn.close();
		return tipoDeRotores;

	}

	public static String pegaClassificacaoDeRotores() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			classificacaoDeRotores = cols[17];

		}

		arqIn.close();
		return classificacaoDeRotores;

	}
	public static String pegaRotorDeCalda() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			rotorDeCalda = cols[18];

		}

		arqIn.close();
		return rotorDeCalda;
		

	}
	public static String pegaCabine() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			cabine = cols[19];

		}

		arqIn.close();
		return cabine;

	}
	public static String pegaRigidez() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			rigidez = cols[20];

		}

		arqIn.close();
		return rigidez;

	}
	public static String pegaControle() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			controle = cols[21];

		}
		return controle;


	}
	public static String pegaNome() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			nome = cols[22];

		}
		return nome;


	}
	public static String pegaTipo() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();

			tipo = cols[23];
			

		}

		arqIn.close();
		return tipo;
		

	}
	


}

