
package usecell;


public class Cell_Billing extends Cell
{

    public Cell_Billing(String cusName, int talkTime, double ppm) 
    {
        super(cusName, talkTime, ppm);
    }
    
    public void print_bill()
    {
        System.out.println("\nCUSTOMER: " + cusName 
                + "\nTALK TIME: " + talkTime 
                + "\nPRICE PER MINUTE: " + ppm 
                + "\nTOTAL BILL: R " + (talkTime * ppm));

    }

    
    
    
}
