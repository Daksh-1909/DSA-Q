import java.util.*;
public class Angle {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Angle 1: ");
        int a=s.nextInt();
        System.out.println("Enter Angle 2: ");
        int b=s.nextInt();
        System.out.println("Enter Angle 3: ");
        int c=s.nextInt();
        if(a+b+c==180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
    
}
