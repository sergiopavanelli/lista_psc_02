import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        int N; // número de pessoas a serem analisadas
        int idade; // idade da pessoa
        int soma_idades = 0; // soma das idades
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de pessoas a serem analisadas: ");
        N = teclado.nextInt();

            
        
        for (int i = 1; i <= N; i++) {
        System.out.println("Digite a idade da pessoa " + i + ": ");
        idade = teclado.nextInt();
        soma_idades += idade;
        }

        float media_idades = soma_idades/N;
    
        System.out.println("A media de idade da turma é: " + (media_idades));

    if (media_idades >= 0 && media_idades <= 25) {
        System.out.println("A turma é jovem");    
        } else if (media_idades >= 26 && media_idades <= 60) {
        System.out.println("A turma é adulta");
        } else {
        System.out.println("A turma é idosa");
        }
        
        teclado.close();
    }
}
