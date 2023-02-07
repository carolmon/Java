package src.br.com.magnasistemas.arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Saida extends Entrada {
	public static void escreveCsv() throws IOException {
	
		File arquivo = new File("C:\\dev\\workspaces\\2022_12\\Aeronave\\src\\main\\resources\\Saida.csv");
		FileWriter fw = new FileWriter(arquivo, StandardCharsets.UTF_8);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(registros.toString());
		bw.newLine();
		bw.close();
	}
}
