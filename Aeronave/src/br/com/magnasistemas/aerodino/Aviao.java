package br.com.magnasistemas.aerodino;

import java.io.IOException;

import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.TipoAeronave;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public class Aviao extends Aerodino {

	protected final TipoDeAsa asa = TipoDeAsa.FIXA;
	protected final OutrosComponentes caixaPreta = OutrosComponentes.CAIXAPRETA;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAOPOLI;
	protected final Motorizasao motor = Motorizasao.MOTORJATOPISTAO;
	protected String categoriaAsas;
	protected String categoriaMotores;

	public Aviao(Builder builder) {

		this.nome = builder.nome;
		this.combustivel = builder.combustivel;
		this.funcao = builder.funcao;
		this.impulsdor = builder.impulsdor;
		this.porte = builder.porte;
		this.quantidadeDeAsas = builder.quantidadeDeAsas;
		this.quantidadeDeMotores = builder.quantidadeDeMotores;

		switch (getQuantidadeDeAsas()) {

		case 0:
			categoriaAsas = " Asa invalido ";
			break;
		case 1:
			categoriaAsas = " monoplano ";
			break;
		case 2:
			categoriaAsas = " biplano ";
			break;
		case 3:
			categoriaAsas = " triplano ";
			break;
		default:
			categoriaAsas = " limite de asas ultrapasado  ";
			break;
		}
		switch (getQuantidadeDeMotores()) {

		case 0:
			categoriaMotores = " motor invalido ";
			break;
		case 1:
			categoriaMotores = " monomotor ";
			break;
		case 2:
			categoriaMotores = " bimotor ";
			break;
		case 3:
			categoriaMotores = " trimotor ";
			break;
		case 4:
			categoriaMotores = " quadrimotor ";
			break;
		default:
			categoriaMotores = " multimotor  ";
			break;
		}

	}

	public String resultados() {
		return nome + impulsdor + combustivel + porte + funcao + categoriaAsas + categoriaMotores + asa.getTipoDeAsa()
				+ caixaPreta.getComponentes() + tripulacao.getTripulacao() + motor.getMotorizasao();

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

		public Aviao build() {
			return new Aviao(this);
		}
	}

	@Override
	public String toString() {

		return "\n Avião: " 
				+ this.nome + " " 
				+ this.impulsdor + " " 
				+ this.combustivel + " " 
				+ this.porte + " "
				+ this.funcao + " " 
				+ this.categoriaAsas + " " 
				+ this.categoriaMotores+ " " 
				+ this.asa+ " " 
				+ this.caixaPreta+ " "
				+ this.tripulacao+ " "
				+ this.motor+ " ";
	}
}
