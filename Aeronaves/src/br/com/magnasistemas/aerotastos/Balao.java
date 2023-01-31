package br.com.magnasistemas.aerotastos;

import java.io.IOException;

import br.com.magnasistemas.arquivos.InputAerostastos;

public class Balao extends Aerotastos {
	public static String tipoBalao = null;
	public static void main(String[] args) throws IOException {
		
		
		if(InputAerostastos.pegaCombustivel().contains("Ar quente")) {
			tipoBalao = "Balão de Arquente";
		}else if (InputAerostastos.pegaCombustivel().contains("helio")||InputAerostastos.pegaCombustivel().contains("hidrogenio") 
				||InputAerostastos.pegaCombustivel().contains("amonia")||InputAerostastos.pegaCombustivel().contains("carvao"))  {
			tipoBalao = "Balão a Gas";
		}else if(InputAerostastos.pegaCombustivel().contains("hibrido")) {
			tipoBalao = "Balão Rozier";
		}
		System.out.println(InputAerostastos.pegaFuncao());
		System.out.println(InputAerostastos.pegaAlcance());
		System.out.println(InputAerostastos.pegaControle());
		System.out.println(InputAerostastos.pegaCabine());
		
	}
	

}
