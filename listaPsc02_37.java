import java.util.Scanner;
public class listaPsc02_37 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int codigo;
        double altura;
        double peso;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE;
        double menorPeso = Double.MAX_VALUE;
        int codigoMaisAlto = 0;
        int codigoMaisBaixo = 0;
        int codigoMaisGordo = 0;
        int codigoMaisMagro = 0;
        double somaAlturas = 0;
        double somaPesos = 0;
        double quantClientes = 0;
        
        while (true) {

            System.out.println("Digite o código do cliente ou 0 para encerrar:");
            codigo = teclado.nextInt();

            if (codigo == 0) 
            break;
        
            System.out.println("Digite a altura do cliente em metros:");
            altura = teclado.nextDouble();
            somaAlturas += altura;

            System.out.println("Digite o peso do cliente em quilos:");
            peso = teclado.nextDouble();
            somaPesos += peso;

            quantClientes ++;

            if (altura > maiorAltura) {
            maiorAltura = altura;
            codigoMaisAlto = codigo;
            }
            if (altura < menorAltura) {
            menorAltura = altura;
            codigoMaisBaixo = codigo;
             }
            if (peso > maiorPeso) {
            maiorPeso = peso;
            codigoMaisGordo = codigo;
            }
            if (peso < menorPeso) {
            menorPeso = peso;
            codigoMaisMagro = codigo;
            }
        }

        if (quantClientes > 0) {
        double mediaAlturas = somaAlturas / quantClientes;
        double mediaPesos = somaPesos / quantClientes;
        System.out.println("Maior altura: " + maiorAltura + " m " + " - Código: " + codigoMaisAlto);
        System.out.println("Menor altura: " + menorAltura + " m " + " - Código: " + codigoMaisBaixo);
        System.out.println("Maior peso: " + maiorPeso + " kg " + " - Código: " + codigoMaisGordo);
        System.out.println("Menor peso: " + menorPeso + " kg " + " - Código: " + codigoMaisMagro);
        System.out.println("Média de alturas: " + mediaAlturas + " m");
        System.out.println("Média de pesos: " + mediaPesos + " kg");

        } else {
    System.out.println("Nenhum cliente informado.");

        }

        teclado.close();

    }

}