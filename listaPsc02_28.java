import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int quant_cds;
    float valor_total_cds = 0;

    System.out.println("Digite a quantidade de CD's na coleção:");
    quant_cds = teclado.nextInt();


    for (int i = 1; i <= quant_cds; i++) {

        System.out.println("Digite o valor médio em R$ gasto no " + i + "º CD:");
        valor_total_cds += teclado.nextFloat();
    }

    System.out.println("O valor total investido pelo colecionar em sua coleção de CD's é: R$ " + valor_total_cds);
    System.out.println("O valor médio gasto em cada CD é: R$ " + (valor_total_cds / quant_cds));

    teclado.close();

    }
    
}
