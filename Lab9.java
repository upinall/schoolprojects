import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args){
        int n;
        System.out.println("Enter number of stars to print: ");
        Scanner inputDevice = new Scanner(System.in);
        n = inputDevice.nextInt();
        printStars(n);

        System.out.println("Enter number for multiples: ");
        n = inputDevice.nextInt();
        multiples(n);

        System.out.println("Enter the number to check for even: ");
        n = inputDevice.nextInt();
        if(hasAnEvenDigit(n))
        System.out.println(n + " has even digits.");
        else
        System.out.println(n + " does not have even digits.");
    }
    public static void printStars(int n)
    {
        for (int i=1;i<=n;i++)
            System.out.print("*");
        System.out.println();
    }
    public static void multiples(int n)
    {
        for (int i=1;i<=10;i++)
            System.out.print(i*n+" ");
        System.out.println();
    }
    public static boolean hasAnEvenDigit(int n)
    {
        if(n==0)
        return true;
        while(n>0)
        {
            int digit=n%10;
            if(digit%2==0)
            return true;
            n=n/10;
        }
        return false;
    }
}
