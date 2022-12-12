import java.util.Scanner;

public class SimpleCalculate {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int CodigoProdutuo1 = sc1.nextInt();
		int UindadeProdutuo1 = sc1.nextInt();
		float ValorUnidadeProduto1 = sc1.nextFloat();
		int CodigoProdutuo2 = sc1.nextInt();
		int UnidadeProdutuo2 = sc1.nextInt();
		float ValorUnidadeProdutuo2 = sc1.nextFloat();
		float TotalProduto1 = UindadeProdutuo1 * ValorUnidadeProduto1;
		float TotalProduto2 = UnidadeProdutuo2 * ValorUnidadeProdutuo2;
		float TotalCompra = TotalProduto1 + TotalProduto2;
		System.out.printf("VALOR A PAGAR: %.2f\n", TotalCompra);
		sc1.close();
	}
}
