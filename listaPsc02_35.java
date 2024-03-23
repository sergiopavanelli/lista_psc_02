import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int limite = teclado.nextInt();
        
        System.out.println("Números primos entre 1 e " + limite + ":");
        
        for (int i = 2; i <= limite; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        
        teclado.close();
    }
    
    // Método para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
