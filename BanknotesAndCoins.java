import java.util.Scanner;

public class BanknotesAndCoins {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		double valor = scr1.nextDouble();
		int resto = (int) (valor * 100.0 + 0.5);
		int cedulas100 = 100 * 100;
		int cedulas50 = 50 * 100;
		int cedulas20 = 20 * 100;
		int cedulas10 = 10 * 100;
		int cedulas5 = 5 * 100;
		int cedulas2 = 2 * 100;
		int moeda1 = 1 * 100;
		int moeda50 = 50;
		int moeda25 = 25;
		int moeda10 = 10;
		int moeda5 = 5;
		int moeda01 = 1;
		int calculo;
		
		System.out.println("NOTAS: ");
		calculo = (resto / cedulas100);//Notas de 100
		resto = (resto % cedulas100);
		System.out.println(calculo + " nota(s) de R$ 100,00");

		calculo = (resto / cedulas50);//Notas de 50
		resto = (resto % cedulas50);
		System.out.println(calculo + " nota(s) de R$ 50,00");

		calculo = (resto / cedulas20);//Notas de 20
		resto = (resto % cedulas20);
		System.out.println(calculo + " nota(s) de R$ 20,00");
		

		calculo = (resto / cedulas10);//Notas de 10
		resto = (resto % cedulas10);
		System.out.println(calculo + " nota(s) de R$ 10,00");

		calculo = (resto / cedulas5);//Notas de 5
		resto = (resto % cedulas5);
		System.out.println(calculo + " nota(s) de R$ 5,00");

		calculo = (resto / cedulas2);//Notas de 2
		resto = (resto % cedulas2);
		System.out.println(calculo + " nota(s) de R$ 2,00");
		
		System.out.println("MOEDAS :");

		calculo = (resto / moeda1);//Moedas de 1
		resto = (resto % moeda1);
		System.out.println(calculo + " moeda(s) de R$ 1,00");

		calculo = (resto / moeda50);//Moedas de 50
		resto = (resto % moeda50);
		System.out.println(calculo + " moeda(s) de R$ 0,50");
		
		calculo = (resto / moeda25);//Moedas de 25
		resto = (resto % moeda25);
		System.out.println(calculo + " moeda(s) de R$ 0,25");
		
		calculo = (resto / moeda10);//Moedas de 10
		resto = (resto % moeda10);
		System.out.println(calculo + " moeda(s) de R$ 0,10");
		
		calculo = (resto / moeda5);//Moedas de 5
		resto = (resto % moeda5);
		System.out.println(calculo + " moeda(s) de R$ 0,05");
		
		calculo = (resto / moeda01);//Moedas de 01
		resto = (resto % moeda01);
		System.out.println(calculo + " moeda(s) de R$ 0,01");


		scr1.close();
	}
}
