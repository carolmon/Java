import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroInteiro = scan.nextInt();
        double numeroDouble = scan.nextDouble();
        scan.nextLine();
        String texto = scan.nextLine();
        
        // Write your code here.

        System.out.println("String: " + texto);
        System.out.println("Double: " + numeroDouble);
        System.out.println("Int: " + numeroInteiro);
        
    }
}