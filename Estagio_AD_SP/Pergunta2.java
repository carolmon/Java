import java.util.Scanner;

public class Pergunta2 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int numeroIncerido = numero.nextInt();
		int contador = 0;
		int num1 = 0, num2 = 1;
		int soma = num1 + num2;
		while (contador < 50) {
			soma = num1 + num2;
			num2 =soma; 
			num1 ++;
			if(numeroIncerido == num1 || numeroIncerido == num2) {
				System.out.println("numero incerido pertence a sequencia");
				contador =50;
			}else {
				contador++;	
			}
			
			
		}
		numero.close();
	}
}
