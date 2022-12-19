import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		float X1 = scr1.nextFloat();
		float Y1 = scr1.nextFloat();
		float X2 = scr1.nextFloat();
		float Y2 = scr1.nextFloat();
		double P1 = Math.pow((X2 - X1), 2);
		double P2 = Math.pow((Y2 - Y1), 2);
		double resultadoPlano = Math.sqrt((P1 + P2));
		System.out.printf("%.4f", resultadoPlano);
		System.out.printf("");
		scr1.close();
	}
}
