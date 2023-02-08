//package src.br.com.magnasistemas.testes;
package src.br.com.magnasistemas.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import src.br.com.magnasistemas.aerodino.Aviao;
import src.br.com.magnasistemas.aerodino.DroneAsaFixa;
import src.br.com.magnasistemas.aerodino.DroneAsaRotativa;
import src.br.com.magnasistemas.aerodino.Helicoptero;
import src.br.com.magnasistemas.aerodino.Hibrido;
import src.br.com.magnasistemas.aerodino.MotoPlanador;
import src.br.com.magnasistemas.aerodino.Planador;
import src.br.com.magnasistemas.aerostato.Balao;
import src.br.com.magnasistemas.aerostato.Dirigivel;
import src.br.com.magnasistemas.arquivos.Entrada;
import src.br.com.magnasistemas.arquivos.Saida;
import src.br.com.magnasistemas.enums.Combustivel;
import src.br.com.magnasistemas.enums.OutrosComponentes;
import src.br.com.magnasistemas.enums.Rigidez;
import src.br.com.magnasistemas.enums.Tripulacao;

public class CriaAeronave {


	@Test
	public void testeBalao() {
		Balao testeBalao = new Balao(Combustivel.AR_QUENTE, 
							   		 "Balão com constructor", 
								     "teste", 
									 "dilatação", 
									 "medio", 
									 Tripulacao.TRIPULACAOUNICA, 
									 OutrosComponentes.CESTO);
									  testeBalao.resultados();
		System.out.println("\n"+"Balão: " + testeBalao.resultados());
	}
	@Test
	public void testDirigivel() {
		Dirigivel testeDirigivel = new Dirigivel(Combustivel.HELIO, 
				 								 "Led Zeplin", 
												 "comercial", 
												 "dilatação", 
												 "grande", 
												 Tripulacao.TRIPULACAODUPLA, 
												 OutrosComponentes.LEME, 
												 OutrosComponentes.GONDOLA,
												 Rigidez.HIBRIDO);
		System.out.println("\n"+"Dirigivel "+testeDirigivel.resultados());
	}
	@Test
	public void testAviao() {
		Aviao testeAviao = new Aviao("batjato", 
									 "privado",
									 "turbina", 
									 "medio", 
									 Tripulacao.TRIPULACAOPOLI, 
									 Combustivel.ETANOL, 
									 2, 
									 3,
									 OutrosComponentes.CAIXAPRETA);
		System.out.println("\n"+"Avião: "+ testeAviao.resultados());
	}
	@Test
	public void testeDroneAsaFixa() {
		DroneAsaFixa testeDroneAsaFixa = new DroneAsaFixa("Drone 1", 
														  "lazer", 
														  "turbina", 
														  "pequeno", 
														  Tripulacao.NTRIPULADO, 
														  Combustivel.GASOLINA, 
														  1, 
														  1,
														  OutrosComponentes.CAMERA,
														  OutrosComponentes.CONTROLEREMOTO);
		System.out.println("\n"+"Drone Asa Fixa: " +testeDroneAsaFixa.resultados());
	}
	@Test
	public void testeDroneAsaRoativa() {
		DroneAsaRotativa testeDroneAsaRotativa = new DroneAsaRotativa("Juninho o drone", 
																	  "Lazer", 
																	  "Helice", 
																	  "Pequeno", 
																	  Tripulacao.NTRIPULADO, 
																	  Combustivel.BATERIA, 
																	  8,
																	  OutrosComponentes.CAMERA,
																	  OutrosComponentes.CONTROLEREMOTO);
		System.out.println("\n"+"Drone Asa Rotativa: "+testeDroneAsaRotativa.resultados());
	}
	@Test
	public void testeHelicoptero() {
		Helicoptero testeHelicoptero = new Helicoptero("Helicoptero", 
													   "Serviço", 
													   "Helice", 
													   "Grande", 
													   Tripulacao.TRIPULACAODUPLA, 
													   Combustivel.ETANOL, 
													   2,
													   OutrosComponentes.MANCHE);
		System.out.println("\n"+"Helicoptero: "+ testeHelicoptero.resultados());
	}
	@Test
	public void testeHibrido() {
		Hibrido testeHibrido = new Hibrido("Hibrido", 
										   "Militar", 
										   "Helice", 
										   "Grande", 
										   Tripulacao.TRIPULACAOPOLI, 
										   Combustivel.GASOLINA, 
										   1, 
										   2,
										   OutrosComponentes.CAIXAPRETA);
		System.out.println("\n"+"Hibrido: "+testeHibrido.resultados());
	}
	@Test
	public void testMotoplanador() {
		MotoPlanador testeMotoPlanador = new MotoPlanador("Moto Planador", 
														  "Lazer", 
														  "Força", 
														  "Medio", 
														  Tripulacao.TRIPULACAOUNICA, 
														  Combustivel.FORCA_E_GASOLINA, 
														  1, 
														  1);
		System.out.println("\n"+"Moto Planador: "+testeMotoPlanador.resultados());
	}
	@Test
	public void testePlanador() {
		Planador testePlanador = new Planador("Planador", 
											  "Lazer", 
											  "Força", 
											  "Medio", 
											  Tripulacao.TRIPULACAOUNICA, 
											  Combustivel.FORCA, 
											  1);
		System.out.println("\n"+"Moto Planador: "+testePlanador.resultados());
		//assertEquals(testePlanador, null);
	}
	@Test
	public void testeEscreve() throws IOException {
		Entrada entrada = new Entrada();
		entrada.pegaEntradaETrataDados();
		Saida saida = new Saida();
		saida.escreveCsv();
	}
}

