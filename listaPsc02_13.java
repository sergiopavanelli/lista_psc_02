import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número (base): ");
        double base = teclado.nextDouble();

        System.out.println("Informe o segundo número (expoente): ");
        double expoente = teclado.nextDouble();

        teclado.close();

        double resultado = Math.pow(base, expoente);

        System.out.println("O primeiro número (base) elevado ao segundo número (expoente) é: " + resultado);

    }
}
