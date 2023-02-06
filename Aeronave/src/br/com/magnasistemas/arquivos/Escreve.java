package br.com.magnasistemas.arquivos;

import java.io.IOException;

public class Escreve {
	public static void main(String[] args) throws IOException {
		Entrada entrada = new Entrada();
		entrada.pegaEntradaETrataDados();
		Saida saida = new Saida();
		saida.escreveCsv();
	}
}
