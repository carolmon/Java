import java.util.Scanner;

public class Intervalo {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		double valor = sc1.nextDouble();
		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (valor >= 25.00001 && valor <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (valor >= 50.00001 && valor <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (valor >= 75.00001 && valor <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

		sc1.close();
	}
}
