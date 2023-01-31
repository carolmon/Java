package br.com.magnasistemas.arquivos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import br.com.magnasistemas.aerodinos.Aviao;
import br.com.magnasistemas.aerodinos.DroneAsaFixa;
import br.com.magnasistemas.aerodinos.DroneAsaRodativa;
import br.com.magnasistemas.aerodinos.Helicoptero;
import br.com.magnasistemas.aerodinos.Planador;
import br.com.magnasistemas.aerotastos.Balao;
import br.com.magnasistemas.aerotastos.Dirigivel;

public class OutputCSV {
	public static void main(String[] args) throws IOException {

		OutputStream caminhoSaida = new FileOutputStream(
				"C:\\Users\\carol\\eclipse-workspace\\Aeronaves\\src\\br\\com\\magnasistemas\\arquivos\\saida.csv");
		Writer osw = new OutputStreamWriter(caminhoSaida);
		BufferedWriter bw = new BufferedWriter(osw);

		System.out.println("nome" + CsvAerodino.nomeAerodino);
		System.out.println("classifição" + CsvAerodino.classificacaoMotor);
		System.out.println("funçao" + CsvAerodino.funcao);

		bw.write(Inputs.pegaNome());
		bw.newLine();
		if (Inputs.pegaTipo().contains("aviao")) {
			bw.write(Aviao.classifacaoAsas);
			bw.newLine();
			bw.write(Aviao.classificacaoMotor);
			bw.newLine();
			bw.write(Aviao.aterragem);
			bw.newLine();
			bw.write(Aviao.tipoMotor);
		} else if (Inputs.pegaTipo().contains("helicoptero")) {
			bw.write(Helicoptero.tipoDeRotores);
			bw.newLine();
			bw.write(Helicoptero.classificacaoDeRotores);
			bw.newLine();
			bw.write(Helicoptero.aterragem);
			bw.newLine();
		} else if (Inputs.pegaTipo().contains("drone asa rodatoria")) {
			bw.write(DroneAsaRodativa.tipoDeRotores);
			bw.newLine();
			bw.write(DroneAsaRodativa.classificacaoDeRotores);
			bw.newLine();
			bw.write(DroneAsaRodativa.aterragem);
			bw.newLine();
			bw.write(DroneAsaRodativa.classificacaoMotor);
			bw.newLine();
		}else if (Inputs.pegaTipo().contains("drone asa fixa")) {
			bw.write(DroneAsaFixa.classifacaoAsas);
			bw.newLine();
			bw.write(DroneAsaFixa.aterragem);
			bw.newLine();
			bw.write(DroneAsaFixa.classificacaoMotor);
			bw.newLine();
		}else if (Inputs.pegaTipo().contains("planador")) {
			
			if(Planador.tipoPlanador.contains("Motoplanador")) {
				bw.write(Planador.classificacaoMotor);
				bw.newLine();
			}
			
			bw.write(Planador.classifacaoAsas);
			bw.newLine();
			bw.write(Planador.aterragem);
			bw.newLine();
			
		}else if (Inputs.pegaTipo().contains("balao")) {
		
			bw.write(Balao.tipoBalao);
			bw.newLine();
		}else if (Inputs.pegaTipo().contains("dirigivel")) {
		
			bw.write(Dirigivel.rigidez);
			bw.newLine();
		}
		bw.close();

	}
}
