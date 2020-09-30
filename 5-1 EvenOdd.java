import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 100: ");
        int number = inputDevice.nextInt();
        if (isEven(number))
        System.out.println("The number " + number + " is even");
        else
        System.out.println("The number " + number + " is odd");
    }
    public static boolean isEven(int number) {
        boolean res;
        if(number % 2==1)
        res = false;
        else
        res = true;
        return res;
    }
}
