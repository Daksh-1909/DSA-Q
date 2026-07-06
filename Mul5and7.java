public class Mul5and7 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("Multiple of both 5 and 7");
        }
        else {
            System.out.println("Not a multiple of both");
        }
    }

    
}
