package br.com.magnasistemas.aerodinos;

import java.io.IOException;

import br.com.magnasistemas.arquivos.Inputs;
import br.com.magnasistemas.interfaces.Pecas;

public class DroneAsaRodativa extends AsaRodatoria {
	public static String classificacaoMotor = null;

	public static void main(String[] args) throws IOException {

		if (Integer.parseInt(pegaQuantidadeMotores()) > 1) {
			classificacaoMotor = "rotor unico";
		} else if (Integer.parseInt(pegaQuantidadeMotores()) == 3) {
			classificacaoMotor = "tricóptro";
		} else if (Integer.parseInt(pegaQuantidadeMotores()) == 4) {
			classificacaoMotor = "quadcótero";
		}
		tipoDeRotores = Inputs.pegaTipoDeRotores();
		classificacaoDeRotores = Inputs.pegaClassificacaoDeRotores();
		aterragem = Pecas.aterragem[Integer.parseInt(pegaAterragem())];

	}
}
