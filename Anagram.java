import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1 = s.nextLine();
        System.out.println("Enter String 2: ");
        String str2 = s.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        if(str1.length()==str2.length()){
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
        else{
            System.out.println("Not Anagram");
        }        
    }
}
