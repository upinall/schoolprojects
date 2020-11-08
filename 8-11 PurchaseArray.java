import java.util.*;
public class PurchaseArray {
    public static void main(String[] args) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        Purchase items[] = new Purchase[5];
        int invoiceNum;
        double sale;
        for(int i = 0; i < 5;i++){
            System.out.println("Enter details for item "+(i+1));
            System.out.print("Enter invoice number: ");
            invoiceNum = inputDevice.nextInt();
            while(invoiceNum<1000 || invoiceNum>8000){
                System.out.println("Enter a new amount, Note: Invoice number should be between 1000-8000 inclusive");
                System.out.print("Enter invoice number : ");
                invoiceNum = inputDevice.nextInt();
            }
            System.out.println("Enter sale amount: ");
            sale = inputDevice.nextDouble();
            while(sale<00){
                System.out.println("Enter an amount greater than $0");
                System.out.print("Enter sale amount: ");
                sale = inputDevice.nextDouble();
            }
            items[i] = new Purchase();
            items[i].setInvoiceNumber(invoiceNum);
            items[i].setSaleAmount(sale);
        }
        System.out.println("Item details are as below");
        for(int i = 0; i < 5;i++){
            items[i].display();
        }
    }
}
