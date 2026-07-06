public class Mul5 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();

        if (num % 5 == 0) {
            System.out.println("Multiple of 5");
        } else {
            System.out.println("Not a multiple of 5");
        }
    }

    
}
