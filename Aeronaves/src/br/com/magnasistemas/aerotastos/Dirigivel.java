package br.com.magnasistemas.aerotastos;

import java.io.IOException;

import br.com.magnasistemas.arquivos.InputAerostastos;

public class Dirigivel extends Aerotastos {
	public static String rigidez = null;

	public static void main(String[] args) throws IOException {

		if (InputAerostastos.pegaRigidez().contains("Semirígido")) {
			rigidez = "Dirigivel Semirígido";
		} else if (InputAerostastos.pegaRigidez().contains("Rígido")) {
			rigidez = "Dirigivel Rígido";
		} else if (InputAerostastos.pegaRigidez().contains("Não Rígido")) {
			rigidez = "Dirigivel Não Rígido";
		} else if (InputAerostastos.pegaRigidez().contains("Metal-Clad")) {
			rigidez = "Dirigivel Metal-Clad";
		} else if (InputAerostastos.pegaRigidez().contains("Híbrido")) {
			rigidez = "Dirigivel Híbrido";
		}

	}
}
