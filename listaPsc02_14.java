import java.util.Scanner;
public class listaPsc02_14 {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int par = 0;
    int impar = 0;

    for (int i = 1; i <= 10; i++) {
        
        System.out.println("Digite o " + i + "º número inteiro: ");
        int N = teclado.nextInt();
       
        if (N % 2 == 0) {
        par += 1;
        } else {
        impar += 1;
        }
    }

    teclado.close();
    
    System.out.println("Foram digitados " + par + " números pares e " + impar + " números impares.");

    }
}