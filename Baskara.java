import java.util.Scanner;
public class Baskara {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		double valorA = sc1.nextDouble();
		double valorB = sc1.nextDouble();
		double valorC = sc1.nextDouble();
		double resultado1, resultado2, divisao, divisao2, raizQuadrada;
		
		raizQuadrada = Math.sqrt(Math.pow(valorB, 2));
		divisao = -valorB - raizQuadrada - 4 * valorA * valorC;
		divisao2 = -valorB + raizQuadrada - 4 * valorA * valorC;
		
		if(raizQuadrada < 0 || divisao == 0.0 || divisao2 == 0.0) {
			System.out.println("Impossivel calcular");
		}else {
			resultado1 = (-valorB - raizQuadrada - 4 * valorA * valorC)/(2*valorA);
			resultado2 = (-valorB + raizQuadrada - 4 * valorA * valorC)/(2*valorA);
			System.out.println("R1 = "+ resultado1);
			System.out.println("R2 = "+ resultado2);
		}
		
		
		
		
		
		
		
		
		
		
		sc1.close();
	}
}
