public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,6,4,8,1,0};
        int target=5;
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]+arr[j]==target) {
                    System.out.println("Pair is: "+arr[i]+", "+arr[j]);
                }
            }
        }
    }
}
