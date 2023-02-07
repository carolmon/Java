package src.br.com.magnasistemas.aerodino;

import java.io.IOException;

import src.br.com.magnasistemas.enums.Combustivel;
import src.br.com.magnasistemas.enums.Motorizasao;
import src.br.com.magnasistemas.enums.OutrosComponentes;
import src.br.com.magnasistemas.enums.TipoAeronave;
import src.br.com.magnasistemas.enums.TipoDeAsa;
import src.br.com.magnasistemas.enums.Tripulacao;

public class Aviao extends Aerodino {

	protected final TipoDeAsa asa = TipoDeAsa.FIXA;
	protected final OutrosComponentes caixaPreta = OutrosComponentes.CAIXAPRETA;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAOPOLI;
	protected final Motorizasao motor = Motorizasao.MOTORJATOPISTAO;
	protected String categoriaAsas;
	protected String categoriaMotores;

	public Aviao( String nome, 
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

		switch (getQuantidadeDeAsas()) {

		case 0:
			categoriaAsas = " Asa invalido ";
			break;
		case 1:
			categoriaAsas = " monoplano ";
			break;
		case 2:
			categoriaAsas = " biplano ";
			break;
		case 3:
			categoriaAsas = " triplano ";
			break;
		default:
			categoriaAsas = " limite de asas ultrapasado  ";
			break;		
		}
		
		return "\n"+"CATEGORIA DE ASAS: "+categoriaAsas;
		
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

		return "\n Avião: " 
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
