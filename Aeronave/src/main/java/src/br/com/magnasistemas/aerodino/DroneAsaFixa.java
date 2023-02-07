package src.br.com.magnasistemas.aerodino;


import src.br.com.magnasistemas.enums.Combustivel;
import src.br.com.magnasistemas.enums.Motorizasao;
import src.br.com.magnasistemas.enums.OutrosComponentes;
import src.br.com.magnasistemas.enums.TipoDeAsa;
import src.br.com.magnasistemas.enums.Tripulacao;

public class DroneAsaFixa extends Aerodino {
	protected final TipoDeAsa asa = TipoDeAsa.FIXA;
	protected final OutrosComponentes controle = OutrosComponentes.CONTROLEREMOTO;
	protected final Tripulacao tripulacao = Tripulacao.NTRIPULADO;
	protected final OutrosComponentes camera = OutrosComponentes.CAMERA;
	protected final Motorizasao motor = Motorizasao.MOTORPISTAO;
	protected String categoriaAsas;
	protected String categoriaMotores;

	public DroneAsaFixa(String nome, 
	     	  String funcao, 
	     	  String impulsor, 
	     	  String porte,
	     	  Tripulacao tripulacao,
	     	  Combustivel combustivel,
	     	  Integer quantidadeDeAsas,
	     	  Integer quantidadeDeMotores,
	     	  OutrosComponentes camera,
	     	  OutrosComponentes controle) {
		setNome("\n"+"NOME: "+nome);
		setFuncao("\n"+"FUNÇÃO: "+funcao);
		setImpulsdor("\n"+"IMPULSOR: "+impulsor);
		setPorte("\n"+"PORTE: "+porte);
		setCombustivel(combustivel);
		setQuantidadeDeAsas(quantidadeDeAsas);
		setQuantidadeDeMotores(quantidadeDeMotores);
		
		
	}
	public String validaAsa() {

		if (getQuantidadeDeAsas() > 1 && getQuantidadeDeAsas() < 1) {
			categoriaAsas = "quantidade de asas invalidas ";
		} else {
			categoriaAsas = "monoplano ";
		}

		return categoriaAsas ;
	}
	public String validaMotor() {
		if (getQuantidadeDeMotores() > 1 && getQuantidadeDeMotores() < 1) {
			categoriaMotores = "quantidade de motores invalidos ";
		} else {
			categoriaMotores = "monomotor ";
		}
		return categoriaMotores;
	}

	public String resultados() {
		return nome 
			  +impulsdor
			  +combustivel.getCombustivel()
			  +porte 
			  +funcao 
			  +validaAsa()
			  +validaMotor()
			  +asa.getTipoDeAsa() 
			  +controle.getComponentes()
			  +camera.getComponentes() 
			  +tripulacao.getTripulacao() 
			  +motor.getMotorizasao();

	}

	
	
	@Override
	public String toString() {
	
		return"\n Drone Asa Fixa: " 
				+ this.getNome() 
				+ this.getImpulsdor() 
				+ this.getCombustivel()
				+ this.getPorte()
				+ this.getFuncao()
				+ this.validaMotor()
				+ this.validaAsa()
				+ this.asa.getTipoDeAsa()
				+ this.controle.getComponentes()
				+ this.camera.getComponentes()
				+ this.tripulacao.getTripulacao()
				+ this.motor.getMotorizasao();
	}

}
