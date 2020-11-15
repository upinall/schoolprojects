import java.util.*;
public class BirthdayReminder {
    public static void main(String[] args) {
        // Write your code here
        int count=0;
        final String SENTINEL = "ZZZ";
        String[] names = new String[10];
        String[] birthdays = new String[10];
        String entry;
        int indexSearched;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter a name: ");
        entry = inputDevice.nextLine();
        while(!entry.equals(SENTINEL) && count<10)
        {
            names[count] = entry;
            System.out.println("Enter the birthday of the " + names[count]);
            birthdays[count] = inputDevice.nextLine();
            count++;
            if(count == 10)
            break;
            System.out.println("Enter a name  or " + SENTINEL + " to stop.");
            entry = inputDevice.nextLine();
        }
        System.out.println(count + " names where entered. \n");
        for(int i = 0; i < count; ++i)
        System.out.print(names[i] + " ");
        System.out.println("Enter the name to be searched for: ");
        entry = inputDevice.nextLine();
        while(!entry.equals(SENTINEL))
        {
            indexSearched = -1; 
        	for(int x = 0; x < count; ++x)
            {
            if(entry.equals(names[x])){
                indexSearched = x;
                break;
            }
        }
        if(indexSearched != -1) {
            System.out.println("Birthday of " + entry + " is " + birthdays[indexSearched]);
        } else {
            System.out.println("Sorry, no entry for " + entry);
        }
        System.out.println("Enter ANOTHER name you are looking for the birthday of or enter 'ZZZ' to stop");
            entry = inputDevice.nextLine();
        }
    }
}
