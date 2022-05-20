/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @16012775 - Dhirav Rana
 * ICE 1
 */
public class mobileDevice {

    //device sale, brand, month arrays
    static int[][] arrDeviceSales = {{30, 15, 35}, {20, 25, 30}, {25, 11, 32}};
    static String[] arrDeviceBrand = {"|IPhone 7", "Samsung S8", "Huawei Mate 10"};
    static String[] arrMonth = {"JAN", "FEB", "MAR"};

    ////global - total variable
    static int total;
    
    //main method
    public static void main(String[] args) {
        
        //method calls
        printHeading();
        printCol();
        printDeviceSales();
        printMonthlyTotals();

    }
    //prints heading method
    public static void printHeading() {
        System.out.println("\n**************************************************"
                + "\nTop CELL PHONE SALES REPORT - 2018"
                + "\n*********************************************************");
    }

    //prints device sales method
    public static void printDeviceSales() {
        String joinRow = "\n";
        total = 0;
        //nested for loop - to loop through 2D arrays 
        for (int i = 0; i < arrDeviceSales.length; i++) {
            //appends device brand to variable joinRow
            joinRow += arrDeviceBrand[i] + "\t";
            for (int j = 0; j < arrDeviceSales[i].length; j++) {
                //appends sales to joinRow variable
                joinRow += arrDeviceSales[i][j] + "\t\t";
                //increments device sale value at array index to total
                total += arrDeviceSales[i][j];
            }
            //appends total value to joinRow
            joinRow += total;
            //prints joinRow variable
            System.out.println(joinRow);
            joinRow = "";
            total = 0;
        }
    }
    
    //prints monthly totals
    public static void printMonthlyTotals() {
        String monthlyTotals = "********************************************************"
                + "\nMONTHLY TOTAL\t";
        
        //nested for loop - loop through 2D arrays
        for (int i = 0; i < arrDeviceSales.length; i++) {
            for (int j = 0; j < arrDeviceSales[i].length; j++) {
                total += arrDeviceSales[i][j];
            }
            //increment total to monthly total variable
            monthlyTotals += total + "\t\t";
            //set total to 0
            total = 0;
        }
        monthlyTotals += "\n**********************************************************";
        //prints monthlyTotals variable
        System.out.println(monthlyTotals);
    }

    //prints collumn method 
    public static void printCol() {
        //string variable 
        String printCol = "";
        //singular for loop to print month collumns
        for (int i = 0; i < arrMonth.length; i++) {
            printCol += "\t\t" + arrMonth[i];
        }
        //appends two tab spaces and TOTAL to printCol variable
        printCol += "\t\t" + "TOTAL";
        //prints printCol variable
        System.out.println(printCol);
    }

}
