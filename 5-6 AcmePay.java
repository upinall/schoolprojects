import java.util.*;
public class AcmePay {
    public static void main(String[] args) throws Exception {
        // Write your code here
        String entryin, messagedis;
        int shiftmo;
        double hours_Worked;
        double regular_Pay, overtime_Pay, total_Pay;
        double pay_Rate;
        double ret_Deduction = 0;
        int ret_Option = 0;
        final double PAY_1 = 17.00;
        final double PAY_2 = 18.50;
        final double PAY_3 = 22.00;
        final int FULL_WEEK = 40;
        final double OTRATE = 1.5;
        final double RETRATE = 0.03;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter shift: 1, 2, or 3");
        shiftmo = inputDevice.nextInt();
        System.out.println("Enter hours worked: ");
        hours_Worked = inputDevice.nextDouble();
        if(shiftmo == 1)
        pay_Rate = PAY_1;
        else if(shiftmo == 2)
        pay_Rate = PAY_2;
        else
        pay_Rate = PAY_3;
        if(hours_Worked > FULL_WEEK)
        {
            regular_Pay = FULL_WEEK*pay_Rate;
            overtime_Pay = (hours_Worked - FULL_WEEK)*OTRATE*pay_Rate;
        }
        else
        {
            regular_Pay = hours_Worked*pay_Rate;
            overtime_Pay = 0.0;
        }
        total_Pay = regular_Pay + overtime_Pay;
        if(shiftmo == 2 || shiftmo == 3)
        {
            System.out.println("Do you want to particiapte in the retirement plan?\n" + "Enter 1 for yes and 2 for no: ");
            ret_Option = inputDevice.nextInt();
            if(ret_Option == 1)
            ret_Deduction = total_Pay*RETRATE;
        }
        System.out.println("\nHours worked is: " + hours_Worked + "\nShift is: " + shiftmo + "\nHourly pay rate is: " + pay_Rate + "\nRegular pay is: " + regular_Pay + "\nOvertime pay is: " + overtime_Pay + "\nTotal of regular and overtime pay is: " + total_Pay + "\nRetirement deduction is: " + ret_Deduction + "\nNet Pay is: " + (total_Pay - ret_Deduction));
}
}
