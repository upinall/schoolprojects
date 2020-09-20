import java.util.Scanner;
class Dollars {
    public static void main(String[] args) {
        // Write your code here
        int noTwenty, noTen, noFive, noOne;
        final int money, balanceAfterTwenty, balanceAfterTen, balanceAfterFive;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Insert amount:");
        money = inputDevice.nextInt();
        noTwenty = ((int) money / 20);
        balanceAfterTwenty = money - (noTwenty*20);
        noTen = ((int) balanceAfterTwenty / 10);
        balanceAfterTen = money - ((noTwenty*20) + (noTen*10));
        noFive = ((int) balanceAfterTen / 5);
        balanceAfterFive = money - ((noTwenty*20) + (noTen*10) + (noFive * 5));
        noOne = ((int) balanceAfterFive / 1);
        System.out.println("$" + money + " converted is " + noTwenty + " $20s, " + noTen + " $10s, " + noFive + " $5s, and " + noOne + " $1s");
    }
}
