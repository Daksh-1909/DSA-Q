import java.util.*;
public class Mark {
    public static void main(String[] args) {
        Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter Marks of 5 subjects: ");
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();
        int s4 = s.nextInt();
        int s5 = s.nextInt();
        int marks = s1 + s2 + s3 + s4 + s5;
        float per = (marks / 5)*100;
        System.out.println("Percentage: " + per);
        if (per >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else if (marks >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }

}
