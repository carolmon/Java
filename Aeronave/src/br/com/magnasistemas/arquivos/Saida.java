package br.com.magnasistemas.arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import br.com.magnasistemas.aerodino.Aviao;

public class Saida extends Entrada {
	public static void escreveCsv() throws IOException {
		// OutputStream caminhoSaida = new
		// FileOutputStream("C:\\Users\\carol\\eclipse-workspace\\Aeronave\\src\\br\\com\\magnasistemas\\arquivos\\Saida.csv");
		File arquivo = new File("Saida.csv");
		FileWriter fw = new FileWriter(arquivo, StandardCharsets.UTF_8);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(registros.toString());
		bw.newLine();
		bw.close();
	}
}
