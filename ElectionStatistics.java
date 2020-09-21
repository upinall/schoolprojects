import java.util.Scanner;
class ElectionStatistics {
    public static void main(String[] args) {
        // Write your code here
        int vote1, vote2, vote3;
        String party1, party2, party3;
        int total;
        double pct1, pct2, pct3;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter name of the first party:");
        party1 = inputDevice.nextLine();
        System.out.println("How many votes received?");
        vote1 = inputDevice.nextInt();
        inputDevice.nextLine();
        System.out.println("Enter name of the second party:");
        party2 = inputDevice.nextLine();
        System.out.println("How many votes received?");
        vote2 = inputDevice.nextInt();
        inputDevice.nextLine();
        System.out.println("Enter the name of the third party:");
        party3 = inputDevice.nextLine();
        System.out.println("How many votes received?");
        vote3 = inputDevice.nextInt();
        inputDevice.nextLine();
        total = vote1 + vote2 + vote3;
        pct1 = (double) vote1 / total*100;
        pct2 = (double) vote2 / total*100;
        pct3 = (double) vote3 / total*100;
        System.out.println("The " + party1 + " party got %" + pct1 + " of the vote" + "\nThe " + party2 + " party got %" + pct2 + " of the vote" + "\nThe " + party3 + " party got %" + pct3 + " of the vote");
    }
}
