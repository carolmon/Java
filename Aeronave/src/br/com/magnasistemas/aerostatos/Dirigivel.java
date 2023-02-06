package br.com.magnasistemas.aerostatos;

import br.com.magnasistemas.aerodino.Aviao;
import br.com.magnasistemas.aerodino.Aviao.Builder;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.Rigidez;
import br.com.magnasistemas.enums.Tripulacao;

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
		setNome(nome + " ");
		setFuncao(funcao + " ");
		setImpulsdor(impulsor + " ");
		setPorte(porte + " ");
		setCombustivel(combustivel);
		setRigidez(rigidez());
		
		

	}
	public Rigidez rigidez() {
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
		return rigidez;
	}

	public String resultados() {
		return nome 
			   +impulsdor
			   +combustivel
			   +porte
			   +funcao
			   +rigidez 
			   +leme.getComponentes() 
			   +gondola.getComponentes() 
			   +tripulacao.getTripulacao();

	}

	
	public String toString() {
		
		return"\n Dirigivel: " 
				+this.nome + " " 
				+this.impulsdor + " " 
				+this.combustivel+ " "
				+this.flutuabilidade+ " "
				+this.porte+ " " 
				+this.funcao+ " "
				+this.rigidez+ " "
				+this.leme+ " "
				+this.gondola+ " "
				+this.tripulacao+ " ";
	}
}
