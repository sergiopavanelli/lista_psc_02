public class Main {
    
    public static void main(String[] args) {

    
    int popA = 80000;
    double taxaA = 0.03;
    int popB = 200000;
    double taxaB = 0.015;

    int anos = 0;

       while(popA < popB){
        popA += popA * taxaA;
        popB += popB * taxaB;
        anos++;       
    }

    System.out.println("O número de anos necessários para que a população de A iguale ou ultrapasse a de B é: " + anos);
               
}

}
