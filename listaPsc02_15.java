public class listaPsc02_15 {
    
    public static void main(String[] args) {
        

        int n1 = 0;
        int n2 = 1;
        int nextNumber;

        for (int i = 1; i <= 15; i++) {
           
            System.out.println(n1);

            nextNumber = n1 + n2;

            n1 = n2;

            n2 = nextNumber;

        }
    }
}