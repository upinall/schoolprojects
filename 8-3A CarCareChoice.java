import java.util.*;
public class CarCareChoice {
    public static void main (String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Available services: oil change, tire rotation, battery check, or brake inspection");
        System.out.println("Select one of the services listed.");
        String servSelection = inputDevice.nextLine();
        if(servSelection.equalsIgnoreCase("oil change")){
            System.out.println("Price for " + servSelection + " is $25");
        } else if(servSelection.equalsIgnoreCase("tire rotation")){
            System.out.println("Price for " + servSelection + " is $22");
        } else if(servSelection.equalsIgnoreCase("battery check")){
            System.out.println("Price for " + servSelection + " is $15");
        } else if(servSelection.equalsIgnoreCase("brake inspection")){
            System.out.println("Price for " + servSelection + " is $5");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}
