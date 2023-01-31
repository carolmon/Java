package br.com.magnasistemas.aerodinos;

import java.io.IOException;

import br.com.magnasistemas.aeronave.Aeronave;
import br.com.magnasistemas.arquivos.Inputs;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.tipoAsa;

public class Aerodinos extends Aeronave {

	public tipoAsa getTipoDeAsa() throws IOException {
		if (Inputs.pegaTipoDeAsas().contains("hibrida")) {
			return tipoAsa.HIBRIDA;
		} else if (Inputs.pegaTipoDeAsas().contains("fixa")) {
			return tipoAsa.FIXA;
		} else if (Inputs.pegaTipoDeAsas().contains("rodativa")) {
			return tipoAsa.RODATIVA;
		} else {
			// assa invalida
		}
		return null;
		
	}
	
}
