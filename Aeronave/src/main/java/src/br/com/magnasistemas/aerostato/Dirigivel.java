package src.br.com.magnasistemas.aerostato;

import src.br.com.magnasistemas.aerodino.Aviao;

import src.br.com.magnasistemas.enums.Combustivel;
import src.br.com.magnasistemas.enums.OutrosComponentes;
import src.br.com.magnasistemas.enums.Rigidez;
import src.br.com.magnasistemas.enums.Tripulacao;

public class Dirigivel extends Aerostato {
	protected final OutrosComponentes gondola = OutrosComponentes.GONDOLA;
	protected final OutrosComponentes leme = OutrosComponentes.LEME;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAODUPLA;


	public Dirigivel(Combustivel combustivel, 
			 		 String nome, 
			 		 String funcao, 
			 		 String impulsor, 
			 		 String porte,
			 		 Tripulacao tripulacao, 
			 		 OutrosComponentes leme,
			 		 OutrosComponentes gondola,
			 		 Rigidez rigidez) {
		setNome("\n"+"NOME: "+nome);
		setFuncao("\n"+"FUNÇÃO: "+funcao);
		setPorte("\n"+"PORTE: "+porte + " ");
		setCombustivel(combustivel);
		setImpulsdor("\n"+"IMPULSOR: "+impulsor + " ");
		setRigidez(rigidez);
		setFlutuabilidade(" "+rigidez()+" ");
		
		

	}
	public String rigidez() {
		switch (rigidez) {
		case RIGIDO:
			flutuabilidade = "Dirigivel Rigido ";
			break;
		case N_RIGIDO:
			flutuabilidade = "Dirigivel não Rigido ";
			break;
		case SEMIRIGIDO:
			flutuabilidade = "Dirigivel semi Rigido ";
			break;
		case METAL_CLAD:
			flutuabilidade = "Dirigivel metal-clad ";
			break;
		case HIBRIDO:
			flutuabilidade = "Dirigivel hibrido ";
			break;
	}
		return flutuabilidade;
	}

	public String resultados() {
		return nome 
			   +impulsdor
			   +combustivel.getCombustivel()
			   +porte
			   +funcao
			   +rigidez.getRigidez() 
			   +leme.getComponentes() 
			   +gondola.getComponentes() 
			   +tripulacao.getTripulacao();

	}

	
	public String toString() {
		
		return"\n Dirigivel: " 
				+this.getNome() 
				+this.getImpulsdor()
				+this.getCombustivel()
				+this.flutuabilidade+ " "
				+this.getPorte()
				+this.getFuncao()
				+this.rigidez.getRigidez()
				+this.leme.getComponentes()
				+this.gondola.getComponentes()
				+this.tripulacao.getTripulacao();
	}
}
