// Displays five random numbers between 
// (and including) user-specified values
import java.util.Scanner;
public class DebugSix4
{
   public static void main(String[] args)
   {
      int high, low, count = 0;
      final int NUM = 5;
      Scanner input = new Scanner(System.in);
      System.out.print("This application displays " + NUM +
         " random numbers" +
         "\nbetween the low and high values you enter" +
         "\nEnter low value now... ");
      low = input.nextInt();
      System.out.print("Enter high value... ");
      high = input.nextInt();
      while(low >= high)
      {
         System.out.println("The number you entered for a high number, " +
            high + ", is not more than " + low);
         System.out.print("Enter a number higher than " + low + "... ");
         high = input.nextInt();
      

      while(count < NUM)
      {
         double result = Math.random();
         int answer = (int) (result * 10 + low);
         if(answer <= high)
         {
            System.out.print(answer + "  ");
            ++count;
         }
      }
   }
   System.out.println("End of Application");
}
}
