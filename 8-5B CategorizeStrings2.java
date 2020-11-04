import java.util.*;
public class CategorizeStrings2
{
   // Modify the code below
   public static void main (String[] args)
   {
      final int MAX = 20;
      final int CUTOFF = 10;
      final String QUIT = "ZZZ";
      String entry;
      int oneCount = 0, twoCount = 0, longCount = 0;
      Scanner input = new Scanner(System.in);
      String[] oneWordStrings = new String[MAX];
      String[] twoWordStrings = new String[MAX];
      String[] LongerStrings = new String[MAX];

      System.out.print("Enter a string or " +
         QUIT + " to quit >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT) && (oneCount + twoCount + longCount < MAX))
      {
         if(entry.split(" ").length == 1)
         {
            oneWordStrings[oneCount] = entry;
            ++oneCount;
         }
         else if(entry.split(" ").length==2)
         {
            twoWordStrings[twoCount] = entry;
            ++twoCount;
         } else {
             LongerStrings[longCount] = entry;
             ++longCount;
         }
         if(oneCount + twoCount + longCount < MAX)
         {
            System.out.print("Enter a string or " +
               QUIT + " to quit >> ");
            entry = input.nextLine();
         }
      }
      System.out.println("\nDo you want to see the list of one word strings or the list of two word strings or longer strings?");
      System.out.print("   Please enter O, T, L or " +
         QUIT + " to quit >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT))
      {
          if(entry.substring(0, 1).equalsIgnoreCase("O"))
             display(oneWordStrings, oneCount);
          else if(entry.substring(0, 1).equalsIgnoreCase("T"))
             display(twoWordStrings, twoCount);
             else if(entry.substring(0,1).equalsIgnoreCase("L"))
             display(LongerStrings, longCount);
             else{
                 display(oneWordStrings, oneCount);
                 display(twoWordStrings, twoCount);
                 display(LongerStrings, longCount);
             }
          System.out.println("\nDo you want to see the list of short strings or the list of long strings?");
          System.out.print("   Please enter S or L or " +
             QUIT + " to quit >> ");
          entry = input.nextLine();
      }
   }
   public static void display(String[] array, int max)
   {
      System.out.println();
      if(max == 0)
         System.out.println("The list is empty");
      else
         for(int x = 0; x < max; ++x)
            System.out.println(array[x]); 
   }
}
