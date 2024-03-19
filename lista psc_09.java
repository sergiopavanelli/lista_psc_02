import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    double salario;
    String classificacao;
    int anosServico;
    double bonusA = 0.20;
    double bonusB = 0.15;
    double bonusC = 0.10;
    double bonusD = 0.05;
    double bonusE = 0.02;
    double adicionalTempo = 0.05;
    double bonus;
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o salário atual do funcionário: ");
    salario = teclado.nextDouble();

    System.out.println("Digite a classificação de desempenho do funcionário: A, B, C, D, E ou outra");
    classificacao = teclado.next();

    System.out.println("Digite o número de anos trabalhado na empresa: ");
    anosServico = teclado.nextInt();

    teclado.close();


    if (classificacao.equals("A")) {

      bonus = salario * bonusA;
      if (anosServico > 5) {
        bonus = bonus + (salario * adicionalTempo);
      }
    } else if (classificacao.equals("B")) {
      bonus = salario * bonusB;
      if (anosServico > 5) {
        bonus = bonus + (salario * adicionalTempo);
      }
    } else if (classificacao.equals("C")) {
      bonus = salario * bonusC;
      if (anosServico > 5) {
        bonus = bonus + (salario * adicionalTempo);
      }
    } else if (classificacao.equals("D")) {
      bonus = salario * bonusD;
      if (anosServico > 5) {
        bonus = bonus + (salario * adicionalTempo);
      }
    } else if (classificacao.equals("E")) {
      bonus = salario * bonusE;
      if (anosServico > 5) {
        bonus = bonus + (salario * adicionalTempo);
      }
    } else if (anosServico > 5) {
      bonus = salario * adicionalTempo;
    } else {
      bonus = 0;      
    }
    System.out.println("Valor do bônus: R$ " + bonus);    
  }
}
    
