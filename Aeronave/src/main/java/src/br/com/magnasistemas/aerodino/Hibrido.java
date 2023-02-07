package src.br.com.magnasistemas.aerodino;

import src.br.com.magnasistemas.enums.Combustivel;
import src.br.com.magnasistemas.enums.Motorizasao;
import src.br.com.magnasistemas.enums.OutrosComponentes;
import src.br.com.magnasistemas.enums.TipoDeAsa;
import src.br.com.magnasistemas.enums.Tripulacao;

public class Hibrido extends Aerodino {
	protected final TipoDeAsa asa = TipoDeAsa.HIBRIDA;
	protected final OutrosComponentes caixaPreta = OutrosComponentes.CAIXAPRETA;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAOPOLI;
	protected final Motorizasao motor = Motorizasao.MOTORPISTAOROTATORIO;
	protected String categoriaAsas;
	protected String categoriaMotores;

	public Hibrido(String nome, 
	     	  	   String funcao, 
	     	  	   String impulsor, 
	     	  	   String porte,
	     	  	   Tripulacao tripulacao,
	     	  	   Combustivel combustivel,
	     	  	   Integer quantidadeDeAsas,
	     	  	   Integer quantidadeDeMotores,
	     	  	   OutrosComponentes caixaPreta) {
		setNome("\n"+"NOME: "+nome);
		setFuncao("\n"+"FUNÇÃO: "+funcao);
		setImpulsdor("\n"+"IMPULSOR: "+impulsor);
		setPorte("\n"+"PORTE: "+porte);
		setCombustivel(combustivel);
		setQuantidadeDeAsas(quantidadeDeAsas);
		setQuantidadeDeMotores(quantidadeDeMotores);
	
	}
	public String categoriaAsa() {
		if (getQuantidadeDeAsas() == 1) {
			categoriaAsas = " monoplano";
		} else {
			categoriaAsas = " asa invalida";
		}
		return  "\n"+"CATEGORIA DE ASAS: "+categoriaAsas;
	}
	public String categoriaMotor() {
		switch (getQuantidadeDeMotores()) {

		case 0:
			categoriaMotores = " motor invalido ";
			break;
		case 1:
			categoriaMotores = " monomotor ";
			break;
		case 2:
			categoriaMotores = " bimotor ";
			break;
		case 3:
			categoriaMotores = " trimotor ";
			break;
		case 4:
			categoriaMotores = " quadrimotor ";
			break;
		default:
			categoriaMotores = " multimotor  ";
			break;
		}
		return "\n"+"CATEGORIA DE MOTORES: "+categoriaMotores;
	}

	public String resultados() {
		return nome 
			  +impulsdor 
			  +combustivel.getCombustivel()
			  +porte 
			  +funcao 
			  +categoriaAsa() 
			  +categoriaMotor() 
			  +asa.getTipoDeAsa()
			  +caixaPreta.getComponentes() 
			  +tripulacao.getTripulacao() 
			  +motor.getMotorizasao();

	}

	
	@Override
	public String toString() {
	
		return"\n Hibrido: " 
				+ this.getNome()
				+ this.getImpulsdor()
				+ this.getCombustivel() 
				+ this.getPorte()
				+ this.getFuncao() 
				+ this.categoriaAsa() 
				+ this.categoriaMotor() 
				+ this.asa.getTipoDeAsa() 
				+ this.caixaPreta.getComponentes()
				+ this.tripulacao.getTripulacao()
				+ this.motor.getMotorizasao();
	}

}
