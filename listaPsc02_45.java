import java.util.Scanner;
public class listaPsc02_45 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        char questao01 = 'A';
        char questao02 = 'B';
        char questao03 = 'C';
        char questao04 = 'D';
        char questao05 = 'E';
        char questao06 = 'E';
        char questao07 = 'D';
        char questao08 = 'C';
        char questao09 = 'B';
        char questao10 = 'A';

        char continuar = 's';

        int totalAlunos = 0;
        int maiorAcerto = 0;
        int menorAcerto = 10;
        double somaNotas = 0;


        while (continuar == 's') {

            int notaAluno = 0;

            System.out.println("Digite a resposta da Questão 1:" );
            char resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao01) {
                notaAluno ++; 
            }
            System.out.println("Digite a resposta da Questão 2:" );
            resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao02) {
                notaAluno ++;
            }
            System.out.println("Digite a resposta da Questão 3:" );
            resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao03) {
                notaAluno ++;
            }
            System.out.println("Digite a resposta da Questão 4:" );
            resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao04) {
                notaAluno ++;
            }
            System.out.println("Digite a resposta da Questão 5:" );
            resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao05) {
                notaAluno ++;
            }
            System.out.println("Digite a resposta da Questão 6:" );
            resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao06) {
                notaAluno ++;
            }
            System.out.println("Digite a resposta da Questão 7:" );
            resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao07) {
                notaAluno ++;
            }
            System.out.println("Digite a resposta da Questão 8:" );
            resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao08) {
                notaAluno ++;
            }
            System.out.println("Digite a resposta da Questão 9:" );
            resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao09) {
                notaAluno ++;
            }
            System.out.println("Digite a resposta da Questão 10:" );
            resposta = teclado.next().toUpperCase().charAt(0);
            if (resposta == questao10) {
                notaAluno ++;
            }

            if (notaAluno > maiorAcerto) {
                maiorAcerto = notaAluno;
            }
            if (notaAluno < menorAcerto) {
                menorAcerto = notaAluno;
            }

            somaNotas += notaAluno;
            totalAlunos ++;

            System.out.println("Total de acertos: " + notaAluno);
            System.out.println("Deseja continuar (s/n)? ");
            continuar = teclado.next().toLowerCase().charAt(0);

        }

        double mediaTurma = somaNotas / totalAlunos;

        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("Média das notas da turma: " + mediaTurma);

        teclado.close();

    }
}