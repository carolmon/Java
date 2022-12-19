import java.util.Scanner;

public class SimpleProduct {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int primeiroInteiro = sc1.nextInt();
		int segundoInteiro = sc1.nextInt();
		int PROD = primeiroInteiro * segundoInteiro;
		sc1.close();
		System.out.println("PROD = " + PROD);
	}

}
