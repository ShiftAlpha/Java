/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * 16012775 Dhiray Rana Prog Assignment Question 1
 */
//class - customer finance 
public class Customer_Finance {

    //main class/method
    public static void main(String[] args) {
        
        //finance period object created with attributes in the finance class
        Finance_Period obj = new Finance_Period();

        //obj attribute sets 
        
        //customer name 
        obj.setCustomerName();
        //customer number 
        obj.setContactNum();
        //product price 
        obj.setProductPrice();
        //number of months 
        obj.setNumMonths();
        //calculate repayment
        obj.calculate_repayment();
        
        //displays object attributes 
        JOptionPane.showMessageDialog(null, obj.toString());

    }
}
