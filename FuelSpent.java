import java.util.Scanner;

public class FuelSpent {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		int tempoGasto = scr1.nextInt();
		float velocidadeMedia = scr1.nextFloat();
		float consumoMedio = 12;
		float distanciaTotal = tempoGasto * velocidadeMedia;
		float consumoTotal = distanciaTotal / consumoMedio;
		System.out.printf("%.3f", consumoTotal);
		System.out.println();
		scr1.close();
	}

}
