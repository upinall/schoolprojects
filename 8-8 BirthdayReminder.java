import java.util.*;
public class BirthdayReminder {
    public static void main(String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        final int NUM_NAMES = 10;
        String sentinal = "ZZZ";
        int count = 0;
        String name = null;
        String birthdate = null;
        String[] names = new String[NUM_NAMES];
        String[] birthdates = new String[NUM_NAMES];
        System.out.println("Enter name or type 'ZZZ' to quit");
        name = inputDevice.nextLine();
        while(!name.equals(sentinal) && count < 10){
            System.out.println("Enter month and day, (e.g.mm/dd, 04/27, etc.");
            birthdate = inputDevice.nextLine();
            //Need a way to prevent mistakes of people forgetting 'ZZZ'
            names[count] = name;
            birthdates[count] = birthdate;
            System.out.println("Enter name or type 'ZZZ' to quit");
            name = inputDevice.nextLine();
            count++;
        }
        System.out.println("\nCount of names is " + count);
        System.out.println("\nNames are:" + count);
        for(int i = 0;i < count; i++)
        {
            System.out.println(names[i]);
        }
        boolean repeat = true;
        boolean found = false;
        while(repeat)
        {
            System.out.println("Enter name or type 'ZZZ' to quit");
            name = inputDevice.nextLine();
            if(name.equals(sentinal))
            repeat = false;
            else {
                for(int i = 0; i < count && !found; i++){
                    if(names[i].equals(name)){
                        found = true;
                        birthdate = birthdates[i];
                    }
                }
                if(found){
                    System.out.println("Birthdate of " + name + " is " + birthdate);
                }
                else {
                    System.out.println("Sorry, no entry for " + name);
                }
            }
            found = false;
        }
    }
}
