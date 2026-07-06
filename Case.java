import java.util.Scanner;
public class Case {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Character: ");
        char a=s.next().charAt(0);
        if(a>=97 && a<=122)
        {
            System.out.println("Lowercase!");
        }
        if(a>=65 && a<=91)
        {
            System.out.println("Uppercase!");
        }
    }
}
