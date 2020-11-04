import java.util.*;
public class CategorizeStrings
{
   public static void main (String[] args)
   {
      // your code here
      ArrayList<String> shortList = new ArrayList<String>();
      ArrayList<String> longList = new ArrayList<String>();
      int MAX = 20, count = 0;
      Scanner inputDevice = new Scanner(System.in);
      String input = "";
      while (count < MAX && !input.equalsIgnoreCase("ZZZ")){
          System.out.print("Enter a word (or ZZZ to finish): ");
          input = inputDevice.nextLine();
          if (!input.equalsIgnoreCase("ZZZ")){
              if (input.length() >= 11){
                  longList.add(input);
              } else {
                  shortList.add(input);
              }
              count++;
          }
      }
      System.out.print("What type of Strings to display (S for short, L for long): ");
      input = inputDevice.nextLine();
      if (input.equalsIgnoreCase("S")){
          if (shortList.isEmpty()){
              System.out.println("The list is empty");
          } else {
              System.out.println("Short words:  ");
              for (String str : shortList){
                  System.out.println(str);
              }
          }
      } else if (input.equalsIgnoreCase("L")) {
          if (longList.isEmpty()){
              System.out.println("The list is empty");
          } else {
              System.out.println("Long words: ");
              for (String str : longList) {
                  System.out.println(str);
              }
          }
      }
      inputDevice.close();
   }

   // display() 
}

