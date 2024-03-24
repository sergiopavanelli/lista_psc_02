import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        String nomeAtleta;

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double nota5 = 0;
        double nota6 = 0;
        double nota7 = 0;

        double menorNota = Double.MAX_VALUE;
        double maiorNota = Double.MIN_VALUE;

        int count = 0;

        
        while (true) {

            System.out.println("Digite o Nome do atleta ou zero (0) para encerrar o programa): ");
            nomeAtleta = teclado.nextLine();

            if (nomeAtleta.equals("0")) {
                break;

            }

            System.out.println("Digite a nota n. 1: ");
            nota1 = teclado.nextDouble();
            menorNota = Math.min(menorNota, nota1);
            maiorNota = Math.max(maiorNota, nota1);
            count++;

            System.out.println("Digite a nota n. 2: ");
            nota2 = teclado.nextDouble();
            menorNota = Math.min(menorNota, nota2);
            maiorNota = Math.max(maiorNota, nota2);
            count++;

            System.out.println("Digite a nota n. 3: ");
            nota3 = teclado.nextDouble();
            menorNota = Math.min(menorNota, nota3);
            maiorNota = Math.max(maiorNota, nota3);
            count++;

            System.out.println("Digite a nota n. 4: ");
            nota4 = teclado.nextDouble();
            menorNota = Math.min(menorNota, nota4);
            maiorNota = Math.max(maiorNota, nota4);
            count++;

            System.out.println("Digite a nota n. 5: ");
            nota5 = teclado.nextDouble();
            menorNota = Math.min(menorNota, nota5);
            maiorNota = Math.max(maiorNota, nota5);
            count++;


            System.out.println("Digite a nota n. 6: ");
            nota6 = teclado.nextDouble();
            menorNota = Math.min(menorNota, nota6);
            maiorNota = Math.max(maiorNota, nota6);
            count++;

            System.out.println("Digite a nota n. 7: ");
            nota7 = teclado.nextDouble();
            menorNota = Math.min(menorNota, nota7);
            maiorNota = Math.max(maiorNota, nota7);
            count++;

            teclado.nextLine();
                    

           double somaNotas = nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7;
           double mediaExcPiorMelhor = (somaNotas - menorNota - maiorNota) / (count - 2);

           System.out.println("Resultado final: ");

           System.out.println("Atleta: " + nomeAtleta);
           System.out.println("Primeira Nota: " + nota1);
           System.out.println("Segunda Nota: " + nota2);
           System.out.println("Terceira Nota: " + nota3);
           System.out.println("Quarta Nota: " + nota4);
           System.out.println("Quinta Nota: " + nota5);
           System.out.println("Sexta Nota: " + nota6);
           System.out.println("Sétima Nota: " + nota7);
                       

           System.out.println("Melhor nota: " + maiorNota);
           System.out.println("Pior nota: " + menorNota);
       
           System.out.println("Média das demais notas: " + mediaExcPiorMelhor);

       }

       teclado.close();

    }   
}
