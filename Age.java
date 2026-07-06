import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter Age of Ram: ");
        int ram = s.nextInt();
        System.out.println("Enter Age of Shyam: ");
        int shyam = s.nextInt();
        System.out.println("Enter Age of Ajay: ");
        int ajay = s.nextInt();
        if(ajay<ram && ajay<shyam){
            System.out.println("Ajay is youngest");
        }
        if(ram<ajay && ram<shyam){
            System.out.println("Ram is youngest");
        }
        if(shyam<ajay && shyam<ram){
            System.out.println("Shyam is youngest");
        }
        if(ajay==ram){
            System.out.println("Ram and Ajay are youngest");
        }
        if(ajay==shyam){
            System.out.println("Shyam and Ajay are youngest");
        }
        if(shyam==ram){
            System.out.println("Ram and Shyam are youngest");
        }
        
    }

    
}
