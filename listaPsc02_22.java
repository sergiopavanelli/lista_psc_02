import java.util.Scanner;

public class listaPsc02_22 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N;

        System.out.println("Digite um número inteiro: ");
        N = teclado.nextInt();

        boolean primo = true;
        String divisores = "";

        if (N <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    primo = false;
                    divisores += i + " ";
                }
            }
        }

        if (primo) {
            System.out.println("O número " + N + " é primo.");
        } else {
            System.out.println("O número " + N + " não é primo. É divisível por: " + divisores);
        }
        
        teclado.close();

    }
}