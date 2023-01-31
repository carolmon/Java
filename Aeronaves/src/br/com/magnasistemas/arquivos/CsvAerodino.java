package br.com.magnasistemas.arquivos;

import java.io.IOException;

import br.com.magnasistemas.aerodinos.Aviao;
import br.com.magnasistemas.aerodinos.DroneAsaFixa;
import br.com.magnasistemas.aerodinos.DroneAsaRodativa;
import br.com.magnasistemas.aerodinos.Helicoptero;
import br.com.magnasistemas.aerodinos.Planador;

public class CsvAerodino {
	static String nomeAerodino;
	static String classificacaoMotor;
	static String classifacaoAsas;
	static String funcao;

	public  void CsvAerodino() throws IOException {
		this.nomeAerodino = Inputs.pegaNome();
		this.funcao = Inputs.pegaFuncao();
		if (Inputs.pegaTipo().contains("avião")) {
			this.classificacaoMotor = Aviao.classificacaoMotor;
			this.classifacaoAsas = Aviao.classifacaoAsas;
		} else if (Inputs.pegaTipo().contains("planador")) {
			this.classifacaoAsas = Planador.classifacaoAsas;
		} else if (Inputs.pegaTipo().contains("motoplanador")) {
			this.classificacaoMotor = Planador.classificacaoMotor;
			this.classifacaoAsas = Planador.classifacaoAsas;
		} else if (Inputs.pegaTipo().contains("drone asa fixa")) {
			this.classifacaoAsas = DroneAsaFixa.classifacaoAsas;
			this.classificacaoMotor = DroneAsaFixa.classificacaoMotor;
		} else if (Inputs.pegaTipo().contains("drone asa rodatoria")) {
			this.classifacaoAsas = DroneAsaRodativa.classificacaoMotor;
		} else if (Inputs.pegaTipo().contains("helicoptero")) {
			this.classifacaoAsas = Helicoptero.classificacaoDeRotores;
			this.classificacaoMotor = Helicoptero.tipoDeRotores;

		}
		nomeAerodino = Inputs.pegaNome();
		funcao = Inputs.pegaFuncao();

	}
//	public static void main(String[] args) {
//		System.out.println(nomeAerodino);
//	}
}