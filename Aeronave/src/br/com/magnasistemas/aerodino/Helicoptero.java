package br.com.magnasistemas.aerodino;

import br.com.magnasistemas.aerodino.DroneAsaFixa.Builder;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public class Helicoptero extends Aerodino {
	protected final TipoDeAsa helice = TipoDeAsa.ROTATIVA;
	protected final Motorizasao motor = Motorizasao.MOTORROTATORIO;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAODUPLA;
	protected final OutrosComponentes manche = OutrosComponentes.MANCHE;
	protected String categoriaRotores;

	public Helicoptero(Builder builder) {
		this.nome = builder.nome;
		this.combustivel = builder.combustivel;
		this.funcao = builder.funcao;
		this.impulsdor = builder.impulsdor;
		this.porte = builder.porte;
		this.quantidadeDeMotores = builder.quantidadeDeMotores;
		if (getQuantidadeDeMotores() == 2) {
			categoriaRotores = "rotor convencional ";
		} else if (getQuantidadeDeMotores() == 2) {
			categoriaRotores = "monogiro  ";
		}

		else {
			categoriaRotores = "quantidade de motores invalidos  ";
		}
	}

	public String resultados() {
		return nome + impulsdor + combustivel + porte + funcao + categoriaRotores + helice.getTipoDeAsa()
				+ manche.getComponentes() + tripulacao.getTripulacao() + motor.getMotorizasao();

	}

	public static class Builder {

		private Integer quantidadeDeMotores;
		private String nome;
		private String impulsdor;
		private Combustivel combustivel;
		private String porte;

		private String funcao;

		public Builder quantidadeDeMotores(final Integer quantidadeDeMotores) {
			this.quantidadeDeMotores = quantidadeDeMotores;
			return this;
		}

		public Helicoptero build() {
			return new Helicoptero(this);
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
	}
	@Override
	public String toString() {
	
		return"\n Helicoptero: "
				+this.nome + " " 
				+ this.impulsdor + " " 
				+ this.combustivel+ " "
				+ this.porte + " " 
				+ this.funcao+ " " 
				+ this.categoriaRotores+ " "
				+ this.helice+ " " 
				+ this.manche+ " " 
				+ this.tripulacao+ " " 
				+ this.motor+ " " ;
	}
}
