import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estado_civil;
    
        do {
          System.out.println("Digite o nome com mais de 3 caracteres:");
          nome = teclado.next().toLowerCase();
          if (nome.length() < 3) {
            System.out.println("Nome inválido!");    
          }
        } while (nome.length() < 3);
        
        do {
          System.out.println("Digite a idade entre 0 e 150 anos:");
          idade = teclado.nextInt();
          if (idade < 0 || idade > 150) {
            System.out.println("Idade inválida!");
          }
        } while (idade < 0 || idade > 150);
        
        do {
          System.out.println("Digite o salário (maior que zero):");
          salario = teclado.nextDouble();
          if (salario <= 0) {
            System.out.println("Salário inválido!");
          }
        } while (salario <= 0);
        
        do {
          System.out.println("Digite o sexo (f ou m:)");
          sexo = teclado.next().toLowerCase();
          if (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Sexo inválido!");
          }
        } while (!sexo.equals("f") && !sexo.equals("m"));
        
        do {
          System.out.println("Digite o estado civil (s, c, v ou d)");
          estado_civil = teclado.next().toLowerCase();
          if ((!estado_civil.equals("s")) && (!estado_civil.equals("c")) && (!estado_civil.equals("v")) && (!estado_civil.equals("d"))) {
          System.out.println("Estado civil inválido!");
        }
        } while ((!estado_civil.equals("s")) && (!estado_civil.equals("c")) && (!estado_civil.equals("v")) && (!estado_civil.equals("d")));
    
        teclado.close();
        
        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nSalário: " + salario + "\nSexo: " + sexo + "\nEstado civil: " + estado_civil);
   
  
}
}
