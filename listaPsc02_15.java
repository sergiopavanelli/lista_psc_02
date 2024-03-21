import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 1;
        int nextNumber;
        int n;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de termos desejado na sequência de Fibonacci: ");
        n = teclado.nextInt();
        teclado.close();


        for (int i = 1; i <= n; i++) {
           
            System.out.println(n1);

            nextNumber = n1 + n2;

            n1 = n2;

            n2 = nextNumber;

        }
    }
}
