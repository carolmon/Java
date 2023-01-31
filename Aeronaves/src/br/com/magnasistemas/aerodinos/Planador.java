package br.com.magnasistemas.aerodinos;

import java.io.IOException;

import br.com.magnasistemas.interfaces.Pecas;

public class Planador extends AsaFixa {
	public static  String classifacaoAsas = null;
	public static String classificacaoMotor = null;
	public static  String nomePlanadorString = null;
	public static String tipoPlanador = null;
	public static void main(String[] args) throws IOException {
	
		if (getTrataMotor() == true) {
			tipoPlanador = "Motoplanador";
			
			if (Integer.parseInt(pegaQuantidadeMotores()) > 1 && Integer.parseInt(pegaQuantidadeAsas()) > 1) {
				System.out.println("ñ pode ter mais de um motor");
			}else {
				classificacaoMotor ="monomotor";
				classifacaoAsas = "monoplano";
			}
			
		} else {
			tipoPlanador = "Planador";
		}
		if (Integer.parseInt(pegaQuantidadeAsas()) > 1) {
			System.out.println("ñ pode ter mais de uma asa");
		}else {
			classifacaoAsas = "monoplano";
		}
		aterragem = Pecas.aterragem[Integer.parseInt(pegaAterragem())];

	}
}
