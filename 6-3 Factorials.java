public class Factorials
{
   public static void main (String args[])
   {
      // Write your code here
      for(int n=1;n<=10;n++){
          int fact = 1;
          for (int i=1; i<=n;i++){
              fact = fact*i;
          }
          System.out.println("The factorial of " + n + " is " + fact);
      }
   }
}


