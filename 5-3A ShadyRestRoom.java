import java.util.Scanner;
public class ShadyRestRoom {
    public static void main (String args[]) {
        // Write your code here
        int choice, price;
        String text;
        final int QUEEN1 = 1, KING1 = 2, SUITE1 = 3;
        final int Q_PRICE = 125, K_PRICE = 139, S_PRICE = 165;
        final String Q_STRING = "Queen bed", K_STRING = "King bed", S_STRING = "Suite with a king bed and a pull-out couch", INVALID_STRING = "an invalid option";
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Menu\n");
        System.out.println("" + QUEEN1 + " " + Q_STRING);
        System.out.println("" + KING1 + " " + K_STRING);
        System.out.println("" + SUITE1 + " " + S_STRING);
        System.out.println("Choose between (1, 2, or 3): ");
        choice = inputDevice.nextInt();
        if(choice == QUEEN1)
        {
            text = Q_STRING;
            price = Q_PRICE;
        }
        else if(choice == KING1)
        {
            text = K_STRING;
            price = K_PRICE;
        }
        else if(choice == SUITE1)
        {
            text = S_STRING;
            price = S_PRICE;
        }
        else
        {
            text = INVALID_STRING;
            price = 0;
        }
        System.out.println("You selected " + text + " and the price of the room is $" + price);
    }
}
