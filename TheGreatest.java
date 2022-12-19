import java.util.Scanner;

public class TheGreatest {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int valorA = sc1.nextInt();
		int valorB = sc1.nextInt();
		int valorC = sc1.nextInt();
		int maiorAB = (valorA + valorB + Math.abs(valorA - valorB)) / 2;
		int maiorAC = (maiorAB + valorC + Math.abs(maiorAB - valorC)) / 2;

		System.out.println(maiorAC + " eh o maior");
		sc1.close();
	}

}
