package Question3;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author DhiravRana 
 * Student Number: 16012775 
 * Question 3 Prog Assignment
 */
public class testDelivery_Details {

//Creating variables---------------------------------------------------------------------------\\    
    static String town, courier, weight;
    static double price, total, VATAmount;
    static double VAT = 0.14;

//Calling constructor from factory class -------------------------------------------------------\\
    static Delivery_Details details = new Delivery_Details(town, courier, weight, price, VAT);

//Main Method------------------------------------------------------------------------------------\\
    public static void main(String[] args) {

//switch for 1st Option Window
        int select = Integer.parseInt(JOptionPane.showInputDialog(null, "Select the town the parcel will be delivered to"
                + "\n1) Cape Town\n2) Pretoria\n3) Durban"));
        switch (select) {
            case 1:
                town = "Cape Town";
                break;
            case 2:
                town = "Pretoria";
                break;
            case 3:
                town = "Durban";
                break;
            default:
                break;
        }
//switch for 2nd Option Window
        select = Integer.parseInt(JOptionPane.showInputDialog(null, "Select the town the parcel will be delivered to"
                + "\n1) 0kg - 4kg\n2) 5kg - 9kg\n3) Over 10kg"));
        switch (select) {
            case 1:
                weight = "0kg - 4kg";
                price = 300;
                break;
            case 2:
                weight = "5kg - 9kg";
                price = 500;
                break;
            case 3:
                weight = "Over 10kg";
                price = 700;
                break;
            default:
                break;
        }
//switch for 3rd Option Window
        select = Integer.parseInt(JOptionPane.showInputDialog(null, "Select the courier company to deliver the parcel weight of "
                + weight + " to " + town + "\n1) ABC Couriers\n2) Fast Track\n3) Rest Assured"));
        switch (select) {
            case 1:
                courier = "ABC Couriers";
                break;
            case 2:
                courier = "Fast Track";
                break;
            case 3:
                courier = "Rest Assured";
                break;
            default:
                break;
        }
        //method call
        printDetails();
    }
//Class to be called in main method(Output Class)-----------------------------------------------------------------------\\

    public static void printDetails() {

        details = new Delivery_Details(town, courier, weight, price, VAT);

        //Decimal format
        DecimalFormat dr = new DecimalFormat("#0.00");

        VATAmount = (price * VAT);
        total = VATAmount + price;

        System.out.println("DELIVERY REPORT - Created On " + getCurrentTimeAndDay());
        System.out.println("**************************************************");
        System.out.println("TOWN:       R" + town);
        System.out.println("WEIGHT:     R" + weight);
        System.out.println("PRICE:      R" + dr.format(price));
        System.out.println("VAT (14%):  R" + dr.format(VATAmount));
        System.out.println("TOTAL DUE:  R" + dr.format(total));
        System.out.println("COURIER:    R" + courier);
        System.out.println("**************************************************");

    }

//____Current Date and time format____
//(https://stackabuse.com)
//Landup, D.
//(https://stackabuse.com/how-to-get-current-date-and-time-in-java/)
//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    public static Date getCurrentTimeAndDay() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        dateFormat.format(date);
        return date;
    }
}
