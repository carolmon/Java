package src.br.com.magnasistemas.aerodino;


import src.br.com.magnasistemas.enums.Combustivel;
import src.br.com.magnasistemas.enums.Motorizasao;
import src.br.com.magnasistemas.enums.OutrosComponentes;
import src.br.com.magnasistemas.enums.TipoDeAsa;
import src.br.com.magnasistemas.enums.Tripulacao;

public class DroneAsaRotativa extends  Aerodino{
	protected final TipoDeAsa helice = TipoDeAsa.ROTATIVA;
	protected final OutrosComponentes controle = OutrosComponentes.CONTROLEREMOTO;
	protected final OutrosComponentes camera = OutrosComponentes.CAMERA;
	protected final Motorizasao motor = Motorizasao.MOTORROTATORIO;
	protected final Tripulacao tripulacao = Tripulacao.NTRIPULADO;
	protected String categoriaRotores = null;
	protected String nomeCombusitvel =  "\n"+"COMBUSTIVEL: ";
	
	
	public DroneAsaRotativa( String nome, 
	     	  				 String funcao, 
	     	  				 String impulsor, 
	     	  				 String porte,
	     	  				 Tripulacao tripulacao,
	     	  				 Combustivel combustivel,
	     	  				 Integer quantidadeDeMotores,
	     	  				 OutrosComponentes camera,
	     	  				 OutrosComponentes controle) {
		setNome("\n"+"NOME: "+nome);
		setFuncao("\n"+"FUNÇÃO: "+funcao +"\n" + "CATEGORIA DE ROTORES: ");
		setImpulsdor("\n"+"IMPULSOR: "+impulsor);
		setPorte("\n"+"PORTE: "+porte ) ;
		setCombustivel(combustivel);
		setQuantidadeDeMotores(quantidadeDeMotores);
		
		

	}
	public String categoriaRotores() {
		switch(getQuantidadeDeMotores()) {
		case 1:
			categoriaRotores = "rotor unico ";
			break;
		case 3:
			categoriaRotores = "tricóptro ";
			break;
		case 4:
			categoriaRotores = "quadcótero ";
			break;
		case 6:
			categoriaRotores = "hexacóptero ";
			break;
		case 8:
			categoriaRotores = "octocóptero ";
			break;
		}
		return categoriaRotores;
	}

	public String resultados() {
		return nome 
			  +impulsdor
			  +combustivel.getCombustivel()
			  +porte
			  +funcao
			  +categoriaRotores()
			  +helice.getTipoDeAsa()
			  +controle.getComponentes()
			  +tripulacao.getTripulacao()
			  +motor.getMotorizasao() ;
	}

	@Override
	public String toString() {
	
		return"\n Drone Asa Rotativa: " 
				+ this.getNome() + " " 
				+ this.getImpulsdor() + " " 
				+ this.getCombustivel() + " "
				+ this.getPorte() + " " 
				+ this.getFuncao()+ " "
				+ this.categoriaRotores()+ " "
				+ this.helice.getTipoDeAsa()
				+ this.controle.getComponentes()
				+ this.tripulacao.getTripulacao()
				+ this.motor.getMotorizasao();
		
	}
}
