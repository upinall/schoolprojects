import java.util.*;
class PhoneNumbers {
    public static void main(String[] args) {
        // Write your code here
        String[] names = new String[30];
        String[] phones = new String[30];
        int count = 0;
        Scanner inputDevice = new Scanner(System.in);
        String input;
        names[0] = "Gina";
        phones[0] = "(847) 341-0912";
        names[1] = "Marcia";
        phones[1] = "(847) 341-2392";
        names[2] = "Rita";
        phones[2] = "(847) 354-0654";
        names[3] = "Jennifer";
        phones[3] = "(414) 234-0912";
        names[4] = "Fred";
        phones[4] = "(414) 435-6567";
        names[5] = "Neil";
        phones[5] = "(608) 123-0904";
        names[6] = "Judy";
        phones[6] = "(608) 435-0434";
        names[7] = "Ariene";
        phones[7] = "(608) 123-0312";
        names[8] = "LaWanda";
        phones[8] = "(920) 787-9813";
        names[9] = "Deepak";
        phones[9] = "(930) 412-0991";
        count = 10;
        input = "";
        while (!input.equalsIgnoreCase("quit")) {
            System.out.print("Enter a name (or quit to end): ");
            input = inputDevice.nextLine();
            if(!input.equalsIgnoreCase("quit")){
                boolean found = false;
                for(int i = 0; i < count; i++) {
                    if(names[i].equalsIgnoreCase(input)) {
                        System.out.println("Found!");
                        System.out.println("Phone number of " + input + " is " + phones[i]);
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    System.out.println(input + " does not exist on the list");
                    if (count < 30) {
                        names[count] = input;
                        System.out.print("Enter the phone number of " + input + ": ");
                        input = inputDevice.nextLine();
                        phones[count] = input;
                        count++;
                        System.out.println("Added to the list");
                    } else {
                        System.out.println("Unfortunately, you cannot add new entries as the list is full");
                    }
                }
            }
        }
    }
}
