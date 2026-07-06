import java.util.*;
public class Fibbonacci{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=s.nextInt();
        int n1=0,n2=1,n3=0;
        System.out.print(n1+" "+n2);
        for(int i=2;i<num;i++){
            n3=n2+n1;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }

    }
}