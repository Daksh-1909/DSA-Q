import java.util.*;
public class EvenSum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements of array: ");
        for (int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<5; i++) {
            if(arr[i]%2==0) {
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum of even elements: "+sum);
    }
    
}