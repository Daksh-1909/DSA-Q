import java.util.Scanner;

public class Alpha {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char a = s.next().charAt(0);

        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'
                || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
            System.out.println("Vowel!");
        } else {
            System.out.println("Consonant!");
        }
    }
}
