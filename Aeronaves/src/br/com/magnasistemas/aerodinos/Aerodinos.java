package br.com.magnasistemas.aerodinos;


import br.com.magnasistemas.aeronave.Aeronave;

public class Aerodinos extends Aeronave{
	//Tratamento motores
	int quantidadeMotores;
	
	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}
	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
	
	
	//tratamento Asa
	int quantiadeAsa;
	
	public int getQuantiadeAsa() {
		return quantiadeAsa;
	}
	public void setQuantiadeAsa(int quantiadeAsa) {
		this.quantiadeAsa = quantiadeAsa;
	}
	//verifica se tem 
	public void temAsa() {
		if(getQuantiadeAsa()==0) {
			System.out.println("asa ñ pode ser 0");
		}
	}
	
}
