import java.util.Scanner;
public class Distance2 {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		int distanciaPercorrida = scr1.nextInt();
		int tempoMinutos = 2;
		int distanciaDiferensa = distanciaPercorrida * tempoMinutos;
		System.out.println(distanciaDiferensa + " minutos");
		scr1.close();
	}
}
