
public class TesteArrayDePrimitivos {
	public static void main(String[] args) {
		int[] idades = new int[5];
		
		idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;
        
        int idade4 = idades[3];

        System.out.println(idade4);
        System.out.println(idades.length);
        
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        ContaPoupanca cc2 = new ContaPoupanca(22, 22);

        contas[0] = cc1;
        contas[1] = cc2;
        
        System.out.println(contas[1].getnumero()  );

        // alterou o tipo, agora compila
        Conta ref = contas[0];
        System.out.println(cc2.getnumero());
        System.out.println(ref.getnumero());
        
        
	}
}
