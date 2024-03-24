import java.util.Scanner;

public class listaPsc02_43 {    
    
    public static void main(String[] args) {


        int codigo;
        int quantidade;
        double totalGeral = 0;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo à lanchonete Comilão!");
        System.out.println("Digite o código do produto desejado ou 77 para encerrar o pedido:");



        while (true) {

            System.out.println("Digite o código do produto:");
            codigo = teclado.nextInt();

            if (codigo == 77) {
            break;

            }

            String nomeProduto;
            double precoProduto;
            switch (codigo) {
                case 100:
                nomeProduto = "Cachorro Quente";
                precoProduto = 1.20;
                break;
                case 101:
                nomeProduto = "Bauru Simples";
                precoProduto = 1.30;
                break;
                case 102:
                nomeProduto = "Bauru com ovo";
                precoProduto = 1.50;
                break;
                case 103:
                nomeProduto = "Hambúrger";
                precoProduto = 1.20;
                break;   
                case 104:
                nomeProduto = "Cheeseburguer";
                precoProduto = 1.30;
                break;
                case 105:
                nomeProduto = "Refrigerante";
                precoProduto = 1.00;
                break;
                default:
                System.out.println("Código inválido! Digite um código entre 100 e 105.");
                continue;    
         }

        System.out.println("Digite a quantidade:");
        quantidade = teclado.nextInt();

        double totalItem = quantidade * precoProduto;
        System.out.println("Item " + nomeProduto + " - Quantidade: " + quantidade + " - Total do item: R$ " + totalItem);

        totalGeral += totalItem;      

        }

        System.out.println("Pedido finalizado!");
        System.out.println("Total geral do pedido: R$ " + totalGeral);

        teclado.close();

    }

}