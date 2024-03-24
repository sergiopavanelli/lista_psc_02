import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nomeAtleta;

        double salto1 = 0;
        double salto2 = 0;
        double salto3 = 0;
        double salto4 = 0;
        double salto5 = 0;

        double menorSalto = Double.MAX_VALUE;
        double maiorSalto = Double.MIN_VALUE;

        int count = 0;

        
        while (true) {

            System.out.println("Digite o Nome do atleta ou zero (0) para encerrar o programa): ");
            nomeAtleta = teclado.next();

            if (nomeAtleta.equals("0")) {
                break;

            }

            System.out.println("Digite a distância alcançada pelo atleta no 1º salto: ");
            salto1 = teclado.nextDouble();
            menorSalto = Math.min(menorSalto, salto1);
            maiorSalto = Math.max(maiorSalto, salto1);
            count++;

            
            System.out.println("Digite a distância alcançada pelo atleta no 2º salto: ");
            salto2 = teclado.nextDouble();
            menorSalto = Math.min(menorSalto, salto2);
            maiorSalto = Math.max(maiorSalto, salto2);
            count++;

           
            System.out.println("Digite a distância alcançada pelo atleta no 3º salto: ");
            salto3 = teclado.nextDouble();
            menorSalto = Math.min(menorSalto, salto3);
            maiorSalto = Math.max(maiorSalto, salto3);
            count++;

            System.out.println("Digite a distância alcançada pelo atleta no 4º salto: ");
            salto4 = teclado.nextDouble();
            menorSalto = Math.min(menorSalto, salto4);
            maiorSalto = Math.max(maiorSalto, salto4);
            count++;

            System.out.println("Digite a distância alcançada pelo atleta no 5º salto: ");
            salto5 = teclado.nextDouble();
            menorSalto = Math.min(menorSalto, salto5);
            maiorSalto = Math.max(maiorSalto, salto5);
            count++;
            
           double somaSaltos = salto1 + salto2 + salto3 + salto4 + salto5;
           double mediaExcPiorMelhor = (somaSaltos - menorSalto - maiorSalto) / (count - 2);

           System.out.println("Atleta: " + nomeAtleta);
           System.out.println("Primeiro Salto: " + salto1);
           System.out.println("Segundo Salto: " + salto2);
           System.out.println("Terceiro Salto: " + salto3);
           System.out.println("Quarto Salto: " + salto4);
           System.out.println("Quinto Salto: " + salto5);   
           System.out.println("Melhor salto: " + maiorSalto);
           System.out.println("Pior salto: " + menorSalto);
       
           System.out.println("Média dos demais saltos: " + mediaExcPiorMelhor);

       }

       teclado.close();

    }

}
