import java.util.Scanner;

public class Month {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Month Number: ");
        int a=s.nextInt();
        if(a>=1 && a<=12){
            if(a==1){
                System.out.println("January");
            }
            if(a==2){
                System.out.println("February");
            }
            if(a==3){
                System.out.println("March");
            }
            if(a==4){
                System.out.println("April");
            }
            if(a==5){
                System.out.println("May");
            }
            if(a==6){
                System.out.println("June");
            }
            if(a==7){
                System.out.println("July");
            }
            if(a==8){
                System.out.println("August");
            }
            if(a==9){
                System.out.println("September");
            }
            if(a==10){
                System.out.println("October");
            }
            if(a==11){
                System.out.println("November");
            }
            if(a==12){
                System.out.println("December");
            }
        }
        else{
            System.out.println("Invalid month number");
        }
    }
    
}
