public class Recursion {
    public static int NaturalNum(int n) {
        if (n==0) {
            return 1;
        }
        return n+NaturalNum(n-1);
        
    } 
    public static void main(String[] args) {
        int n=20;
        int sum=NaturalNum(n);
        System.out.print(sum);
    }
}
