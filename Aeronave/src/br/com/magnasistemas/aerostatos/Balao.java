package br.com.magnasistemas.aerostatos;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.Tripulacao;

public class Balao extends Aerostatos{
	protected final OutrosComponentes cesto = OutrosComponentes.CESTO;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAOUNICA;
	protected Combustivel combustivel;
	

	public Balao(Builder builder) {

		
		this.nome = builder.nome;
		this.combustivel = builder.combustivel;
		this.funcao = builder.funcao;
		this.impulsdor = builder.impulsdor;
		this.porte = builder.porte;
	
		switch (combustivel) {
			case AR_QUENTE:
				flutuabilidade = "balão de ar quente ";
				break;
			case HELIO:
				flutuabilidade = "balão a gas ";
				break;
			case AR_QUENTE_HELIO:
				flutuabilidade = "balão de rozier ";
				break;
			case 
			default:
				flutuabilidade = "balão invalido ";
				break;
		}
		
	}

	public String resultados() {
		return nome 
			   +impulsdor 
			   +porte
			   +funcao
			   +combustivel
			   +flutuabilidade 
			   +tripulacao.getTripulacao()
			   + cesto.getComponentes();
		
	}

	public static class Builder {

		private Combustivel combustivel;
		private String flutuabilidade;
		private String nome;
		private String impulsdor;
		private String porte;
		private String funcao;

		public Builder combustivel(final Combustivel combustivel) {
			this.combustivel = combustivel;
			return this;
		}
		public Builder flutuabilidade(final String flutuabilidade) {
			this.flutuabilidade = flutuabilidade;
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
		public Builder porte(final String porte) {
			this.porte = porte;
			return this;
		}
		public Builder funcao(final String funcao) {
			this.funcao = funcao;
			return this;
		}

		
		public Balao build() {
			return new Balao(this);
		}
	}
	@Override
	public String toString() {
		
		return"\n Balão: " 
				+this.nome + " " 
				+this.impulsdor + " "
				+this.combustivel+ " "
				+this.flutuabilidade+ " "
				+this.porte+ " " 
				+this.funcao+ " "
				+this.tripulacao+ " "
				+this.cesto+ " ";
	}
}
