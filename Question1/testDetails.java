package Question1;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author DhiravRana 
 * Student Number: 16012775 
 * Question 1 Prog Assignment
 */
public class testDetails {

//____DECIMAL FORMAT____
//(http://tutorials.jenkov.com/)
//Jenkov, J.
//(http://tutorials.jenkov.com/java-internationalization/decimalformat.html)
//DecimalFormat df = new DecimalFormat("#0.00");   
    static DecimalFormat df = new DecimalFormat("#0.00");

    static int eID = 0;
    static int question = 0;

    static String fName = "";
    static String sName = "";

    static double originalSalary = 0;
    static double updatedSalary = 0;
    static double increasedAmount = 0;

    static double tax = 0;
    static double medical = 0;
    static double carAllowance = 0;
    static double UIF = 0;

    static double total;
    
    static Details printDetails = new Details(fName, sName, eID, updatedSalary);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee number                 >> ");
        eID = sc.nextInt();

        System.out.print("Enter employee first name             >> ");
        fName = sc.next();

        System.out.print("Enter employee surname                >> ");
        sName = sc.next();

        System.out.print("Enter employee salary to be increased >> ");
        updatedSalary = sc.nextInt();

        printDetails();//method call

        System.out.println("Would you like to see the increased salary with deductions? Enter (1) to view deductions report or any other key to exit");
        question = sc.nextInt();

        //decision structure - if 1 is input; display salary deductions 
        if (question == 1) {
            salaryDeductions();
        }
    }
//print details method----------------------------------------------------------\\
    public static void printDetails() {

        printDetails = new Details(fName, sName, eID, updatedSalary);
        increasedAmount = printDetails.getUpdatedSalary() - printDetails.getOriginalSalary();

        System.out.println("\n\nEMPLOYEE DETAILS REPORT");
        System.out.println("******************************\n");
        System.out.println("EMPLOYEE ID NUMBER         : " + printDetails.geteID());
        System.out.println("EMPLOYEE FIRST NAME     : " + printDetails.getfName());
        System.out.println("EMPLOYEE SURNAME           : " + printDetails.getsName());
        System.out.println("EMPLOYEE ORIGINAL SALARY   : R" + df.format(printDetails.getOriginalSalary()));
        System.out.println("EMPLOYEE INCREASE SALARY   : R" + df.format(printDetails.getUpdatedSalary()));
        System.out.println("EMPLOYEE INCREASED AMOUNT  : R" + df.format(increasedAmount));
        System.out.println("*******************************");

    }

    //salaray deductions method----------------------------------------------------------\\
    public static void salaryDeductions() {

        total = (printDetails.getUpdatedSalary()) - (printDetails.tax() + printDetails.carAllowance() + printDetails.medical() + printDetails.UIF());

        System.out.println("\n\n");
        System.out.println("EMPLOYEE DEDUCTIONS REPORT");
        System.out.println("**************************");
        System.out.println("SALARY         : R" + df.format(printDetails.getUpdatedSalary()));
        System.out.println("TAX            : R" + df.format(printDetails.tax()));
        System.out.println("MEDICAL        : R" + df.format(printDetails.medical()));
        System.out.println("CAR ALLOWANCE  : R" + df.format(printDetails.carAllowance()));
        System.out.println("UIF            : R" + df.format(printDetails.UIF()));
        System.out.println("Take Home Pay  : R" + df.format(total));
        System.out.println("**************************");
        System.out.println("Application Complete");

    }

}
