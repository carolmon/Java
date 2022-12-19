import java.util.Scanner;

public class Snack {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		int lanche = scr1.nextInt();
		int quantidadeLanche = scr1.nextInt();
		switch (lanche) {
		case 1:
			System.out.printf("Total: R$ %.2f%n" , (4.00 * quantidadeLanche));
			break;
		case 2:
			System.out.printf("Total: R$ %.2f%n" , (4.50 * quantidadeLanche));
			break;
		case 3:
			System.out.printf("Total: R$ %.2f%n" , (5.00 * quantidadeLanche));
			break;
		case 4:
			System.out.printf("Total: R$ %.2f%n" , (2.00 * quantidadeLanche));
			break;
		case 5:
			System.out.printf("Total: R$ %.2f%n", (1.50 * quantidadeLanche));
			break;
		}

		scr1.close();
	}
}
