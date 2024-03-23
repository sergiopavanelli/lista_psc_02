import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N;

        System.out.println("Digite um número inteiro: ");
        N = teclado.nextInt();

        boolean primo = true;

        if (N <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("O número " + N + " é primo.");
        } else {
            System.out.println("O número " + N + " não é primo.");
        }
        
        teclado.close();

    }
    
}
