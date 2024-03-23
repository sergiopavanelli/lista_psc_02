import java.util.Scanner;
public class listaPsc02_38 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double salarioInicial;
        int anoContratacao = 1995;
        int anoAtual;
        double aumento = 0.015;
        double salarioAtual;

        System.out.println("Digite o valor do salário inicial do funcionário contratado em 1995, em R$:");
        salarioInicial = teclado.nextDouble();

        System.out.println("Digite o ano atual:");
        anoAtual = teclado.nextInt();

        salarioAtual = salarioInicial;


        for (int i = anoContratacao + 1; i <= anoAtual; i++) {

            if (i == 1996) {
                salarioAtual = (salarioInicial * aumento) + salarioInicial;
                
            } else {
                aumento *=2;
                salarioAtual = (salarioAtual * aumento) + salarioAtual;                         
            }
        }

        System.out.println("Salário no ano " + anoAtual + ": R$" + salarioAtual);
        
        teclado.close();

    }
}