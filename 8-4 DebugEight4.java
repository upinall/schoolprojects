// Application allows user to enter a series of words
// and displays them in reverse order
import java.util.*;
public class DebugEight4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int x = 0, y;
      String array[] = new String[100];
      String entry;
      final String STOP = "XXX";
      StringBuffer message = new
          StringBuffer("The words in reverse order are\n");
     
      System.out.println("Enter any word\n" +
      "Enter " + STOP +  " when you want to stop");
      entry = input.next();
      while(!(entry.equals(STOP)))
      {
         array[x] = entry;
         ++x;
         System.out.println("Enter another word\n" +
         "Enter " + STOP + " when you want to stop");
         entry = input.next();
      }
      for(y = x - 1; y >= 0; y--)
      {
         message.append(array[y]);
         message.append("\n");
      }
      System.out.println(message);
}
}

