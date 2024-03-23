import java.util.Scanner;
public class listaPsc02_40 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int codCidade;
        int codMaiorIndice = 0;
        int codMenorIndice = 0;
        int nVeiculos = 0;
        int nAcidentes;
        int menorNacidentes = Integer.MAX_VALUE;
        int maiorNacidentes = Integer.MIN_VALUE;
        int totalVeiculosMenor2000 = 0;
        int totalAcidentesMenor2000 = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite o Código da Cidade " + i + ":");
            codCidade = teclado.nextInt();

            System.out.println("Digite o número de Veículos da Cidade " + i + ":");
            nVeiculos = teclado.nextInt();

            System.out.println("Digite o número de Acidentes da Cidade " + i + ":");
            nAcidentes = teclado.nextInt();

            if (nAcidentes > maiorNacidentes) {
                codMaiorIndice = codCidade;
                maiorNacidentes = nAcidentes;    
            } else if (nAcidentes < menorNacidentes) {
                codMenorIndice = codCidade;
                menorNacidentes = nAcidentes;
            }
            
            if (nVeiculos < 2000) {
                totalVeiculosMenor2000++;
                totalAcidentesMenor2000 += nAcidentes;
            }
        }

        System.out.println("Cidade com maior índice de acidentes: " + codMaiorIndice);
        System.out.println("Cidade com menor índice de acidentes: " + codMenorIndice);
        System.out.println("Média de veículos nas 5 cidades juntas: " + (nVeiculos / 5));
        System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + (totalAcidentesMenor2000 / totalVeiculosMenor2000));
   
        teclado.close();

    }
}