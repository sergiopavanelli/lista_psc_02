import java.util.Scanner;
public class listaPsc02_50 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N;
        double H = 0;

        System.out.println("Digite o valor de N: ");
        N = teclado.nextInt();

        System.out.print("H = ");

        for (int i = 1; i <= N; i++) {
            H += 1.0/i;

            if (i != 1)
                System.out.print(" + ");

            System.out.print("1" + "/" + i);
        }

        System.out.println("\n\nO valor de H com " + N + " termos é: " + H);

        teclado.close();
    
    }
}