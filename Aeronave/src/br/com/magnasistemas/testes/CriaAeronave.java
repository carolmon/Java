package br.com.magnasistemas.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import br.com.magnasistemas.aerodino.Aviao;
import br.com.magnasistemas.aerodino.DroneAsaFixa;
import br.com.magnasistemas.aerodino.DroneAsaRotativa;
import br.com.magnasistemas.aerodino.Helicoptero;
import br.com.magnasistemas.aerodino.Hibrido;
import br.com.magnasistemas.aerodino.MotoPlanador;
import br.com.magnasistemas.aerodino.Planador;
import br.com.magnasistemas.aerostatos.Balao;
import br.com.magnasistemas.aerostatos.Dirigivel;
import br.com.magnasistemas.arquivos.Entrada;
import br.com.magnasistemas.arquivos.Saida;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.Rigidez;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public class CriaAeronave {

	public static void main(String[] args) {
		
			Balao testeBalao = new Balao(Combustivel.AR_QUENTE, 
										 "Balão com constructor", 
										 "teste", 
										 "dilatação", 
										 "medio", 
										 Tripulacao.TRIPULACAOUNICA, 
										 OutrosComponentes.CESTO);
			testeBalao.resultados();
			System.out.println("\n"+"Balão: " + testeBalao.resultados());
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
			Helicoptero testeHelicoptero = new Helicoptero("Helicoptero", 
														   "Serviço", 
														   "Helice", 
														   "Grande", 
														   Tripulacao.TRIPULACAODUPLA, 
														   Combustivel.ETANOL, 
														   2,
														   OutrosComponentes.MANCHE);
			System.out.println("\n"+"Helicoptero: "+ testeHelicoptero.resultados());
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
			MotoPlanador testeMotoPlanador = new MotoPlanador("Moto Planador", 
															  "Lazer", 
															  "Força", 
															  "Medio", 
															  Tripulacao.TRIPULACAOUNICA, 
															  Combustivel.FORCA_E_GASOLINA, 
															  1, 
															  1);
			System.out.println("\n"+"Moto Planador: "+testeMotoPlanador.resultados());
			Planador testePlanador = new Planador("Planador", 
					  							  "Lazer", 
					  							  "Força", 
					  							  "Medio", 
					  							  Tripulacao.TRIPULACAOUNICA, 
					  							  Combustivel.FORCA, 
					  							  1);
			System.out.println("\n"+"Moto Planador: "+testeMotoPlanador.resultados());
	}
}

