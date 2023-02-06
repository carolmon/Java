package br.com.magnasistemas.aerodino;

import br.com.magnasistemas.aeronave.Aeronave;
import br.com.magnasistemas.enums.TipoAeronave;
import br.com.magnasistemas.enums.TipoDeAsa;

public class Aerodino extends Aeronave {

	protected Integer quantidadeDeAsas;
	protected  Integer quantidadeDeMotores;
	protected final TipoAeronave aerodino = TipoAeronave.AERODINO;
	protected final TipoDeAsa asa = null;

	public  Integer getQuantidadeDeAsas() {
		return quantidadeDeAsas;
	}

	public void setQuantidadeDeAsas(Integer quantidadeDeAsas) {
		this.quantidadeDeAsas = quantidadeDeAsas;
	}

	public  Integer getQuantidadeDeMotores() {
		return quantidadeDeMotores;
	}

	public void setQuantidadeDeMotores(Integer quantidadeDeMotores) {
		this.quantidadeDeMotores = quantidadeDeMotores;
	}

}
