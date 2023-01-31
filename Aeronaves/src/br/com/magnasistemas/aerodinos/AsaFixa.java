package br.com.magnasistemas.aerodinos;

import java.io.IOException;

import br.com.magnasistemas.Criacao.CriaAerodino;
import br.com.magnasistemas.arquivos.Inputs;
import br.com.magnasistemas.enums.Combustivel;

public class AsaFixa extends CriaAerodino {
	public static void main(String[] args) throws IOException {
		getTrataPorte();
		getTrataAlcance();
		getTrataFuncao();
		getInputTripulacao();
		getTrataAterragem();
		getTrataCombustivel();
		getTrataMotor();
		
	}
}
