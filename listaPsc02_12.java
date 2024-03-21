import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro de 1 a 10: ");
        int N = teclado.nextInt();
        teclado.close();
     
        System.out.println(">> Tabuada de multiplicação do " + N + ":");

        for (int i = 1; i <= 10; i++) {

            System.out.println(N + " x " + i + " = " + (N * i));
        }

        System.out.println(">> Tabuada de adição de " + N + ":");       

        for (int i = 1; i <= 10; i++) {

            System.out.println(N + " + " + i + " = " + (N + i));           
        }

        System.out.println(">> Tabuada de subtração do " + N + ":");

        for (int i = 1; i <= 10; i++) {

            System.out.println(N + " - " + i + " = " + (N - i));
     
        }

    }
}
