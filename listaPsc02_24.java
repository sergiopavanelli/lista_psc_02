import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N_notas = 0;
        float soma_notas = 0;
        char continuar = 'n';

    do {

        System.out.println("Digite a nota " + (N_notas + 1) + ": ");
            
        soma_notas += teclado.nextFloat();
                 
        N_notas ++;

        System.out.println("Deseja continuar (s/n)? ");
        continuar = teclado.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("A média aritmética das " + N_notas + " informadas é " + (soma_notas / N_notas));

        teclado.close();

    }

}
