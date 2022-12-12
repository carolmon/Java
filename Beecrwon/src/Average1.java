import java.util.Scanner;

public class Average1 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		double A = sc1.nextDouble();
		double B = sc1.nextDouble();
		A = A*3.5;
		B = B*7.5;
		double media = (A + B) / 11;
		System.out.printf("MEDIA = %.5f\n ",  media);
		sc1.close();
	}
}
