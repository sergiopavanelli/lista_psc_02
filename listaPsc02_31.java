import java.util.Scanner;
import java.text.DecimalFormat;
public class listaPsc02_31 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double preco;
        double total;
        double vr_pago;
        int item;

        System.out.println("Lojas Tabajara: ");

        while (true) {
            total = 0;
            preco = 1;
            item = 1;

            while (true) {
                System.out.println("Digite o valor do item " + item + " ou 0 para finalizar: ");
                preco = teclado.nextDouble();
                if (preco == 0)
                    break;
                total += preco;
                item++;
            }

            System.out.println("Total: R$ " + deci.format(total));
            System.out.print("Dinheiro: R$ ");
            vr_pago = teclado.nextDouble();
            System.out.println("Troco: R$ " + deci.format(vr_pago - total));

            if (preco == 0)
                break; // Sai do loop principal se o usuário digitar 0 para finalizar a compra
        }

        teclado.close();
    }
    
}