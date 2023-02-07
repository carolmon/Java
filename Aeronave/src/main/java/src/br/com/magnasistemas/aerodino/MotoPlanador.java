package src.br.com.magnasistemas.aerodino;

import src.br.com.magnasistemas.enums.Combustivel;
import src.br.com.magnasistemas.enums.Motorizasao;
import src.br.com.magnasistemas.enums.TipoDeAsa;
import src.br.com.magnasistemas.enums.Tripulacao;


public class MotoPlanador extends Aerodino{
	protected final TipoDeAsa asa = TipoDeAsa.FIXA;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAOUNICA;
	protected final Motorizasao motor = Motorizasao.MOTORPISTAO;
	protected String categoriaAsas;
	protected String categoriaMotores;
	
	
	public MotoPlanador(String nome, 
	     	  String funcao, 
	     	  String impulsor, 
	     	  String porte,
	     	  Tripulacao tripulacao,
	     	  Combustivel combustivel,
	     	  Integer quantidadeDeAsas,
	     	  Integer quantidadeDeMotores) {
		
		setNome("\n"+"NOME: "+nome);
		setFuncao("\n"+"FUNÇÃO: "+funcao);
		setImpulsdor("\n"+"IMPULSOR: "+impulsor);
		setPorte("\n"+"PORTE: "+porte);
		setCombustivel(combustivel);
		setQuantidadeDeAsas(quantidadeDeAsas);
		setQuantidadeDeMotores(quantidadeDeMotores);
		
		
	}
	public String categoriaAsa() {
		if (getQuantidadeDeAsas() > 1&& getQuantidadeDeAsas() < 1) {
			categoriaAsas = "asa invalida ";
		}else {
			categoriaAsas = "monoplano ";
		}
		
		return "\n"+"CATEGORIA DE ASAS: "+categoriaAsas;
	}
	public String categoriaMotor() {
		if (getQuantidadeDeMotores() > 1 && getQuantidadeDeMotores() < 1) {
			categoriaMotores = "motor invalido ";
		}else {
			categoriaMotores = "monomotor ";
		}
		return "\n"+"CATEGORIA DE MOTORES: "+categoriaMotores;
	}

	public String resultados() {
		return nome 
			  +impulsdor
			  +categoriaAsa()
			  +combustivel.getCombustivel()
			  +categoriaMotor()
			  +asa.getTipoDeAsa() 
			  +tripulacao.getTripulacao()
			  +motor.getMotorizasao()
			  +porte
			  +funcao;

	}

	
	public String toString() {
		
		return"\n MotoPlanador: " 
				+ this.getNome()
				+ this.getImpulsdor()
				+ this.getCombustivel() 
				+ this.getPorte()
				+ this.getFuncao() 
				+ this.categoriaAsa() 
				+ this.categoriaMotor() 
				+ this.asa.getTipoDeAsa()
				+ this.tripulacao.getTripulacao()
				+ this.motor.getMotorizasao();
	}
}
