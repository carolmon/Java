package br.com.magnasistemas.aeronave;

import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.TipoAeronave;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public abstract class Aeronave {
	protected String impulsdor;
	protected Combustivel combustivel;
	protected TipoAeronave tipoAeronave;
	protected Tripulacao tripulacao;
	protected String porte;
	protected String funcao;
	protected String nome;
	protected String nomeCombusitvel;
	
	
	

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
		
	}

	public String getImpulsdor() {
		return impulsdor;
	}

	public void setImpulsdor(String impulsdor) {
		this.impulsdor = impulsdor;
	}

	

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
