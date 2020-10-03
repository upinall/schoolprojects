import java.util.Scanner;
public class TwelveDays
{
   public static void main(String[] args)
   {
      int day;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer... ");
      day = input.nextInt();
      
      switch(day)
      {
         case(12):
           if (day == 12)
            {
               System.out.println("On the 12th day of Christmas");
               System.out.println("My true love gave to me");
            }   
            System.out.println("Twelve Drummers Drumming");
         case(11):
            if (day == 11)
            {
               System.out.println("On the 11th day of Christmas");
               System.out.println("My true love gave to me");
            }
            System.out.println("Eleven Pipers Piping");
         case(10):
            if (day == 10)
            {
               System.out.println("On the 10th day of Christmas");
               System.out.println("My true love gave to me");
            }         
            System.out.println("Ten Lords a-leaping");
         case(9):
            if (day == 9)
            {
               System.out.println("On the 9th day of Christmas");
               System.out.println("My true love gave to me");
            }
            System.out.println("Nine Ladies Dancing");
         case(8):
            if (day == 8)
            {
               System.out.println("On the 8th day of Christmas");
               System.out.println("My true love gave to me");
            }  
            System.out.println("Eight Maids a-milking");
         case(7):
            if (day == 7)
            {
               System.out.println("On the 7th day of Christmas");
               System.out.println("My true love gave to me");
            }     
            System.out.println("Seven Swans a-swimming");
         case(6):
            if (day == 6)
            {
               System.out.println("On the 6th day of Christmas");
               System.out.println("My true love gave to me");
            }
            System.out.println("Six Geese a-laying");
         case(5):
            if (day == 5)
            {
               System.out.println("On the 5th day of Christmas");
               System.out.println("My true love gave to me");
            }
            System.out.println("Five Golden Rings");
         case(4):
            if (day == 4)
            {
               System.out.println("On the 4th day of Christmas");
               System.out.println("My true love gave to me");
            }
            System.out.println("Four Calling Birds");
         case(3):
            if (day == 3)
            {
               System.out.println("On the 3rd day of Christmas");
               System.out.println("My true love gave to me");
            }   
            System.out.println("Three French Hens");
         case(2):
            if (day == 2)
            {
               System.out.println("On the 2nd day of Christmas");
               System.out.println("My true love gave to me");
            }
            System.out.println("Two turtle doves and");
         case(1):
            if (day == 1)
            {
               System.out.println("On the 1st day of Christmas");
               System.out.println("My true love gave to me");
            }
            System.out.print("A Partridge in a Pear Tree");
            break;
         default:
            System.out.println("Not a valid day");
      }
   }
}                                
