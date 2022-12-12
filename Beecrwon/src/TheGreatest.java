import java.util.Scanner;

public class TheGreatest {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int valorA = sc1.nextInt();
		int valorB = sc1.nextInt();
		int valorC = sc1.nextInt();
		int calculo = (valorA + valorB + valorC * (valorA - valorB));
		System.out.println(calculo + " eh o maior");
		sc1.close();
	}

}
