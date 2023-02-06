package br.com.magnasistemas.aerodino;

import br.com.magnasistemas.aerodino.Aviao.Builder;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public class DroneAsaFixa extends Aerodino {
	protected final TipoDeAsa asa = TipoDeAsa.FIXA;
	protected final OutrosComponentes controle = OutrosComponentes.CONTROLEREMOTO;
	protected final Tripulacao tripulacao = Tripulacao.NTRIPULADO;
	protected final OutrosComponentes camera = OutrosComponentes.CAMERA;
	protected final Motorizasao motor = Motorizasao.MOTORPISTAO;
	protected String categoriaAsas;
	protected String categoriaMotores;

	public DroneAsaFixa(Builder builder) {
		
		this.nome = builder.nome;
		this.combustivel = builder.combustivel;
		this.funcao = builder.funcao;
		this.impulsdor = builder.impulsdor;
		this.porte = builder.porte;
		this.quantidadeDeAsas = builder.quantidadeDeAsas;
		this.quantidadeDeMotores = builder.quantidadeDeMotores;
		if (getQuantidadeDeAsas() > 1 && getQuantidadeDeAsas() < 1) {
			categoriaAsas = "quantidade de asas invalidas ";
		} else {
			categoriaAsas = "monoplano ";
		}

		if (getQuantidadeDeMotores() > 1 && getQuantidadeDeMotores() < 1) {
			categoriaMotores = "quantidade de motores invalidos ";
		} else {
			categoriaMotores = "monomotor ";
		}
	}

	public String resultados() {
		return nome + impulsdor+ combustivel+ porte + funcao +
	    categoriaAsas + categoriaMotores + asa.getTipoDeAsa() + controle.getComponentes()
		+ camera.getComponentes() + tripulacao.getTripulacao() + motor.getMotorizasao();

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

		public DroneAsaFixa build() {
			return new DroneAsaFixa(this);
		}
	}
	@Override
	public String toString() {
	
		return"\n Drone Asa Fixa: " 
				+ this.nome + " " 
				+ this.impulsdor + " " 
				+ this.combustivel+ " "
				+ this.porte + " " 
				+ this.funcao+ " "
				+ this.categoriaMotores+" "
				+ this.categoriaAsas+" "
				+ this.asa+" "
				+ this.controle+" "
				+ this.camera+" "
				+ this.tripulacao+" "
				+ this.motor+" ";
	}

}
