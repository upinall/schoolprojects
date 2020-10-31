import java.util.*;
public class PigLatin {
    public static void main(String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter phrases.");
        String word = inputDevice.nextLine();
        System.out.println(translate(word));
    }
    public static String translate(String original) {
        // Write your code here
        char ch;
        int count = 0;
        while (true){
            ch = original.charAt(0);
            if (Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || (ch == 'y' && count != 0)){
                original = original + "ay";
                break;
            } else {
                original = original.substring(1) + original.charAt(0);
            }
            ++count;
            if(count == original.length()){
                original = original + "ay";
                break;
            }
        }
        return original;
    }
}
