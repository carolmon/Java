import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		float valorA = sc1.nextFloat();
		float valorB = sc1.nextFloat();
		float valorC = sc1.nextFloat();
		double Pi = 3.14159;
		double areaTriangulo = (valorA * valorC) / 2;
		System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
		double areaCirculo = Pi * (Math.pow(valorC, 2));
		System.out.printf("CIRCULO: %.3f\n", areaCirculo);
		double areaTrapezio = 0.5 * (valorC * (valorA + valorB));
		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
		double areaQuadrado = Math.pow(valorB, 2);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		double areaRetangulo = valorA * valorB;
		System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
		sc1.close();

	}
}
