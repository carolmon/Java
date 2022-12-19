import java.io.IOException;
import java.util.Scanner;

public class Salary2 {

	public static void main(String[] args) throws IOException {

		Scanner sc1 = new Scanner(System.in);
		//System.out.println("Nome....: ");
		String nomeVendedor = sc1.nextLine();
		System.out.println(nomeVendedor);
		//System.out.println("Salario.: ");
		float salarioFixo = sc1.nextFloat();
		//System.out.println(salarioFixo);
		//System.out.println("Vendas..: ");
		float totalDeVendas = sc1.nextFloat();
		//System.out.println(totalDeVendas);
		double porcentagem =  Math.floor(totalDeVendas * 15) / 100;
		//System.out.println(porcentagem);
		double salarioTotal = salarioFixo + porcentagem;
		System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
		sc1.close();

	}

}