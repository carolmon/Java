package Distribuidora;



public class Distribuidora {
    public static void main(String[] args) {
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;
        double porcentagemSP = faturamentoTotal/faturamentoSP;
        double porcentagemRJ = faturamentoTotal/faturamentoRJ;
        double porcentagemMG = faturamentoTotal/faturamentoMG;
        double porcentagemES = faturamentoTotal/faturamentoES;
        double porcentagemOutros = faturamentoTotal/faturamentoOutros;

        System.out.printf("O percentual de São Paulo : %.2f%n" ,porcentagemSP);
        System.out.printf("O percentual de Rio de Janeiro : %.2f%n" ,porcentagemRJ);
        System.out.printf("O percentual de Minas Gerais : %.2f%n" ,porcentagemMG );
        System.out.printf("O percentual de Espirito Santo : %.2f%n" ,porcentagemES);
        System.out.printf("O percentual de Outros : %.2f%n" ,porcentagemOutros);
        //System.out.println("Faturamento total é : " + faturamentoTotal);
    }
}
