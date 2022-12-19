import java.util.Scanner;

public class Consumption {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		int distanciaPercorida = scr1.nextInt();
		float litrosConsumidos = scr1.nextFloat();
		float consumoPorLitro = distanciaPercorida / litrosConsumidos;
		System.out.printf("%.3f", consumoPorLitro);
		System.out.printf(" km/l\n");
		scr1.close();
	}

}
