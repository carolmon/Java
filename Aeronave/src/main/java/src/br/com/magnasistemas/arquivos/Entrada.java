package src.br.com.magnasistemas.arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import src.br.com.magnasistemas.enums.Aeronave;
import src.br.com.magnasistemas.enums.Combustivel;
import src.br.com.magnasistemas.enums.Rigidez;
import src.br.com.magnasistemas.enums.TipoAeronave;

public class Entrada {
	protected static String impulsor;
	protected static Combustivel combustivel;
	protected static String porte;
	protected static String funcao;
	protected static String nome;
	protected static Rigidez rigidez;
	protected static String quantiadeAsas;
	protected static String quantidadeMotores;
	protected static Aeronave tipoDeAeronave;
	static String caminhoArquivo = "C:\\dev\\workspaces\\2022_12\\Aeronave\\src\\test\\resources\\Entrada.csv";
	static String caminhoArquivoRemoto = "C:\\Users\\carol\\eclipse-workspace\\Aeronave\\src\\br\\com\\magnasistemas\\arquivos\\Entrada.csv";
	static List<Object> registros = new ArrayList<>();
	
	public void  pegaEntradaETrataDados() throws java.io.IOException {
			
		

		BufferedReader arqIn = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoArquivo), "UTF-8"));
		String linha = arqIn.readLine();
		linha = arqIn.readLine();
		while (linha != null) {
			// use comma as separator
			
			String[] campo = linha.split(",");
			impulsor = campo[0].toUpperCase().trim().replace(" ", "_");
			combustivel = Combustivel.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
			porte = campo[2].toUpperCase().trim().replace(" ", "_");
			funcao = campo[3].toUpperCase().trim().replace(" ", "_");
			nome = campo[4].toUpperCase().trim().replace(" ", "_");
			rigidez = Rigidez.valueOf(campo[5].toUpperCase().trim().replace(" ", "_"));
			quantiadeAsas =campo[6].toUpperCase().trim().replace(" ", "_") ;
			quantidadeMotores =campo[7].toUpperCase().trim().replace(" ", "_") ;
			tipoDeAeronave = Aeronave.valueOf(campo[8].toUpperCase().trim().replace(" ", "_"));
			Tratamento tramento = new Tratamento();
			tramento.tratamento();
			linha = arqIn.readLine();
		}

		arqIn.close();

	}
	
}
