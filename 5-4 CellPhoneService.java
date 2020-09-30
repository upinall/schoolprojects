import java.util.Scanner;
public class CellPhoneService
{
    public static void main(String args[]){
        int talkminutes, text, datagb, price;
        String entryin, messagedia;
        String replan;
        final int TALKMIN = 500, TEXTSMIN = 100, DATAMIN = 2, PRICE_A = 49, PRICE_B = 55, PRICE_C = 61, PRICE_D = 70, PRICE_E = 79, PRICE_F = 87;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter talk minutes: ");
        talkminutes = inputDevice.nextInt();
        System.out.println("Enter text number of text messages: ");
        text = inputDevice.nextInt();
        System.out.println("Enter required gigabytes of data: ");
        datagb = inputDevice.nextInt();
        if (datagb > 0)
        if (datagb <= DATAMIN)
        {
            replan = "E";
            price = PRICE_E;
        }
        else
        {
            replan = "F";
            price = PRICE_F;
        }
        else if(talkminutes < TALKMIN)
        if(text == 0 && datagb == 0)
        {
            replan = "A";
            price = PRICE_A;
        }
        else
        {
            replan = "B";
            price = PRICE_B;
        }
        else if(text < TEXTSMIN)
        {
            replan = "C";
            price = PRICE_C;
        }
        else
        {
            replan = "D";
            price = PRICE_D;
        }
        System.out.println("Plan " + replan + " $" + price + " per month");
    }
}
