import java.util.*;
public class ThreeLetterAcronym {
    public static void main(String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        String sentence = inputDevice.nextLine();
        String[] words = sentence.split("\\s+");
        int i = 0;
        for (String curr : words) {
            if (i < 3){
                System.out.print((curr.charAt(0) + "").toUpperCase());
                i++;
            }
        }
        inputDevice.close();
    }
}
