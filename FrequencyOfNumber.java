public class FrequencyOfNumber {
    public static void main(String[] args){
        int[] arr={1,1,2,3,4,4,3,2,4};
        int n=arr.length;
        boolean[] visited=new boolean[n];
        
        for (int i=0;i<n;i++) {
            if (visited[i]) {
                continue;
            }

            int count=0;
            for (int j=0;j<n;j++) {
                if (arr[i]==arr[j]) {
                    count++;
                    visited[j]=true;
                }
            }

            System.out.println("Frequency of "+arr[i]+" = "+count);
        }
    }
    
}
