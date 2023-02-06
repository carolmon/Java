package br.com.magnasistemas.aeronave;

import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.TipoAeronave;
import br.com.magnasistemas.enums.TipoDeAsa;

public abstract class Aeronave {
	protected String impulsdor;
	protected Combustivel combustivel;
	protected TipoAeronave tipoAeronave;
	protected String porte;
	protected String funcao;
	protected String nome;
	
	
	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
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
