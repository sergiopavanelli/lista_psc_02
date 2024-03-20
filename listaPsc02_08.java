import java.util.Scanner;
public class listaPsc02_08 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    float soma = 0;
   
    for (int i = 0; i < 5; i++) {

        System.out.println("Digite o número " + (i + 1) + ": ");
        float numero = teclado.nextFloat();

        soma = numero + soma;
                
        }
    
    float media = soma / 5;

    System.out.println("A soma dos 5 números digitados é: " + soma);
    System.out.println("A media dos 5 números digitados é: " + media);

    teclado.close();
        
    }
}
