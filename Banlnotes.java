import java.util.Scanner;

public class Banlnotes {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		int valor = scr1.nextInt();
		int cedulas100 = 100;
		int cedulas50 = 50;
		int cedulas20 = 20;
		int cedulas10 = 10;
		int cedulas5 = 5;
		int cedulas2 = 2;
		int cedulas1 = 1;

		System.out.println(valor);

		if (valor > cedulas100 || valor >= cedulas100) {
			int calculo = (valor / cedulas100);
			int mod = (valor % cedulas100);
			System.out.println(calculo + " nota(s) de R$ 100,00");
			valor = mod;
		} else {
			System.out.println("0 nota(s) de R$ 100,00");
		}
		if (valor > cedulas50 || valor >= cedulas50) {
			int calculo = (valor / cedulas50);
			int mod = (valor % cedulas50);
			System.out.println(calculo + " nota(s) de R$ 50,00");
			valor = mod;
		} else {
			System.out.println("0 nota(s) de R$ 50,00");
		}
		if (valor > cedulas20 || valor >= cedulas20) {
			int calculo = (valor / cedulas20);
			int mod = (valor % cedulas20);
			System.out.println(calculo + " nota(s) de R$ 20,00");
			valor = mod;
		} else {
			System.out.println("0 nota(s) de R$ 20,00");
		}
		if (valor > cedulas10 || valor >= cedulas10) {
			int calculo = (valor / cedulas10);
			int mod = (valor % cedulas10);
			System.out.println(calculo + " nota(s) de R$ 10,00");
			valor = mod;
		} else {
			System.out.println("0 nota(s) de R$ 10,00");
		}
		if (valor > cedulas5 || valor >= cedulas5) {
			int calculo = (valor / cedulas5);
			int mod = (valor % cedulas5);
			System.out.println(calculo + " nota(s) de R$ 5,00");
			valor = mod;
		} else {
			System.out.println("0 nota(s) de R$ 5,00");
		}
		if (valor > cedulas2 || valor >= cedulas2) {
			int calculo = (valor / cedulas2);
			int mod = (valor % cedulas2);
			System.out.println(calculo + " nota(s) de R$ 2,00");
			valor = mod;
		} else {
			System.out.println("0 nota(s) de R$ 2,00");
		}
		if (valor > cedulas1 || valor >= cedulas1) {
			int calculo = (valor / cedulas1);
			int mod = (valor % cedulas1);
			System.out.println(calculo + " nota(s) de R$ 1,00");
			valor = mod;
		} else {
			System.out.println("0 nota(s) de R$ 1,00");
		}

		scr1.close();

		// System.out.println();
	}
}
