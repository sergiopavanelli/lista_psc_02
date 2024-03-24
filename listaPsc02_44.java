import java.util.Scanner;

public class listaPsc02_44 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;
        int nulo5 = 0;
        int branco6 = 0;


        while (true) {

            System.out.println("Digite o seu voto escolhendo o candidato 1 e 4 / 5 para nulo / 6 para branco ou 0 para encerrar:");
            int voto = teclado.nextInt();

            if (voto == 0) {
                break;
            }

            if (voto == 1) {
                cand1 += 1;
            } else if (voto == 2) {
                cand2 += 1;
            } else if (voto == 3) {
                cand3 += 1;
            } else if (voto == 4) {
                cand4 += 1;
            } else if (voto == 5) {
                nulo5 += 1;
            } else if (voto == 6) {
                branco6 += 1;
            } else {
                System.out.println("Voto inválido");
                }

        }

        int totalVotos = cand1 + cand2 + cand3 + cand4 + nulo5 + branco6;

        System.out.println("Total geral de votos: " + totalVotos);
        System.out.println("Total de votos para o candidato 1: " + cand1);
        System.out.println("Total de votos para o candidato 2: " + cand2);
        System.out.println("Total de votos para o candidato 3: " + cand3);
        System.out.println("Total de votos para o candidato 4: " + cand4);
        System.out.println("Total de votos nulos: " + nulo5);
        System.out.println("Total de votos em branco: " + branco6);
        System.out.println("% de votos nulos sobre o total de votos: " + (nulo5 * 100) / (totalVotos) + "%");
        System.out.println("% de votos em branco sobre o total de votos: " + (branco6 * 100) / (totalVotos) + "%");

        teclado.close();

    }

}