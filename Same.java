public class Same {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = s.nextInt();
        System.out.println("Enter second number: ");
        int num2 = s.nextInt();
        System.out.println("Enter third number: ");
        int num3 = s.nextInt();

        if (num1==num2 && num1==num3 && num2==num3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Not all numbers are equal");
        }
    }

    
}
