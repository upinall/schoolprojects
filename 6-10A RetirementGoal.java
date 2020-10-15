import java.util.Scanner;
public class RetirementGoal
{
   public static void main (String[] args)
   {
      // your code here
      Scanner inputDevice = new Scanner(System.in);
      int years;
      double money;
      double totalSavings=0;
      do {
          System.out.println("Enter the number of years before retirement: ");
          years = inputDevice.nextInt();
          if(years <= 0)
          System.out.println("Invalid years");
      }while (years <= 0);
      do {
          System.out.println("Enter the amount of money saved annually: ");
          money = inputDevice.nextDouble();
          if(money<=0)
          System.out.println("Invalid amount");
      }while (money<=0);
      for (int year = 0; year < years; year++)
      {
          totalSavings = totalSavings+money;
      }
      System.out.println("Number of years until retirement: " + years);
      System.out.println("Savings by retirement: " + totalSavings);
   }
}

