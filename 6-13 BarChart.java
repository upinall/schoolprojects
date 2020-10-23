import java.util.Scanner;
public class BarChart {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int artPoints;
        int bobPoints;
        int calPoints;
        int danPoints;
        int eliPoints;
        final int AMT_EACH_ASTERISK = 10;
        System.out.print("Enter points earned by Art >> ");
        artPoints = input.nextInt();
        System.out.print("Enter points earned by Bob >> ");
        bobPoints = input.nextInt();
        System.out.print("Enter points earned by Cal >> ");
        calPoints = input.nextInt();
        System.out.print("Enter points earned by Dan >> ");
        danPoints = input.nextInt();
        System.out.print("Enter points earned by Eli >> ");
        eliPoints = input.nextInt();
        System.out.println("\nPoints for Game\n");

        // Write your code here to draw charts
        drawChart("Art", artPoints, AMT_EACH_ASTERISK);
        drawChart("Bob", bobPoints, AMT_EACH_ASTERISK);
        drawChart("Cal", calPoints, AMT_EACH_ASTERISK);
        drawChart("Dan", danPoints, AMT_EACH_ASTERISK);
        drawChart("Eli", eliPoints, AMT_EACH_ASTERISK);
    }
    public static void drawChart(String name, int points, int amt_each) {
        // Write your code here
        System.out.print(name + " ");
        for (int i = 0; i<points; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}

