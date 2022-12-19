import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		int segundos = scr1.nextInt();
		int mod;
		int horas;
		int minutos;

		if (segundos > 3600 || segundos >= 3600) {
			horas = segundos / 3600;
			mod = segundos % 3600;
			segundos = mod;
		} else {
			horas = 0;
		}
		if (segundos > 60 || segundos >= 60) {
			minutos = segundos / 60;
			mod = segundos % 60;
			segundos = mod;
		} else {
			minutos = 0;
		}
		System.out.println(horas + ":" + minutos + ":" + segundos);
		scr1.close();
	}

}
