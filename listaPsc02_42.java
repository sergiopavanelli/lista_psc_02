import java.util.Scanner;
public class listaPsc02_42 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int intervalo_0_25 = 0;
        int intervalo_26_50 = 0;
        int intervalo_51_75 = 0;
        int intervalo_76_100 = 0;
        double N;


        while (true){

            System.out.println("Digite um número positivo: ");
            N = teclado.nextDouble();

            if (N < 0) 
                break;

            if (N >= 0 && N <= 25) {
                intervalo_0_25++;
            } else if (N >= 26 && N <= 50) {
                intervalo_26_50++;
            } else if (N >= 51 && N <= 75) {
                intervalo_51_75++;
            } else if (N >= 76 && N <= 100) {
                intervalo_76_100++;                
            }
            
        } 

        teclado.close();

        System.out.println("Quantidade de números no intervalo [0-25]: " + intervalo_0_25);
        System.out.println("Quantidade de números no intervalo (26-50]: " + intervalo_26_50);
        System.out.println("Quantidade de números no intervalo (51-75]: " + intervalo_51_75);
        System.out.println("Quantidade de números no intervalo (76-100]: " + intervalo_76_100);

    }
}