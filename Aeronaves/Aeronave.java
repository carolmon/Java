abstract class Aeronave {
	
	//tripulação
	public boolean tripulacao;

	public boolean getTripulacao() {
		return tripulacao;
	}

	public void setTripulacao(boolean tripulacao) {
		this.tripulacao = tripulacao;
	}
	 
	//motor
	public boolean motor;
	public boolean getMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	//porte
	public  String porte;
	public String getPorte() {
		return porte;
	}
	
	public void setPorte(String porte) {
		this.porte = porte;
	}
	//função
	public  String funcao;
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	//combustivel
	public String combustivel;
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel() {
		this.combustivel = combustivel;
	}
	//area de pouso
	public String areaDePouso;
	public String getAreaDePouso() {
		return areaDePouso;
	}
	public void setAreaDePouso() {
		this.areaDePouso = areaDePouso;
	}
	public void decolagem() {
		
	}
	public void pousa() {
		
	}
	public void abastace() {
	}
	
  }