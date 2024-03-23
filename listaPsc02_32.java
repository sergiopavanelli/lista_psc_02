import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = teclado.nextInt();

        long fatorial = calcularFatorial(numero);

        System.out.println("Fatorial de " + numero + ":");
        System.out.print(numero + "! = ");
        for (int i = numero; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + fatorial);

        teclado.close();
    }

    public static long calcularFatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
