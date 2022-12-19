import java.util.Scanner;

public class AgeInDays {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		int dias = scr1.nextInt();
		int mod;
		int diasAnos;
		int diasMes;

		if (dias > 365 || dias >= 365) {
			diasAnos = dias / 365;
			mod = dias % 365;
			dias = mod;
		} else {
			diasAnos = 0;
		}
		if (dias > 30 || dias >= 30) {
			diasMes = dias / 30;
			mod = dias % 30;
			dias = mod;
		} else {
			diasMes = 0;
		}
		System.out.println(diasAnos + " ano(s)");
		System.out.println(diasMes + " mes(es)");
		System.out.println(dias + " dia(s)");
		scr1.close();

	}
}
