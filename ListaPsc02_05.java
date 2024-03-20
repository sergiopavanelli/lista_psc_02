import java.util.Scanner;
public class ListaPsc02_05 {
    public static void main(String[] args) {

    int popA;
    double taxaA;
    int popB;
    double taxaB;
    
    int anos = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe a população inicial de A: ");
    popA = teclado.nextInt();

    System.out.println("Informe a taxa anual de crescimento de A em %: ");
    taxaA = teclado.nextDouble();

    System.out.println("Informe a população inicial de B: ");
    popB = teclado.nextInt();

    System.out.println("Informe a taxa anual de crescimento de B em %: ");
    taxaB = teclado.nextDouble();
    
    teclado.close();
       
            while(popA < popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            anos++;       
            }
        System.out.println("O número de anos necessários para que a população de A iguale ou ultrapasse a de B é: " + anos);
    
    }
}