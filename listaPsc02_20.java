import java.util.Scanner;
public class listaPsc02_20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char continuar = 'n';

        do {
                          
        int n;
        int fatorial = 1;

        System.out.println("Digite um número inteiro: ");
        n = teclado.nextInt();

        while (n < 0 || n >= 16) {

            System.out.println("Número inválido. Digite um número entre 0 e 15.");
            System.out.println("Digite um novo número inteiro:");
            n = teclado.nextInt();
            
        }

        for (int i = n; i >= 1; i--) {

            fatorial *= i;       
        }
      
        System.out.println("O valor de " + n + "! é: " + fatorial);

        System.out.println("Deseja continuar (s/n)? ");
        continuar = teclado.next().charAt(0);   
        
         } while (continuar == 's' || continuar == 'S');

         teclado.close();
    }
}




