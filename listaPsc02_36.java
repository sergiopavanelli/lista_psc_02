import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N;
        int nInicial;
        int nFinal;


        System.out.println("Informe um número inteiro para montagem da tabuada: ");
        N = teclado.nextInt();

        do {    

            System.out.println("Informe o primeiro número da tabuada: ");
            nInicial = teclado.nextInt();

            System.out.println("Informe o último número da tabuada: ");
            nFinal = teclado.nextInt();

  
            if (nFinal < nInicial){

            System.out.println("O segundo número deve ser maior que o primeiro.");
            }

        } while (nFinal < nInicial);
  
     
        System.out.println(" Vou montar a tabuada de " + N + " começando em " + nInicial + " e terminando em " + nFinal + ":");

        for (int i = nInicial; i <= nFinal; i++) {

            System.out.println(N + " x " + i + " = " + (N * i));
        }

        teclado.close();
    }
    
}
