package br.com.magnasistemas.aerodino;

import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public class Planador extends Aerodino {
	protected final TipoDeAsa asa = TipoDeAsa.FIXA;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAOUNICA;
	protected final Motorizasao motor = Motorizasao.NMOTORIZADO;
	static String categoriaAsas = null;

	public Planador(String nome, 
	     	        String funcao, 
	     	        String impulsor, 
	     	        String porte,
	     	        Tripulacao tripulacao,
	     	        Combustivel combustivel,
	     	        Integer quantidadeDeAsas
	     	       ) {
		
		setNome("\n"+"NOME: "+nome);
		setFuncao("\n"+"FUNÇÃO: "+funcao);
		setImpulsdor("\n"+"IMPULSOR: "+impulsor);
		setPorte("\n"+"PORTE: "+porte);
		setCombustivel(combustivel);
		setQuantidadeDeAsas(quantidadeDeAsas);

		
	}
	
	public String categoriaAsa() {

		if (getQuantidadeDeAsas() > 1 && getQuantidadeDeAsas() < 1) {
			categoriaAsas = "asa invalida";
		} else {
			categoriaAsas = "monoplano";
		}
		
		return "\n"+"CATEGORIA DE ASAS: "+categoriaAsas;
		
	}

	public String resultados() {
		return nome 
			  +impulsdor
			  +combustivel.getCombustivel()
			  +porte
			  +funcao 
			  +categoriaAsas 
			  +asa.getTipoDeAsa() 
			  +tripulacao.getTripulacao()
			  +motor.getMotorizasao();

	}

	
	public String toString() {
		
		return"\n Planador: " 
				+ this.getNome()
				+ this.getImpulsdor()
				+ this.getCombustivel() 
				+ this.getPorte()
				+ this.getFuncao()
				+ this.categoriaAsa()
				+ this.asa.getTipoDeAsa()
				+ this.tripulacao.getTripulacao()
				+ this.motor.getMotorizasao();
	}
}
