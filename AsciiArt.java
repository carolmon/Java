
public class AsciiArt {
	public static void main(String[] args) {
		char asterisco = '*';
		char espaso = ' ';

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna <= 6; coluna++) { // Letra C
				if (linha == 0 && coluna < 5 || linha == 4 && coluna < 5) {
					System.out.print(asterisco);
				} else if (coluna == 0) {
					System.out.print(asterisco);
				} else {
					System.out.print(espaso);
				}
			}

			for (int coluna = 0; coluna <= 6; coluna++) {// Letra A
				if (linha == 0 && coluna < 5 || linha == 2 && coluna < 5) {
					System.out.print(asterisco);
				} else if (coluna == 0 || coluna == 4) {
					System.out.print(asterisco);
				} else {
					System.out.print(espaso);
				}

			}

			for (int coluna = 0; coluna <= 6; coluna++) { // Letra R
				if (linha == 0 && coluna < 5 || linha == 2 && coluna < 5 || linha == 3 && coluna < 3 && coluna > 1
						|| linha == 4 && coluna >= 3 && coluna < 4) {
					System.out.print(asterisco);
				} else if (coluna == 0 || coluna == 4 && linha < 3) {
					System.out.print(asterisco);
				} else {
					System.out.print(espaso);
				}

			}
			for (int coluna = 0; coluna <= 6; coluna++) { // Letra 0
				if (linha == 0 && coluna < 5 || linha == 4 && coluna < 5) {
					System.out.print(asterisco);
				} else if (coluna == 0 || coluna == 4) {
					System.out.print(asterisco);
				} else {
					System.out.print(espaso);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // Letra L
				if (linha == 4 && coluna < 5) {
					System.out.print(asterisco);
				} else if (coluna == 0) {
					System.out.print(asterisco);
				} else {
					System.out.print(espaso);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // Letra i
				if (coluna == 2 && linha <= 0) {
					System.out.print(asterisco);
				} else if (coluna == 2 && linha == 1) {
					System.out.print(espaso);
				}else if (coluna == 2 && linha <= 5) {
					System.out.print(asterisco);}
				else {
					System.out.print(espaso);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // Letra N
				if (coluna == 0 || coluna == 5) {
					System.out.print(asterisco);
				} else if (coluna == 0 || coluna == 1 && linha == 1 || coluna == 2 && linha == 2
						|| coluna == 3 && linha == 3) {
					System.out.print(asterisco);
				} else {
					System.out.print(espaso);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) {// Letra A
				if (linha == 0 && coluna < 5 || linha == 2 && coluna < 5) {
					System.out.print(asterisco);
				} else if (coluna == 0 || coluna == 4) {
					System.out.print(asterisco);
				} else {
					System.out.print(espaso);
				}

			}
			System.out.println();
		}
	}
}
