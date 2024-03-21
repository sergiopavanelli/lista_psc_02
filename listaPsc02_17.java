import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int n;
        int fatorial = 1;
       
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n = teclado.nextInt();

        for (int i = n; i >= 1; i--) {

            fatorial *= i;
        
        }

        teclado.close();
        
        System.out.println("O valor de " + n + "! é: " + fatorial);
    
    }
}
