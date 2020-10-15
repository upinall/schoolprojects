public class CountByFives {
    public static void main (String args[]) {
        // Write your code here
        for(int i=5; i<=500; i+=5)
        {
            System.out.println(i + " ");
            if(i%50==0)
            System.out.println("");
        }
    }
}
