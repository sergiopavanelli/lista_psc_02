import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n_eleitores;
        int votos_cand1 = 0;
        int votos_cand2 = 0;
        int votos_cand3 = 0;
        int voto;

        System.out.println("Digite o número total de eleitores: ");
        n_eleitores = teclado.nextInt();


        for (int i = 1; i <= n_eleitores; i++) {
            System.out.println("Prezado eleitor " + i + ", escolha o seu candidato (1, 2 ou 3): ");
            voto = teclado.nextInt();
            
            if (voto == 1) {
                votos_cand1 += 1;
            }   else if (voto == 2) {
                votos_cand2 += 1;
            }   else if (voto == 3) {
                votos_cand3 += 1;
            }   else if (voto != 1 && voto != 2 && voto != 3) {
                System.out.println("Voto inválido. Escolha um candidato entre 1, 2 ou 3.");
                 i--; // volta para o loop}
        }

    }

    System.out.println("Total de votos para o candidato 1: " + votos_cand1);
    System.out.println("Total de votos para o candidato 2: " + votos_cand2);
    System.out.println("Total de votos para o candidato 3: " + votos_cand3);

    teclado.close();

    }

}
