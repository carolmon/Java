package br.com.magnasistemas.arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputAerostastos {
	static String caminhoArquivo = "C:\\dev\\workspaces\\2022_12\\Aeronaves\\src\\br\\com\\magnasistemas\\arquivos\\Aeronaves.csv";
	static String caminhoArquivoRemoto = "C:\\Users\\carol\\eclipse-workspace\\Aeronaves\\src\\br\\com\\magnasistemas\\arquivos\\InputAerostastos.csv";
	protected static String tripulacao = null;
	protected static String motor = null;
	protected static String combustivel = null;
	protected static String alcance = null;
	protected static String porte = null;
	protected static String funcao = null;
	protected static String areaDePouso = null;
	protected static String controlavel = null;
	protected static String cabine = null;
	protected static String rigidez = null;
	protected static String nome = null;

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
	public static String pegaControle() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			controlavel = cols[7];

		}

		arqIn.close();
		return controlavel;

	}
	public static String pegaCabine() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			cabine = cols[8];

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
			rigidez = cols[9];

		}

		arqIn.close();
		return rigidez;

	}
	public static String pegaNome() throws java.io.IOException {

		BufferedReader arqIn = new BufferedReader(
				new InputStreamReader(new FileInputStream(caminhoArquivoRemoto), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
			// use comma as separator
			String[] cols = linha.split(",");
			linha = arqIn.readLine();
			nome = cols[9];

		}

		arqIn.close();
		return nome;

	}
	
	

}
