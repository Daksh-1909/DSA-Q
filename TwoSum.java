import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int n = 6;
        int[] arr=new int[n];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter " + n + " elements of array:");
        for (int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target=s.nextInt();

        Map<Integer, Integer> numMap = new HashMap<>();
        boolean pairFound = false;
        for (int num : arr) {
            int complement = target - num;
            if (numMap.containsKey(complement)) {
                System.out.println("Pair is: " + complement + ", " + num);
                pairFound = true;
            }
            numMap.put(num, 1); 
        }
    }
}
