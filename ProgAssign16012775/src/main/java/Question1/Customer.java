package Question1;

import javax.swing.JOptionPane;

/**
 * 16012775
 * Dhiray Rana
 * Prog Assignment 
 * Question 1
 */

//class customer
//parent class to finane_period class
public class Customer {

    //variables used for attributes of customer
    protected String customerName;
    protected String contactNum;
    protected double productPrice;
    protected int numMonths;
    protected double monthPay;

   //get method - name 
    public String getCustomerName() {
        return customerName;
    }

    //get method - c ontact number
    public String getContactNum() {
        return contactNum;
    }

    //get method - price of product
    public double getProductPrice() {
        return productPrice;
    }

    //get method - number of months for paymnent
    public int getNumMonths() {
        return numMonths;
    }

    //set method - name 
    public void setCustomerName() {
        customerName = JOptionPane.showInputDialog(null, "Please enter the customer name ");
    }

    //set method - contact number
    public void setContactNum() {
        contactNum = JOptionPane.showInputDialog(null, "Please enter the customer contact number ");
    }

    //set method - price of product
    public void setProductPrice() {
        productPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price of the product "));
    }
    
    //set method - number of months for payment
    public void setNumMonths() {
        numMonths = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of months "));
    }

    //calc repayment method
    public void calculate_repayment() {
        //monthly payments = product price / number of months
        monthPay = productPrice / numMonths;
        
    }

    //overrides the to string method to display
    @Override
    //to string display method 
    public String toString() {
        return "Customer Name: " + customerName + "\n"
                + "Customer Contact: " + contactNum + "\n"
                + "Product Amount R: " + productPrice + "\n"
                + "Repayment Months: " + numMonths + "\n"
                + "Monthly Repayment: R" + monthPay + "\n"
                + "Total Due R: " + (monthPay * numMonths) + "\n";
    }

}
