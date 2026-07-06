import java.util.*;
public class Tri {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Side 1: ");
        int s1=s.nextInt();
        System.out.println("Enter Side 2: ");
        int s2=s.nextInt();
        System.out.println("Enter Side 3: ");
        int s3=s.nextInt();
        
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            if (s1 == s2 && s2 == s3) {
                System.out.println("Equilateral Triangle");
            } else if (s1 == s2 || s2 == s3 || s1 == s3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } 
        else {
            System.out.println("Invalid Triangle");
        }
    }
    
}
