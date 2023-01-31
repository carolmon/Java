package br.com.magnasistemas.aerodinos;

import java.io.IOException;

import br.com.magnasistemas.Criacao.CriaAerodino;

public class AsaRodatoria extends CriaAerodino{
	public static void main(String[] args) throws IOException {
		getTrataPorte();
		getTrataAlcance();
		getTrataFuncao();
		getInputTripulacao();
		getTrataCombustivel();
		getTrataMotor();
		getTrataRotorDeCalda();
		pegaQuantidadeMotores();
	}

}
