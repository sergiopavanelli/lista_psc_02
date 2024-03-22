import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int turmas;
        int alunos;
        int soma_alunos = 0;

        System.out.println("Digite a quantidade de turmas:");
        turmas = teclado.nextInt();

        for (int i = 1; i <= turmas; i++) {
            System.out.println("Digite a quantidade de alunos na turma: " + i);
            alunos = teclado.nextInt();
            if (alunos > 40) {
                System.out.println("A turma não pode ter mais de 40 alunos");
                i--; // volta para o loop           
            } else { 
                soma_alunos += alunos;
            }
        }

        System.out.println("A média de alunos por turma é " + (soma_alunos / turmas));
        teclado.close();
    }
}
