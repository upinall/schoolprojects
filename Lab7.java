import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args){
    char var;
    Scanner inputDevice = new Scanner(System.in);
    System.out.println("Enter a character: ");
    var = inputDevice.next().charAt(0);
    if (isVowel(var))
    System.out.println("The character '" + var + "' is a vowel");
    else
    System.out.println("The character '" + var + "' is not a vowel");
    if (isConsonants(var))
    System.out.println("The character '" + var + "' is a consonant");
    else
    System.out.println("The character '" + var + "' is not a consonant");
    System.out.println("The character in the opposite case is: " + changeCase(var));
    }
    public static boolean isVowel(char var){
    if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u' || var == 'A' || var == 'E' || var == 'I' || var == 'O' || var == 'U'){
    return true;
    } else
    return false;
}
    public static boolean isConsonants(char var){
        if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u' || var == 'A' || var == 'E' || var == 'I' || var == 'O' || var == 'U'){
            return false;
        } else
        return true;
    }
    public static char changeCase(char var){
        if(var >= 'a')
        return (char) ('A' + (var - 'a'));
        else if(var >= 'A')
        return (char) ('a' + (var - 'A'));
        else
        return var;
    }
}
