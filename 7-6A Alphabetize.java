import java.util.*;
public class Alphabetize
{
  public static void main(String[] args)
  {
    // your code here
    Scanner inputDevice = new Scanner(System.in);
    System.out.println("Enter three words");
    String word1 = inputDevice.next(), word2 = inputDevice.next(), word3 = inputDevice.next();
    if(word1.compareTo(word2)<= 0 && word2.compareTo(word3) <= 0){
        System.out.println("You entered the strings in alphabetical order");
    } else {
        System.out.println("You did not enter the words in alphabetical order");
    }
  }
}
