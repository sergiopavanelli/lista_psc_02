import java.util.Scanner;

public class listaPsc02_01 {
    public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
double nota;

do {
    System.out.println("Informe uma nota entre zero e dez:");
    nota = teclado.nextDouble();

    if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida! A nota deve ser de zero a dez!");
    }
} while (nota < 0 || nota > 10);

    System.out.println("Nota válida.");
    teclado.close();

    }
}
