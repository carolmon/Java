package br.com.magnasistemas.aerodino;

import br.com.magnasistemas.aerodino.MotoPlanador.Builder;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public class Planador extends Aerodino {
	protected final TipoDeAsa asa = TipoDeAsa.FIXA;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAOUNICA;
	protected final Motorizasao motor = Motorizasao.NMOTORIZADO;
	static String categoriaAsas = null;

	public Planador(Builder builder) {
		
		this.nome = builder.nome;
		this.combustivel = builder.combustivel;
		this.funcao = builder.funcao;
		this.impulsdor = builder.impulsdor;
		this.porte = builder.porte;
		this.quantidadeDeAsas = builder.quantidadeDeAsas;

		if (getQuantidadeDeAsas() > 1 && getQuantidadeDeAsas() < 1) {
			categoriaAsas = "asa invalida";
		} else {
			categoriaAsas = "monoplano";
		}
	}

	public String resultados() {
		return nome + impulsdor+ combustivel+ porte +  funcao +
		categoriaAsas + asa.getTipoDeAsa() + tripulacao.getTripulacao()+ motor.getMotorizasao();

	}

	public static class Builder {

		private Integer quantidadeDeAsas;
		private String nome;
		private String impulsdor;
		private Combustivel combustivel;
		private String porte;
		private String funcao;

		public Builder quantidadeDeAsas(final Integer quantidadeDeAsas) {
			this.quantidadeDeAsas = quantidadeDeAsas;
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

		public Planador build() {
			return new Planador(this);
		}
	}
	public String toString() {
		
		return"\n Planador: " 
				+  this.nome + " " 
				+ this.impulsdor + " " 
				+ this.combustivel+ " "
				+ this.porte + " " 
				+ this.funcao+ " "
				+ this.categoriaAsas+ " "
				+ this.asa+ " "
				+ this.tripulacao+ " "
				+ this.motor+ " ";
	}
}
