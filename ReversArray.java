import java.util.*;
public class ReversArray {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 5 elements of array:");

        for (int i=0;i<5;i++) {
            arr[i]=s.nextInt();
        }
        for (int i=0; i<arr.length/2;i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println("Reversed array:");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

    }
}