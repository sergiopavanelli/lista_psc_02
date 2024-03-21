public class listaPsc02_16 {
    
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int nextNumber = 1;
        
        while (n1 <= 610) {

            System.out.println(n1);

            nextNumber = n1 + n2;
            n1 = n2;
            n2 = nextNumber;

        }
        
    }
}