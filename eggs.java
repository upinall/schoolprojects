import java.util.Scanner;
class Eggs {
    public static void main(String[] args) {
        // Write your code here
        int eggs, dozen, individual;
        double price;
        final double priceOfDozen = 3.25;
        final double priceOfIndividual = 0.45;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("How many eggs do you want?");
        eggs = inputDevice.nextInt();
        dozen = eggs / 12;
        individual = eggs % 12;
        price = (dozen * priceOfDozen) + (individual*priceOfIndividual);
        System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen at $3.25 per dozen and " + individual + " loose eggs at 45 cents each for a total of $" + price + ".");
    }
}
