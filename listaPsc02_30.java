import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");

    int n_paes;
    double preco_pao;

    System.out.println("Digite o número de pães para montagem da tabela de preços: ");
    n_paes = teclado.nextInt();

    System.out.println("Digite o preço do pão: ");
    preco_pao = teclado.nextDouble();

    System.out.println("Preço do pão" + " - R$ " + deci.format(preco_pao));
    System.out.println("Panificadora pão de ontem - Tabela de preços:");

    for (int i = 1; i <= n_paes; i++) {

        System.out.println( i + " - R$ " + deci.format(preco_pao*i));    
    }

    teclado.close();

    
    }

}
