import java.util.*;
public class ValidatePassword {
    public static void main(String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        do {
            System.out.println("Enter password:");
            String password = inputDevice.nextLine();
            int upperC = 0, lowerC = 0, num = 0;
            for (char c: password.toCharArray()){
                if (Character.isUpperCase(c)) {
                    upperC++;
                } else if (Character.isLowerCase(c)){
                    lowerC++;
                } else if (Character.isDigit(c)){
                    num++;
                }
            }
            String errorM = "";
            if (upperC < 2){
                errorM += "\n uppercase letters";
            }
            if (lowerC < 2){
                errorM += "\n lowercase letters";
            }
            if (num < 2){
                errorM += "\n digits";
            }
            if (errorM.length() > 1) {
                System.out.println("The password does not contain the following: " + errorM);
            } else {
                System.out.println("Valid password");
                break;
            }
        } while (true);
    }
}
