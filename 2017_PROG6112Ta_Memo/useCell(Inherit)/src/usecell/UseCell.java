
package usecell;
import java.util.*;

public class UseCell 
{
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the customer name: ");
        String cusName = input.nextLine();
        System.out.print("Enter the talk time in minutes: ");
        int talkTime = input.nextInt();
        System.out.print("Enter the price per minute: ");
        double ppc = input.nextDouble();
        
        Cell_Billing objCellBill1 = new Cell_Billing(cusName, talkTime, ppc);
        objCellBill1.print_bill();
    }
    
}
