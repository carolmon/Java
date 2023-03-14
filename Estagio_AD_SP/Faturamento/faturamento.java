package teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class faturamento {
   
    public static void main(String[] args) {
        String caminhoArquivo = "D:\\Desenvolvimento\\Java\\teste\\dados.xml";
        String dia = "";
        String valor= "";
        String dias[]={dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia,dia};
        String valores[]={valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor,valor};
        Pattern patternDia = Pattern.compile("<dia>(\\d+)</dia>");
        Pattern patternValor = Pattern.compile("<valor>(\\d+\\.\\d+)</valor>");
        Pattern patternEndRow = Pattern.compile("</row>");
        int contador = 0;
        double sum=0;
        String diaMaiorValor="";
        String diaMenorValor="";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                 
                Matcher matcherDia = patternDia.matcher(linha);
                if (matcherDia.find()) {
                    dia = matcherDia.group(1);
                }
                Matcher matcherValor = patternValor.matcher(linha);
                if (matcherValor.find()) {
                    valor = matcherValor.group(1);
                }
                Matcher matcherEndRow = patternEndRow.matcher(linha);
                if (matcherEndRow.find()) {
                    System.out.println("Valor do dia: " + dia + " é igual a " + valor);
                    dias[contador] =dia;
                    valores[contador]=valor;
                    contador++;
                    
                } 
            }
            double[] numeroValores = new double [valores.length];
           for(int i = 0; i<valores.length; i++){
                numeroValores[i] = Double.parseDouble(valores[i]);
           }
           double max = numeroValores[0];
           double min = numeroValores[0];
           for (int contadorMaiorValor=0; contadorMaiorValor< numeroValores.length; contadorMaiorValor++){
                if(numeroValores[contadorMaiorValor]>max){
                    max = numeroValores[contadorMaiorValor];
                    diaMaiorValor= dias[contadorMaiorValor];
                }
           }
           for(int contadorMenorValor=0; contadorMenorValor<numeroValores.length;contadorMenorValor++){
            if(numeroValores[contadorMenorValor]<min && numeroValores[contadorMenorValor]!=0){
                min= numeroValores[contadorMenorValor];
                diaMenorValor = dias[contadorMenorValor];
            }
           }
           for (double d : numeroValores) {
                sum+=d;
           }
           double media =sum/numeroValores.length;
           System.out.println("o maior valor é: "+max+ "no dia: "+ diaMaiorValor);
           System.out.println("o menor valor é: "+min+ "no dia: "+ diaMenorValor);
           System.out.println("o valor total é: "+sum);
           System.out.println("a media mensal é: "+(media));

          for(int contadorMedia=0; contadorMedia<numeroValores.length;contadorMedia++){
                if(numeroValores[contadorMedia]>media){
                    System.out.println("o Faturamento do dia: "+ dias[contadorMedia]+ " de: "+ valores[contadorMedia]+" foi maior que o faturamento mensal");
                }
          }

           

          
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
