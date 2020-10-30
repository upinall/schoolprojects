import java.util.*;
public class CountSpaces2 {
    public static void main(String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a quote!");
        String quote = inputDevice.nextLine();
        for (int i = 0; i < quote.length(); i++){
            if (quote.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
