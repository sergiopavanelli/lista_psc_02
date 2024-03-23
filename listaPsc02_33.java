import java.util.Scanner;
public class listaPsc02_33 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double T;
        double somaT = 0;
        double menorT = Double.MAX_VALUE;
        double maiorT = Double.MIN_VALUE;        
        int quantT = 0;

        System.out.println("Digite as temperaturas ou qualquer letra para parar:");

        while (teclado.hasNextDouble()) {
            T = teclado.nextDouble();
            somaT += T;
            quantT++;

            if (T < menorT) {
                menorT = T;
            } else if (T > maiorT) {
                maiorT = T;
            }
        }

        if (quantT > 0) {
            double mediaT = somaT / quantT;
            System.out.println("A menor temperatura informada foi: " + menorT + " graus Celsius.");
            System.out.println("A maior temperatura informada foi: " + maiorT + " graus Celsius.");
            System.out.println("Média das temperaturas informadas: " + mediaT + " graus Celsius.");
        } else {
            System.out.println("Nenhuma temperatura informada.");
        }
       
        teclado.close();

    }

}