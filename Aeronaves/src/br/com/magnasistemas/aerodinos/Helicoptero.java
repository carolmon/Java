package br.com.magnasistemas.aerodinos;

import java.io.IOException;

import br.com.magnasistemas.arquivos.Inputs;
import br.com.magnasistemas.interfaces.Pecas;

public class Helicoptero extends AsaRodatoria {
	
	public static  String classificacaoDeRotores = null;
	public static String tipoDeRotores = null;
	public static String aterragem = null;
	public static void main(String[] args) throws IOException {
		if (Integer.parseInt(pegaQuantidadeMotores()) > 4) {
			System.out.println("quantidade de rotores ultapassada");
		}
		tipoDeRotores = Inputs.pegaTipoDeRotores();
		classificacaoDeRotores = Inputs.pegaClassificacaoDeRotores();
		aterragem = Pecas.aterragem[Integer.parseInt(pegaAterragem())];

		
	}
}
