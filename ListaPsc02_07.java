import java.util.Scanner;
public class ListaPsc02_07 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        float maior = Float.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            float numero = teclado.nextFloat();
      
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        teclado.close();

    }      

}
