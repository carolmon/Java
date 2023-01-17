package br.com.magnasistemas.Criacao;

import java.io.IOException;

import br.com.magnasistemas.arquivos.InputCSV;

public class CriaAeronave extends InputCSV{
	static boolean inputTripulacao;

	public void setInputTripulacao(boolean inputTripulacao) throws IOException {
		this.inputTripulacao = InputCSV.tripulacao();
	}
public static void main(String[] args) throws IOException{
	System.out.println(inputTripulacao);
}
}
