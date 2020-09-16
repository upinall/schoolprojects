import java.util.Scanner;
class QuartsToGallonsInteractive
{
   public static void main(String[] args) 
   {   
      // Modify the code below
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded;
      int gallonsNeeded;
      int extraQuartsNeeded;
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("How many quarts are needed?");
      quartsNeeded = inputDevice.nextInt();
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts."); 
   }
}
