import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altura;
        double maior_altura = Double.MIN_VALUE;
        double menor_altura = Double.MAX_VALUE;
        int numero_maior_aluno = 0;
        int numero_menor_aluno = 0;
        
        
        for (int i = 1; i <= 10; i++) {

            System.out.println("Digite a altura do " + i + "º aluno em metros:");
            altura = teclado.nextDouble();

            if (altura > maior_altura) {
                maior_altura = altura;
                numero_maior_aluno = i;
            }
            if (altura < menor_altura) {
                menor_altura = altura;
                numero_menor_aluno = i;  
            }

        }

        teclado.close();

        System.out.println("Aluno com maior altura: " + numero_maior_aluno + "° >> " + maior_altura + "m");
        System.out.println("Aluno com menor altura: " + numero_menor_aluno + "° >> " + menor_altura + "m");
    }
}
