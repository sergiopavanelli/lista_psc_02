import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N;
        int numero;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        System.out.println("Digite a quantidade de números a serem analisados: ");
        N = teclado.nextInt();
        teclado.close();

        for (int i = 0; i < N; i++) {

        System.out.println("Digite o " + (i + 1) + "º número inteiro: ");
        numero = teclado.nextInt();

        if (numero < menor) {
            menor = numero;
        } else if (numero > maior) {
            maior = numero;
        }

        soma += numero;
    
        }

        System.out.println("O menor número digitado foi: " + menor);
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A soma dos " + N + " números digitados é: " + soma);
    }

}
