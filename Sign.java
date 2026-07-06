import java.util.*;
class Sign {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=s.nextInt();
        if(a>0)
        {
            System.out.print("Positive!");
        }
        if(a<0)
        {
            System.out.print("Negative!");
        }
        if(a==0)
        {
            System.out.print("Zero!");
        }
    }
}