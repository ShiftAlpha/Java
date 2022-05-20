
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class testQuestion4 {

    static String name = "";
    static double salesAmount = 0;
    static double totalSales = 0;
    static int c = 1;

    static question4 printQuestion4 = new question4(name, salesAmount);

    public static void main(String[] args) {

        int stop = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee name:");
        name = sc.next();
        System.out.println("Enter the sale " + c + " amount: R");
        salesAmount = sc.nextDouble();

        while (salesAmount != stop) {
            if (salesAmount == 0) {
                printDetails();
            } else if (salesAmount < 0) {
                System.out.println("You have entered a sale less than zero.\nPlease enter the sale again");
                salesAmount = 1;
            }
            System.out.println("Enter the sale " + (c += 1) + " amount: R");
            salesAmount = sc.nextDouble();
            totalSales += salesAmount;

        }
        printDetails();
    }

    public static void printDetails() {

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("------------------------");
        System.out.println("EMPLOYEE SALES REPORT");
        System.out.println("------------------------");
        System.out.println("EMPLOYEE: " + name);
        System.out.println("TOTAL SOLD: R" + totalSales);
        System.out.println("------------------------");
        System.out.println("SALES COUNT: " + c);
        System.out.println("AVERAGE SALES: R" + df.format(averageSales()));
    }

    public static double averageSales() {

        double averageSales = totalSales / c;

        return averageSales;
    }
}
