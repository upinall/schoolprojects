import java.util.Scanner;
public class CountByAnything
{
   // Modify the code below
   public static void main (String args[])
   {
      final int START;
      final int STOP = 500;
      final int NUMBER_PER_LINE = 10;
      int temp = 0;
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Enter value to count by: ");
      START = inputDevice.nextInt();
      for(int i = START; i <= STOP; i += START)
      {
         System.out.print(i + " ");
         temp++;
         if(temp % NUMBER_PER_LINE == 0)
            System.out.println();
      }
      System.out.println();
   }
}

