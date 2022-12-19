
public class TesteMetodo {
	public static void main(String[] args) {
		Conta teste = new Conta();
		teste.saldo = 5000;
		System.out.println("saldo teste: " + teste.saldo);
		Conta teste2 = new Conta();
		teste2.saldo = 50;
		System.out.println("saldo teste2: " + teste2.saldo);
		teste.saca(100);
		System.out.println("saldo teste apos saca: "  + teste.saldo);
		teste.deposita(50);
		System.out.println("saldo teste apos deposita: " + teste.saldo);
		teste.transfere(500, teste2);
		System.out.println("saldo teste apos trasfere para teste2: " + teste.saldo);
		System.out.println("saldo teste2 apos receber trasfere de teste: " + teste2.saldo);
		
	}
}
