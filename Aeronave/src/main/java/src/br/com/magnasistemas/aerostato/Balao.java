package src.br.com.magnasistemas.aerostato;

import src.br.com.magnasistemas.enums.Combustivel;
import src.br.com.magnasistemas.enums.OutrosComponentes;
import src.br.com.magnasistemas.enums.Tripulacao;

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

		setNome("\n"+"NOME: "+nome);
		setFuncao("\n"+"FUNÇÃO: "+funcao);
		setImpulsdor("\n"+"IMPULSOR: "+impulsor);
		setPorte("\n"+"PORTE: "+porte);
		setCombustivel(combustivel);
		setFlutuabilidade("\n"+"FLUTUABILIDADE: "+flutuabilidade());

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
			  +combustivel.getCombustivel()
			  +flutuabilidade
			  +tripulacao.getTripulacao()
			  +cesto.getComponentes();

	}

	@Override
	public String toString() {

		return "\n Balão: " 
				+ this.getNome() 
				+ this.getImpulsdor()
				+ this.getCombustivel()
				+ this.flutuabilidade
				+ this.getPorte()
				+ this.getFuncao()
				+ this.tripulacao.getTripulacao()
				+ this.cesto.getComponentes();
	}
}
