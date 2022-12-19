import java.util.Scanner;

public class Sphere {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		double raio = sc1.nextDouble();
		double tmp = Math.pow(raio, 3);
		double pi = 3.14159;
		double volume = (4 / 3.0) * pi * tmp;
		System.out.printf("VOLUME = %.3f\n", volume);
		sc1.close();
	}

}
