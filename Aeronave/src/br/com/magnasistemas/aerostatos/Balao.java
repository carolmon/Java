package br.com.magnasistemas.aerostatos;

import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.Tripulacao;

public class Balao extends Aerostato {

	protected final OutrosComponentes cesto = OutrosComponentes.CESTO;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAOUNICA;

	public Balao(Combustivel combustivel, 
			     String nome, 
			     String funcao, 
			     String impulsor, 
			     String porte,
			     Tripulacao tripulacao, 
			     OutrosComponentes cesto) {

		setNome(nome + " ");
		setFuncao(funcao + " ");
		setImpulsdor(impulsor + " ");
		setPorte(porte + " ");
		setCombustivel(combustivel);
		setFlutuabilidade(" " + flutuabilidade() + " ");

	}

	public String flutuabilidade() {
		switch (combustivel) {
		case AR_QUENTE:
			flutuabilidade = "balão de ar quente ";
			break;
		case HELIO:
			flutuabilidade = "balão a gas ";
			break;
		case AR_QUENTE_HELIO:
			flutuabilidade = "balão de rozier ";
			break;

		default:
			flutuabilidade = "balão invalido ";
			break;
		}
		return flutuabilidade;
	}

	public String resultados() {
		return nome 
			  +impulsdor
			  +porte
			  +funcao
			  +combustivel
			  +flutuabilidade
			  +tripulacao.getTripulacao()
			  +cesto.getComponentes();

	}

	@Override
	public String toString() {

		return "\n Balão: " 
				+ this.getNome() + " " 
				+ this.getImpulsdor() + " " 
				+ this.getCombustivel() + " "
				+ this.flutuabilidade + " " 
				+ this.getPorte() + " " 
				+ this.getFuncao() + " " 
				+ this.tripulacao + " "
				+ this.cesto + " ";
	}
}
