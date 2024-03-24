import java.util.Scanner;
public class listaPsc02_49 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor de n: ");
        int n = teclado.nextInt();
        
        double soma = 0;
        int numerador = 1;
        int denominador = 1;
        
        System.out.print("S = ");
        for (int i = 1; i <= n; i++) {
            soma += (double) numerador / denominador;
            
            if (i != 1)
                System.out.print(" + ");
            
            System.out.print(numerador + "/" + denominador);
            
            numerador++;
            denominador += 2;
        }
        
        System.out.println("\n\nA soma da série é: " + soma);
        
        teclado.close();
   
    }
}