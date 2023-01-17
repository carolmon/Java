
public class Aerodinos extends Aeronave{
	//Array tipo de Asa
	String tipoDeAsa;
	
	//Quantidade de motores
	int quantidadeMotores;
	//Quantidade de asas
	int quantideAsas;
	public String getTipoDeAsa() {
		return tipoDeAsa;
	}
	public void setTipoDeAsa(String tipoDeAsa) {
		this.tipoDeAsa = tipoDeAsa;
	}
	
	String verificaAsa() {
		String[] asa = { "Baixa", "Media", "Alta", "Parassol" };
		int limite = asa.length;
		boolean asaValida = false;
		// Verifica se o tipo de gas é o não aquecido
				for (int contador = 0; contador < limite; contador++) {
					if (getTipoDeAsa().contentEquals(asa[contador])) {
						asaValida = true;

					}
					if (asaValida = false) {
						System.out.println("ñ pode ñ ter asa");
					}
					return verificaAsa();
				}
				return tipoDeAsa;
	}
	
	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}
	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
	public int getQuantideAsas() {
		return quantideAsas;
	}
	public void setQuantideAsas(int quantideAsas) {
		this.quantideAsas = quantideAsas;
	}
	
}
