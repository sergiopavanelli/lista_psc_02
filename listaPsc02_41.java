import java.util.Scanner;
public class listaPsc02_41 {

    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);

        double vr_divida;
        double vr_parcela;
        double juros_1_parcela = 0;
        double juros_3_parcela = 0.10;
        double juros_6_parcela = 0.15;
        double juros_9_parcela = 0.20;
        double juros_12_parcela = 0.25;

        System.out.println("Digite o valor da divida:");
        vr_divida = teclado.nextDouble();

        teclado.close();
        
        System.out.println("Valor da Dívida\tValor dos Juros\tQuantidade de Parcelas\tValor da Parcela");
        System.out.printf("R$ %.2f\t\t%.2f\t\t1\t\t\tR$ %.2f\n", vr_divida, juros_1_parcela * vr_divida, vr_divida);

        vr_parcela = (vr_divida * juros_3_parcela + vr_divida) / 3;
        System.out.printf("R$ %.2f\t\t%.2f\t\t3\t\t\tR$ %.2f\n", vr_divida * juros_3_parcela + vr_divida, vr_divida * juros_3_parcela, vr_parcela);

        vr_parcela = (vr_divida * juros_6_parcela + vr_divida) / 6;
        System.out.printf("R$ %.2f\t\t%.2f\t\t6\t\t\tR$ %.2f\n", vr_divida * juros_6_parcela + vr_divida, vr_divida * juros_6_parcela, vr_parcela);

        vr_parcela = (vr_divida * juros_9_parcela + vr_divida) / 9;
        System.out.printf("R$ %.2f\t\t%.2f\t\t9\t\t\tR$ %.2f\n", vr_divida * juros_9_parcela + vr_divida, vr_divida * juros_9_parcela, vr_parcela);

        vr_parcela = (vr_divida * juros_12_parcela + vr_divida) / 12;
        System.out.printf("R$ %.2f\t\t%.2f\t\t12\t\t\tR$ %.2f\n", vr_divida * juros_12_parcela + vr_divida, vr_divida * juros_12_parcela, vr_parcela);
    }
}