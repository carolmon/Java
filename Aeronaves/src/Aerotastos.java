
public class Aerotastos extends Aeronave {
	String tipoDeGas;

	String verificaTipoDeGas() {
		String[] gasNAquecido = { "helio", "hidrogenio", "amonia", "carv�o" };
		int limite = gasNAquecido.length;
		boolean gasValido = false;
		// verifica se o tipo de gas � misto
		if (getCombustivel().contains("ar") && getCombustivel().contains("ar")) {
			tipoDeGas = "Rozier";
			gasValido = true;
		}
		// verifica se o tipo de gas � o aquecido
		else if (getCombustivel().contains("ar")) {
			tipoDeGas = "Ar Qunete";
			gasValido = true;
		}
		// Verifica se o tipo de gas � o n�o aquecido
		for (int contador = 0; contador < limite; contador++) {
			if (getCombustivel().contentEquals(gasNAquecido[contador])) {
				tipoDeGas = "A Gas";
				gasValido = true;

			}
		}
		if (gasValido = false) {
			System.out.println("gas invalido");
		}
		return verificaTipoDeGas();

	}

	public String getTipoDeGas() {
		return tipoDeGas;
	}

	public void setTipoDeGas(String tipoDeGas) {
		this.tipoDeGas = tipoDeGas;
	}

	// controle
	boolean controle;

	public boolean getControle() {
		return controle;
	}

	public void setControle(boolean controle) {
		this.controle = tripulacao;
	}

	// cabine
	boolean cabine;

	public boolean getCabine() {
		return cabine;
	}

	public void setCabine(boolean cabine) {
		this.cabine = cabine;
	}

}
