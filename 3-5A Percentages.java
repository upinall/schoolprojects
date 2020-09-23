import java.io.*;
public class Percentages {
    public static void main (String args[]) {
        // Write your code here
        double x=2.0, y=5.0;
        computePercent(x,y);
        computePercent(y,x);
    }
    public static void computePercent(double x, double y) {
        // Write your code here
        System.out.println(x+" is " +((x/y)*100)+" percent of " +y + ".");
    }
}
