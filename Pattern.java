public class Pattern{
    public static void main(String[] args) {
        int i=0,j=0,n=10;
        int mid=(n+1)/2;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=mid;j++){
                if((i==mid || j==mid) || (i==1 & j<=mid) || (i==n & j<=mid) || (j==1 & i<=mid))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}