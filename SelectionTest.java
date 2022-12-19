import java.util.Scanner;

public class SelectionTest {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		int A = scr1.nextInt();
		int B = scr1.nextInt();
		int C = scr1.nextInt();
		int D = scr1.nextInt();
		int somaCD = C + D;
		int somaAB = A + B;

		if ((B > C || D > A) || (somaCD < somaAB) || (C > 0 || D > 0) || (A % 2 == 0)) {

			System.out.println("Valor aceitos");

		} else {
			System.out.println("Valores nao aceitos");
		}

		scr1.close();
	}
}
