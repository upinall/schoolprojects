import java.util.Scanner;
class ChiliToGo {
    public static void main(String[] args) {
        // Write your code here
        int adults, children;
        double totalAdult, totalChild, totalFinal;
        final double priceOfAdult = 7.00;
        final double priceOfChildren = 4.00;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("How many adult meals?");
        adults = inputDevice.nextByte();
        System.out.println("How many children meals?");
        children = inputDevice.nextByte();
        totalAdult = adults*priceOfAdult;
        totalChild = children*priceOfChildren;
        totalFinal = totalAdult + totalChild; 
        System.out.println("Price of adult meals: " + totalAdult + "\nPrice of children meals: " + totalChild + "\nTotal Balance: " + totalFinal);
    }
}
