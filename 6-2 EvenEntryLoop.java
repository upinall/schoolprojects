import java.util.*;
public class EvenEntryLoop {
    public static void main (String args[]) {
        // Write your code here
        int num;
        Scanner inputDevice = new Scanner(System.in);
        do{
            System.out.println("Enter the number: "); // (Even - continue / 999 - Exit)
            num = inputDevice.nextInt();
            if(num%2==0)
            System.out.println("Good Job!");
            else if(num == 999)
            System.exit(0);
            else
            System.out.println(num + " is not an even number");
        }while(num != 999);
    }
}
