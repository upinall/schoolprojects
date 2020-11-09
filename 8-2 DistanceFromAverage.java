import java.util.*;
public class DistanceFromAverage {
    public static void main (String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        double uV = 0;
        int count = 0, max = 10;
        double sum = 0, average = 0;
        double[] distance = new double[max];
        int i;

        for(i=0; i < max; i++){
            System.out.println("Enter value or enter '99999' to quit");
            uV = inputDevice.nextDouble();
            distance[i] = uV;
            if (distance [0] == 99999)
            {
                System.out.print("Program terminated before any values entered. \nEnd of Program");
                System.exit(1);
            }
            else  if(uV != 99999)
            {
                distance[i] = uV;
                sum = uV + sum;
                count++;
                average = (sum/count);
            }
            else if(uV == 99999)
            {
                for(i=0; i < count; i++)
                {
                    double subtract = 0;
                    subtract = (distance[i] - average);
                    System.out.printf("The value " + distance[i] + "%.2f", + subtract);
                    System.out.println(" points away from the average of " + average);
                }
                System.exit(1);
            }
        }
        for(i=0; i < count; i++)
        {
            double subtract=0;
            subtract = (distance[i] - average);
            System.out.printf("The value " + distance[i] + " is " + "%.2f", + subtract );
            System.out.println(" points away from the average of " + average );
        }
        System.exit(1);
    }
}
