package src.br.com.magnasistemas.arquivos;

import java.io.IOException;

public class Escreve {
public  void escreve() throws IOException {
	Entrada entrada = new Entrada();
	entrada.pegaEntradaETrataDados();
	Saida saida = new Saida();
	saida.escreveCsv();
}
}
