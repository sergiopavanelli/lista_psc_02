import java.util.Scanner;
import java.text.DecimalFormat;
public class listaPsc02_29 {

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");

    int n_produtos;
    double preco = 1.99;

    System.out.println("Digite o número de produtos para montagem da tabela de preços: ");
    n_produtos = teclado.nextInt();

    for (int i = 1; i <= n_produtos; i++) {

        System.out.println( i + " - R$ " + deci.format(preco*i));    
    }

    teclado.close();

    }

}
