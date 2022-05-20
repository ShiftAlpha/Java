
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 16012775
 */
public class conversion {

    public static void main(String[] args) throws Exception {

        String kilometers = "-1";
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter kilometers:");
        boolean done = false;

        /* do {
            try {
                kilometers = in.next();
                if (Double.parseDouble(kilometers) < 0) {
                    System.out.println("Please enter a non-negative number");

                }
                double miles = Double.parseDouble(kilometers) / 1.6;
                System.out.println(miles + " Miles");

            } catch (java.util.InputMismatchException e) {

                done = true;
                System.out.println("Error: App continues" + e.getMessage());
                System.out.println("Please enter the numeric value ");
                double newVal = in.nextDouble();
                double miles = Double.parseDouble(kilometers) / 1.6;

                System.out.println(miles + " Miles");
            }
        } while (done == true);
         */
        DecimalFormat df = new DecimalFormat("#.##");

        while (!done) {
            try {
                double k = 0;
                double mph = 0.621371;

                System.out.println("Please enter a value");
                k = Double.parseDouble(in.nextLine());

                System.out.println(df.format(mph * k));

                done = true;
            } catch (NumberFormatException e) {
                System.out.println("Not numeric, try again");
            }

        }

    }
}
