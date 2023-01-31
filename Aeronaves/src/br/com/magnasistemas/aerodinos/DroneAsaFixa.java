package br.com.magnasistemas.aerodinos;

import java.io.IOException;

import br.com.magnasistemas.interfaces.Pecas;

public class DroneAsaFixa extends AsaFixa {
	public static String classifacaoAsas = null;
	public static String classificacaoMotor = null;

	public static void main(String[] args) throws IOException {

		if (Integer.parseInt(pegaQuantidadeMotores()) > 1 && Integer.parseInt(pegaQuantidadeAsas()) > 1) {
			System.out.println("ñ pode ter mais de uma asa");
		} else {
			classificacaoMotor = "monomotor";
			classifacaoAsas = "monoplano";
			aterragem = Pecas.aterragem[Integer.parseInt(pegaAterragem())];
		}

	}
}
