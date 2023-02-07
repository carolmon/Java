package src.br.com.magnasistemas.aerostato;

import src.br.com.magnasistemas.aeronave.Aeronave;
import src.br.com.magnasistemas.enums.Rigidez;
import src.br.com.magnasistemas.enums.TipoAeronave;

public class Aerostato extends Aeronave {
	String flutuabilidade;
	Rigidez rigidez;
	protected final TipoAeronave aerostatos = TipoAeronave.AEROSTATOS;

	public Rigidez getRigidez() {
		return rigidez;
	}

	public void setRigidez(Rigidez rigidez) {
		this.rigidez = rigidez;
	}

	

	public String getFlutuabilidade() {
		return flutuabilidade;
	}

	public void setFlutuabilidade(String flutuabilidade) {
		this.flutuabilidade = flutuabilidade;
	}

}
