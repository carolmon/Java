package br.com.magnasistemas.aerodinos;

import java.io.IOException;

import br.com.magnasistemas.interfaces.Pecas;

public class Aviao extends AsaFixa {
	public static  String classifacaoAsas = null;
	public static String classificacaoMotor = null;
	public static String aterragem = null;
	public static String tipoMotor = null;
	public static void main(String[] args) throws IOException {

		//String classificacaoMotor = null;
		
		if (Integer.parseInt(pegaQuantidadeMotores()) > 4) {
			classificacaoMotor = "multimotor";
		} else if (Integer.parseInt(pegaQuantidadeMotores()) == 4) {
			classificacaoMotor = "quadrimotor";
		} else if (Integer.parseInt(pegaQuantidadeMotores()) == 3) {
			classificacaoMotor = "trimotor";
		} else if (Integer.parseInt(pegaQuantidadeMotores()) == 2) {
			classificacaoMotor = "bimotor";
		} else if (Integer.parseInt(pegaQuantidadeMotores()) == 1) {
			classificacaoMotor = "monomotor";
		}
		
		if (Integer.parseInt(pegaQuantidadeAsas()) > 3) {
			classifacaoAsas = "limite de asas ultrapassado";
		} else if (Integer.parseInt(pegaQuantidadeAsas()) == 3) {
			classifacaoAsas = "triplano";
		} else if (Integer.parseInt(pegaQuantidadeAsas()) == 2) {
			classifacaoAsas = "biplanon";
		} else if (Integer.parseInt(pegaQuantidadeAsas()) == 1) {
			classifacaoAsas = "monoplano";
		}
		aterragem = Pecas.aterragem[Integer.parseInt(pegaAterragem())];
		tipoMotor = Pecas.tipoDeMotores[Integer.parseInt(pegaTipoDeMotor())];
	}

}
