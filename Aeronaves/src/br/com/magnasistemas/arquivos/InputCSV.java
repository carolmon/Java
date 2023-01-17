package br.com.magnasistemas.arquivos;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputCSV {
	
	public static void tripulacao() throws java.io.IOException{
		String caminhoArquivo = "C:\\dev\\workspaces\\2022_12\\Aeronaves\\src\\br\\com\\magnasistemas\\arquivos\\Aeronaves.csv";
		BufferedReader arqIn = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoArquivo), "UTF-8"));
		String linha = arqIn.readLine();

		while (linha != null) {
		    // use comma as separator
		    String[] cols = linha.split(",");
		    System.out.println("Tripulação= " + cols[0] + " , Motor=" + cols[1]);
		    linha = arqIn.readLine();
		    boolean tripulacao = cols[0] != null ;
		}
		
		
		
		arqIn.close();
	}
}
