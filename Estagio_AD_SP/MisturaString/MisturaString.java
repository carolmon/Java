package MisturaString;

import java.util.Random;
import java.util.Scanner;

public class MisturaString {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String str = ler.nextLine();
        Random gerador = new Random();
        char str1 = ' ';
        char str2 = ' ';

        for(int contador = 0; contador < str.length(); contador++){
            str1 = str.charAt(contador);
            str2 = str.charAt(gerador.nextInt(str.length()));
            
        }
        str = str.replace(str1, str2);
        System.out.println(str);

    
        }
    
}
