import java.util.Scanner;
public class AscendingAndDescending {
    public static void main(String[] args) {
        // Write your code here
        int num1,num2,num3;
        int low,medium,high;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        num1 = inputDevice.nextInt();
        System.out.println("Enter the second integer: ");
        num2 = inputDevice.nextInt();
        System.out.println("Enter the third integer: ");
        num3 = inputDevice.nextInt();
        if(num1<=num2 && num1<=num3)
        {
            low = num1;
            if (num2<=num3){
                medium = num2;
                high = num3;
            }
            else
            {
                medium = num3;
                high = num2;
            }
        }
        else {
            if (num2<=num1 && num2<=num3)
            {
                low = num2;
                if (num1<=num3)
                {
                    medium = num1;
                    high = num3;
                }
                else
                {
                    medium = num3;
                    high = num1;
                }
            }
            else {
            low = num3;
            if (num1<=num2)
            {
                medium = num1;
                high = num2;
            }
            else
            {
                medium = num2;
                high = num1;
                }
             }
        }
    System.out.println("Ascending Order: " + low + " " + medium + " " + high);
    System.out.println("Descending order: " + high + " " + medium + " " + low);
    }
}
