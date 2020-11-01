import java.util.*;
public class PhoneNumberFormat {
    public static void main(String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        do {
            System.out.print("Enter the Phone Number: ");
            String phoneText = inputDevice.nextLine();
            if (phoneText.contains("999"))
            break;

            if (phoneText.matches("[0-9]+") && phoneText.length() == 10){
                System.out.println("phoneNumber: " + "(" + phoneText.substring(0, 3) + ") " + phoneText.substring(3, 6) + "-" + phoneText.substring(6, 10));
            } else {
                System.out.println("Error, enter valid phone number");
            }
        } while (true);
        inputDevice.close();
    }
}
