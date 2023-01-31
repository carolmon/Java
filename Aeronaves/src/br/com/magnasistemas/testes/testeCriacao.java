package br.com.magnasistemas.testes;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import br.com.magnasistemas.Criacao.CriaAerodino;
import br.com.magnasistemas.aerodinos.Aerodinos;
import br.com.magnasistemas.aerodinos.AsaFixa;
import br.com.magnasistemas.aerodinos.AsaRodatoria;
import br.com.magnasistemas.aerodinos.Aviao;
import br.com.magnasistemas.aerodinos.DroneAsaFixa;
import br.com.magnasistemas.aerodinos.DroneAsaRodativa;
import br.com.magnasistemas.aerodinos.Helicoptero;
import br.com.magnasistemas.aerodinos.Hibrido;
import br.com.magnasistemas.aerodinos.Planador;
import br.com.magnasistemas.aeronave.Aeronave;
import br.com.magnasistemas.aerotastos.Aerotastos;
import br.com.magnasistemas.aerotastos.Balao;
import br.com.magnasistemas.aerotastos.Dirigivel;
import br.com.magnasistemas.arquivos.CsvAerodino;
import br.com.magnasistemas.arquivos.Inputs;
import br.com.magnasistemas.arquivos.OutputCSV;
import br.com.magnasistemas.enums.Combustivel;

class testeCriacao {
	@org.junit.jupiter.api.Test
	public void testaCriacao() throws IOException {
		// Aeronave
		Aeronave.pousa();
		Aeronave.abastace();
		Aeronave.decolagem();
		//CriaAerodino.getInputTripulacao();

		// Aerostastos
		new Aerotastos();

		Aerotastos aerotastos = new Aerotastos();

//		Aerotastos.pegaTripulacao();

		new Balao();
		Balao.main(null);
		new Dirigivel();
		Dirigivel.main(null);
		Dirigivel dirigivel = new Dirigivel();
		dirigivel.getAreaDePouso();
		dirigivel.getAlcance();
		// dirigivel.
		// aerodino
		new Aerodinos();

		Aerodinos aerodinos = new Aerodinos();
		aerodinos.getTipoDeAsa();
		//
		new AsaFixa();
		//
		AsaFixa asaFixa = new AsaFixa();
		//
		new AsaRodatoria();
		//
		new Hibrido();

		new Aviao();
		// input Aviao
		Aviao.main(null);
		Aviao.pegaMotor();
		Aviao.pegaTripulacao();
		Aviao.pegaAlcance();
		Aviao.pegaAterragem();
		Aviao.pegaClassificacaoDeRotores();
		Aviao.pegaCombustivel();
		Aviao.pegaEstabilazador();
		Aviao.pegaFixacaoAsas();
		Aviao.pegaFormaDasAsas();
		Aviao.pegaFuncao();
		Aviao.pegaPorte();
		Aviao.pegaPosicaoDasAsas();
		Aviao.pegaQuantidadeAsas();
		Aviao.pegaRotorDeCalda();
		Aviao.pegaTipoDeAsas();
		Aviao.pegaTipoDeMotor();
		Aviao.pegaTipoDeRotores();
		Aviao.pegaAreaDePouso();
		// Cria aviao
		Aviao.getTrataAterragem();
		Aviao.getTrataAlcance();
		Aviao.getTrataCombustivel();
		Aviao.getTrataEstabilizador();
		Aviao.getTrataFuncao();
		Aviao.getTrataMotor();
		Aviao.getTrataPorte();
		Aviao.getTrataRotorDeCalda();
		Aviao.getTrataTipoDasAsas();
		Aviao test = new Aviao();
		// Drone asa fixa
		new DroneAsaFixa();
		DroneAsaFixa.main(null);
		DroneAsaFixa.pegaQuantidadeMotores();
		DroneAsaFixa.pegaQuantidadeAsas();
		// Drone Asa Rodatica
		new DroneAsaRodativa();
		DroneAsaRodativa.main(null);
		DroneAsaRodativa.pegaQuantidadeMotores();
		// Helicoptero
		new Helicoptero();
		Helicoptero.main(null);
		Helicoptero.pegaQuantidadeMotores();
		// Planador
		new Planador();
		Planador.main(null);
		Planador.getTrataMotor();
		Planador.pegaQuantidadeAsas();
		new CsvAerodino();
		new OutputCSV();
		OutputCSV.main(null);

	}

}
