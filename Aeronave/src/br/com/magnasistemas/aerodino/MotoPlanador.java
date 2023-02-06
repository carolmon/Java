package br.com.magnasistemas.aerodino;

import br.com.magnasistemas.aerodino.MotoPlanador.Builder;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;


public class MotoPlanador extends Aerodino{
	protected final TipoDeAsa asa = TipoDeAsa.FIXA;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAOUNICA;
	protected final Motorizasao motor = Motorizasao.MOTORPISTAO;
	protected String categoriaAsas;
	protected String categoriaMotores;
	
	
	public MotoPlanador(Builder builder) {
		
		this.nome = builder.nome;
		this.combustivel = builder.combustivel;
		this.funcao = builder.funcao;
		this.impulsdor = builder.impulsdor;
		this.porte = builder.porte;
		this.quantidadeDeAsas = builder.quantidadeDeAsas;
		this.quantidadeDeMotores = builder.quantidadeDeMotores;
		
		if (getQuantidadeDeAsas() > 1&& getQuantidadeDeAsas() < 1) {
			categoriaAsas = "asa invalida ";
		}else {
			categoriaAsas = "monoplano ";
		}
		if (getQuantidadeDeMotores() > 1 && getQuantidadeDeMotores() < 1) {
			categoriaMotores = "motor invalido ";
		}else {
			categoriaMotores = "monomotor ";
		}
	}

	public String resultados() {
		return categoriaAsas+ categoriaMotores + asa.getTipoDeAsa() + tripulacao.getTripulacao()
				+ motor.getMotorizasao();

	}

	public static class Builder {

		private Integer quantidadeDeAsas;
		private Integer quantidadeDeMotores;
		private String nome;
		private String impulsdor;
		private Combustivel combustivel;
		private String porte;
		private String funcao;

		public Builder quantidadeDeAsas(final Integer quantidadeDeAsas) {
			this.quantidadeDeAsas = quantidadeDeAsas;
			return this;
		}

		public Builder quantidadeDeMotores(final Integer quantidadeDeMotores) {
			this.quantidadeDeMotores = quantidadeDeMotores;
			return this;
		}
		public Builder nome(final String nome) {
			this.nome = nome;
			return this;
		}
		public Builder impulsdor(final String impulsdor) {
			this.impulsdor = impulsdor;
			return this;
		}
		public Builder combustivel(final Combustivel combustivel) {
			this.combustivel = combustivel;
			return this;
		}
		public Builder porte(final String porte) {
			this.porte = porte;
			return this;
		}
		
		public Builder funcao(final String funcao) {
			this.funcao = funcao;
			return this;
	}

		public MotoPlanador build() {
			return new MotoPlanador(this);
		}
	}
	public String toString() {
		
		return"\n MotoPlanador: " 
				+  this.nome + " " 
				+ this.impulsdor + " " 
				+ this.combustivel+ " "
				+ this.porte + " " 
				+ this.funcao+ " "
				+ this.categoriaAsas + " "
				+ this.categoriaMotores + " "
				+ this.asa + " "
				+ this.tripulacao + " "
				+ this.motor + " ";
	}
}
