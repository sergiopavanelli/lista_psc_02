import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
 
try {    
        System.out.println("Digite um número inteiro: ");
        int N1 = teclado.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int N2 = teclado.nextInt();

        if (N1 < N2) {
        System.out.println("Os números inteiros entre " + N1 + " e " + N2 + " são: ");
        } else if (N1 > N2) {
        System.out.println("Os números inteiros entre " + N2 + " e " + N1 + " são: ");
        }

        if (N2 > N1) {   
         for (int i = N1+1; i < N2; i++) { 
            System.out.println(i);  
            }
        } else if (N2 < N1) {
            for (int i = N2+1; i < N1; i++) {  
            System.out.println(i);  
            }   
        } else {
            System.out.println("Números iguais!");
        }         

    } catch (Exception e) {
        System.out.println("Número inválido! Por favor, digite apenas números inteiros.");
    } finally {
        teclado.close();
    }
}
}
