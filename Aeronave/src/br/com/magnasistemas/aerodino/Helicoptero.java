package br.com.magnasistemas.aerodino;


import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public class Helicoptero extends Aerodino {
	protected final TipoDeAsa helice = TipoDeAsa.ROTATIVA;
	protected final Motorizasao motor = Motorizasao.MOTORROTATORIO;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAODUPLA;
	protected final OutrosComponentes manche = OutrosComponentes.MANCHE;
	protected String categoriaRotores;

	public Helicoptero(String nome, 
				 	   String funcao, 
				 	   String impulsor, 
				 	   String porte,
				 	   Tripulacao tripulacao,
				 	   Combustivel combustivel,
				 	   Integer quantidadeDeMotores,
				 	   OutrosComponentes manche) {
		setNome("\n"+"NOME: "+nome);
		setFuncao("\n"+"FUNÇÃO: "+funcao +"\n" + "CATEGORIA DE ROTORES: ");
		setImpulsdor("\n"+"IMPULSOR: "+impulsor);
		setPorte("\n"+"PORTE: "+porte ) ;
		setCombustivel(combustivel);
		setQuantidadeDeMotores(quantidadeDeMotores);
		
		
	}
	public String categoriaDeRotores() {
		if (getQuantidadeDeMotores() == 2) {
			categoriaRotores = "rotor convencional ";
		} else if (getQuantidadeDeMotores() == 2) {
			categoriaRotores = "monogiro  ";
		}

		else {
			categoriaRotores = "quantidade de motores invalidos  ";
		}
		return categoriaRotores;
	}
	public String resultados() {
		return nome 
			  +impulsdor 
			  +combustivel.getCombustivel()
			  +porte 
			  +funcao 
			  +categoriaDeRotores()
			  +helice.getTipoDeAsa()
			  + manche.getComponentes() 
			  +tripulacao.getTripulacao() 
			  +motor.getMotorizasao();

	}

	
	@Override
	public String toString() {
	
		return"\n Helicoptero: "
				+this.getNome()
				+ this.getImpulsdor()
				+ this.getCombustivel()
				+ this.getPorte()
				+ this.getFuncao() 
				+ this.categoriaDeRotores()
				+ this.helice.getTipoDeAsa()
				+ this.manche.getComponentes()
				+ this.tripulacao.getTripulacao()
				+ this.motor.getMotorizasao() ;
	}
}
