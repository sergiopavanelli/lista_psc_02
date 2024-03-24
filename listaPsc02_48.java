import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        

        System.out.print("Digite um número inteiro positivo: ");
        int number = teclado.nextInt();
        

        if (number < 0) {
            System.out.println("O número digitado não é positivo.");
            teclado.close();
            return;
            
        }

        int reversedNumber = reverseNumber(number);
       

        System.out.println("Número invertido: " + reversedNumber);

        teclado.close();

        }


    
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;

    }


}
