import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro N: ");
        int N = teclado.nextInt();

        int divisoes = 0; // contador de divisões

        System.out.println("Números primos entre 1 e " + N + ": ");

        // loop de 2 a N
        for (int i = 2; i <= N; i++) {
            if(isPrimo(i)) {
                System.out.print(i + " ");
            }
            divisoes++; // contagem de divisões    
        }

        System.out.println("\nNúmero total de divisões: " + divisoes);

        teclado.close();

    }

    // função que verifica se um número é primo

    public static boolean isPrimo(int num){
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                    return false;
            }
        }
        return true;
   
    }
    
}
