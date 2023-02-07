package br.com.magnasistemas.arquivos;

import br.com.magnasistemas.aerodino.Aviao;
import br.com.magnasistemas.aerodino.DroneAsaFixa;
import br.com.magnasistemas.aerodino.DroneAsaRotativa;
import br.com.magnasistemas.aerodino.Helicoptero;
import br.com.magnasistemas.aerodino.Hibrido;
import br.com.magnasistemas.aerodino.MotoPlanador;
import br.com.magnasistemas.aerodino.Planador;
import br.com.magnasistemas.aerostatos.Balao;
import br.com.magnasistemas.aerostatos.Dirigivel;
import br.com.magnasistemas.enums.Aeronave;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.Tripulacao;

public class Tratamento extends Entrada {
	public void tratamento() {
		switch (Entrada.tipoDeAeronave) {
		case AVIAO:
			Aviao novoAviao = new Aviao(nome, 
										funcao, 
										impulsor, 
										porte, 
										Tripulacao.TRIPULACAOPOLI, 
										combustivel, 
										Integer.parseInt(quantiadeAsas), 
										Integer.parseInt(quantidadeMotores),
										OutrosComponentes.CAIXAPRETA);

			registros.add(novoAviao);
			break;
		case HIBRIDO:
			Hibrido novoHibrido = new Hibrido(nome, 
											  funcao, 
											  impulsor, 
											  porte, 
											  Tripulacao.TRIPULACAOPOLI, 
											  combustivel, 
											  Integer.parseInt(quantiadeAsas), 
											  Integer.parseInt(quantidadeMotores),
											  OutrosComponentes.CAIXAPRETA);

			registros.add(novoHibrido);
			break;
		case BALAO:
			Balao novoBalao = new Balao(combustivel, 
										nome, 
										funcao, 
										impulsor, 
										porte, 
										Tripulacao.TRIPULACAOUNICA, 
										OutrosComponentes.CESTO);
			registros.add(novoBalao);
			break;
		case DIRIGIVEL:
			Dirigivel novoDirigivel = new Dirigivel(combustivel, 
													nome, 
													funcao, 
													impulsor, 
													porte, 
													Tripulacao.TRIPULACAODUPLA, 
													OutrosComponentes.LEME, 
													OutrosComponentes.GONDOLA, 
													rigidez);
			registros.add(novoDirigivel);
			break;
		case DRONE_ASA_FIXA:
			DroneAsaFixa novoDroneAsaFixa = new DroneAsaFixa(nome, 
															 funcao, 
															 impulsor, 
															 porte, 
															 Tripulacao.NTRIPULADO, 
															 combustivel, 
															 Integer.parseInt(quantiadeAsas), 
															 Integer.parseInt(quantidadeMotores),
															 OutrosComponentes.CAMERA,
															 OutrosComponentes.CONTROLEREMOTO);
			registros.add(novoDroneAsaFixa);
			break;
		case DRONE_ASA_ROTATIVA:
			DroneAsaRotativa novoDroneAsaRotativa = new DroneAsaRotativa(nome, 
																		 funcao, 
																		 impulsor, 
																		 porte, 
																		 Tripulacao.NTRIPULADO, 
																		 combustivel,  
																		 Integer.parseInt(quantidadeMotores),
																		 OutrosComponentes.CAMERA,
																		 OutrosComponentes.CONTROLEREMOTO);
			registros.add(novoDroneAsaRotativa);
			break;
		case HELICOPTERO:
			Helicoptero novoHelicoptero = new Helicoptero(nome, 
														  funcao, 
														  impulsor, 
														  porte, 
														  Tripulacao.TRIPULACAODUPLA, 
														  combustivel,  
														  Integer.parseInt(quantidadeMotores),
														  OutrosComponentes.MANCHE);
			registros.add(novoHelicoptero);
			break;
		case MOTOPLANADOR:
			MotoPlanador novoMotoPlanador = new MotoPlanador(nome, 
															 funcao, 
															 impulsor, 
															 porte, 
															 Tripulacao.TRIPULACAOUNICA, 
															 combustivel, 
															 Integer.parseInt(quantiadeAsas), 
															 Integer.parseInt(quantidadeMotores));
			registros.add(novoMotoPlanador);
			break;
		case PLANADOR:
			Planador novoPlanador = new Planador(nome, 
												 funcao, 
												 impulsor, 
												 porte, 
												 Tripulacao.TRIPULACAOUNICA, 
												 combustivel, 
												 Integer.parseInt(quantiadeAsas));
			registros.add(novoPlanador);
			break;
		}
	}
}
