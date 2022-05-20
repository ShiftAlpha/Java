/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.text.DecimalFormat;

/**
 * 16012775 Dhiray Rana Prog Assignment Question 1
 */
//extended class from customer - child class to customer(parent) class
public class Finance_Period extends Customer {

    //overrides calc repayment method 
    @Override
    //calculate repayment method
    public void calculate_repayment() {

        //decimal format class to, two decimal points
        DecimalFormat df = new DecimalFormat("#.##");
        //if statement - if greater than 3 months
        if (numMonths > 3) {
            // if greater than 3 months - monthly payments = (product price + 25%) / number of months
            monthPay = (productPrice * 1.25) / numMonths;
            //print with decimal format
            df.format(monthPay);
            //else condition 
        } else {
            //super class calling standard repayment method 
            super.calculate_repayment();
        }
    }

    //override to string method 
    @Override
    public String toString() {
        //returns super to string method from customer 
        return super.toString();
    }
}
