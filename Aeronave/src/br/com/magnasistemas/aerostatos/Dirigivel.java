package br.com.magnasistemas.aerostatos;

import br.com.magnasistemas.aerodino.Aviao;
import br.com.magnasistemas.aerodino.Aviao.Builder;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.Rigidez;
import br.com.magnasistemas.enums.Tripulacao;

public class Dirigivel extends Aerostatos {
	protected final OutrosComponentes gondola = OutrosComponentes.GONDOLA;
	protected final OutrosComponentes leme = OutrosComponentes.LEME;
	protected final Tripulacao tripulacao = Tripulacao.TRIPULACAODUPLA;
	protected Rigidez rigidez;

	public Dirigivel(Builder builder) {
		this.nome = builder.nome;
		this.combustivel = builder.combustivel;
		this.funcao = builder.funcao;
		this.impulsdor = builder.impulsdor;
		this.funcao = builder.funcao;
		this.porte = builder.porte;
		this.rigidez = builder.rigidez;
		

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

	public static class Builder {

		private Rigidez rigidez;
		private String flutuabilidade;
		private String nome;
		private String impulsdor;
		private Combustivel combustivel;
		private String porte;
		private String funcao;
		
		public Builder rigidez(final Rigidez rigidez) {
			this.rigidez = rigidez;
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

		public Dirigivel build() {
			return new Dirigivel(this);
		}
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
