import java.util.Scanner;

//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due: January 23rd
//Christmas Tree - Produces images of christmas trees based on numbers input by the user.   
public class ChrisTree {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please input number of segments");
        int num1 = inputDevice.nextInt();
        System.out.println("Please enter the height number (number of rows in each segment)");
        int num2 = inputDevice.nextInt();
        drawTree(num1, num2);
    }
    public static void drawTree(int num1, int num2){
        int a = num1;
        int b = num2;
        int start = 1;
        for(int seg = 1;seg <= num1;seg++){
            for(int i = start; i <= num2;i++){
                int x = seg;
                while(x < num1){
                    System.out.print(" ");
                    x++;
                }
                for (int j = num2 - 1;j >= i; j--)
                System.out.print(" ");
                for (int j = 1; j <= i; j++)
                System.out.print("*");
                for (int k = 1;k < i; k++)
                System.out.print("*");
                System.out.println();
            }
            start += 1;
            num2 += 1;
        }
        for(int i = 1; i <= (a*b-1)/2;i++)
        System.out.print(" ");
        System.out.println("*");
        for(int i = 1;i <= (a*b-1)/2;i++)
        System.out.print(" ");
        System.out.println("*");
        for(int i = 1; i <= ((a*b-1)/2)-3; i++)
        System.out.print(" ");
        for(int j = 1;j<=7;j++)
        System.out.print("*");
    }
}
