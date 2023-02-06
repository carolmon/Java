package br.com.magnasistemas.aerodino;

import br.com.magnasistemas.aerodino.Aviao.Builder;
import br.com.magnasistemas.enums.Combustivel;
import br.com.magnasistemas.enums.Motorizasao;
import br.com.magnasistemas.enums.OutrosComponentes;
import br.com.magnasistemas.enums.TipoDeAsa;
import br.com.magnasistemas.enums.Tripulacao;

public class DroneAsaRotativa extends  Aerodino{
	protected final TipoDeAsa helice = TipoDeAsa.ROTATIVA;
	protected final OutrosComponentes controle = OutrosComponentes.CONTROLEREMOTO;
	protected final OutrosComponentes camera = OutrosComponentes.CAMERA;
	protected final Motorizasao motor = Motorizasao.MOTORROTATORIO;
	protected final Tripulacao tripulacao = Tripulacao.NTRIPULADO;
	protected String categoriaRotores = null;
	
	
	public DroneAsaRotativa(Builder builder) {
		this.nome = builder.nome;
		this.combustivel = builder.combustivel;
		this.funcao = builder.funcao;
		this.impulsdor = builder.impulsdor;
		this.porte = builder.porte;
		this.quantidadeDeMotores = builder.quantidadeDeMotores;
		
		switch(getQuantidadeDeMotores()) {
		case 1:
			categoriaRotores = "rotor unico ";
			break;
		case 3:
			categoriaRotores = "tricóptro ";
			break;
		case 4:
			categoriaRotores = "quadcótero ";
			break;
		case 6:
			categoriaRotores = "hexacóptero ";
			break;
		case 8:
			categoriaRotores = "octocóptero ";
			break;
		}

	}

	public String resultados() {
		return nome + impulsdor+ combustivel+ porte + funcao +
		categoriaRotores + helice.getTipoDeAsa() + controle.getComponentes() +
		tripulacao.getTripulacao() + motor.getMotorizasao() ;

		
	}

	public static class Builder {

		private Integer quantidadeDeMotores;
		private String nome;
		private String impulsdor;
		private Combustivel combustivel;
		private String porte;
		private Integer areaDePouso;
		private String funcao;


		public Builder quantidadeDeMotores(final Integer quantidadeDeMotores) {
			this.quantidadeDeMotores = quantidadeDeMotores;
			return this;
		}

		public DroneAsaRotativa build() {
			return new DroneAsaRotativa(this);
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
		public Builder areaDePouso(final Integer areaDePouso) {
			this.areaDePouso = areaDePouso;
			return this;
		}
		public Builder funcao(final String funcao) {
			this.funcao = funcao;
			return this;
		}
	}
	@Override
	public String toString() {
	
		return"\n Drone Asa Fixa: " 
				+  this.nome + " " 
				+ this.impulsdor + " " 
				+ this.combustivel + " "
				+ this.porte + " " 
				+ this.funcao+ " "
				+ this.categoriaRotores+ " "
				+ this.helice+ " "
				+ this.controle+ " "
				+ this.tripulacao+ " "
				+ this.motor+ " ";
	}
}
