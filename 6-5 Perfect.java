public class Perfect {
    public static void main (String args[]) {
        // Write your code here
        for(int x=1; x<=1000; x++)
        {
            if(perfect(x))
            System.out.println(x + " is perfect");
        }
    }
    public static boolean perfect(int n) {
        // Write your code here
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
}
