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

public class Tratamento extends Entrada {
	public void tratamento() {
		switch (Entrada.tipoDeAeronave) {
		case AVIAO:
			Aviao novoAviao = new Aviao.Builder()
									   .nome(nome)
									   .quantidadeDeAsas(Integer.parseInt(quantiadeAsas))
									   .quantidadeDeMotores(Integer.parseInt(quantidadeMotores))
									   .combustivel(combustivel)
									   .funcao(funcao)
									   .porte(porte)
									   .impulsdor(impulsor)
									   .build();

			registros.add(novoAviao);
			break;
		case HIBRIDO:
			Hibrido novoHibrido = new Hibrido.Builder()
									   .nome(nome)
									   .quantidadeDeAsas(Integer.parseInt(quantiadeAsas))
									   .quantidadeDeMotores(Integer.parseInt(quantidadeMotores))
									   .combustivel(combustivel)
									   .funcao(funcao)
									   .porte(porte)
									   .impulsdor(impulsor)
									   .build();

			registros.add(novoHibrido);
			break;
		case BALAO:
			Balao novoBalao = new Balao.Builder()
									   .nome(nome)
									   .combustivel(combustivel)
									   .funcao(funcao)
									   .impulsdor(impulsor)
			                           .porte(porte)
			                           .build();
			registros.add(novoBalao);
			break;
		case DIRIGIVEL:
			Dirigivel novoDirigivel = new Dirigivel.Builder()
												   .nome(nome)
												   .combustivel(combustivel)
												   .funcao(funcao)
												   .impulsdor(impulsor)
												   .rigidez(rigidez)
												   .porte(porte)
												   .build();
			registros.add(novoDirigivel);
			break;
		case DRONE_ASA_FIXA:
			DroneAsaFixa novoDroneAsaFixa = new DroneAsaFixa.Builder()
															.nome(nome)
															.combustivel(combustivel)
															.funcao(funcao)
															.impulsdor(impulsor)
															.porte(porte)
															.quantidadeDeMotores(Integer.parseInt(quantidadeMotores))
															.quantidadeDeAsas(Integer.parseInt(quantiadeAsas))
															.build();
			registros.add(novoDroneAsaFixa);
			break;
		case DRONE_ASA_ROTATIVA:
			DroneAsaRotativa novoDroneAsaRotativa = new DroneAsaRotativa.Builder()
																		.nome(nome)
																		.combustivel(combustivel)
																		.funcao(funcao)
																		.impulsdor(impulsor)
																		.porte(porte)
																		.quantidadeDeMotores(Integer.parseInt(quantidadeMotores))
																		.build();
			registros.add(novoDroneAsaRotativa);
			break;
		case HELICOPTERO:
			Helicoptero novoHelicoptero = new Helicoptero.Builder()
														 .nome(nome)
														 .combustivel(combustivel)
														 .funcao(funcao)
														 .impulsdor(impulsor)
														 .porte(porte)
														 .quantidadeDeMotores(Integer.parseInt(quantidadeMotores))
														 .build();
			registros.add(novoHelicoptero);
			break;
		case MOTOPLANADOR:
			MotoPlanador novoMotoPlanador = new MotoPlanador.Builder()
															.nome(nome)
															.quantidadeDeAsas(Integer.parseInt(quantiadeAsas))
															.quantidadeDeMotores(Integer.parseInt(quantidadeMotores))
															.combustivel(combustivel)
															.funcao(funcao)
															.porte(porte)
															.impulsdor(impulsor)
															.build();
			registros.add(novoMotoPlanador);
			break;
		case PLANADOR:
			Planador novoPlanador = new Planador.Builder()
												.nome(nome)
												.quantidadeDeAsas(Integer.parseInt(quantiadeAsas))
												.combustivel(combustivel)
												.funcao(funcao)
												.porte(porte)
												.impulsdor(impulsor)
												.build();
			registros.add(novoPlanador);
			break;
		}
	}
}
