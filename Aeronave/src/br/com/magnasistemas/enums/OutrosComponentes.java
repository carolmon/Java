package br.com.magnasistemas.enums;

public enum OutrosComponentes {
	GONDOLA("gondola "),CESTO("cesto "),CAIXAPRETA("caixa preta "),BAGAGEIRO("bagageiro "),MANCHE("manche "),CONTROLEREMOTO("controle remoto "), 
	CAMERA("camera "), LEME("leme ");
	private final String componentes;
	OutrosComponentes(String valorOpcao){
		componentes = valorOpcao;
	}
	public String getComponentes() {
		return componentes;
	}
}
