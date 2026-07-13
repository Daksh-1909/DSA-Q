import java.util.*;
public class MaxInArray {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int max=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 5 elements of array:");
        for(int i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array is: "+max);
    }
}
