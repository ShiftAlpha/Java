
package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ExceptionHandling {


    public static void main(String[] args) {

        //Example of pieces of codes that throws out an exception 
       
        try {
            String name = null;
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

        
        try {
            String[] names = new String[3];
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error cannot find element at index " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the app\n");
        }
        
        
        try {
            int number = 7;
            System.out.println(number / 0);
        } catch (ArithmeticException e) {
           System.out.println("Number cannot be " + e.getMessage() + "\n");

        } 
        
        

        try {
            Scanner scan = new Scanner(new FileReader("File 1.txt"));
            System.out.println(scan);
        } catch (Exception e) {
            System.out.println(e);
        }
       
        
       
        Scanner input = new Scanner(System.in);

        int numerator = 0;
        int denomi = 0;
        double fraction = 0;

        try {
            System.out.print("\nEnter numerator >> ");
            numerator = input.nextInt();

            System.out.print("Enter denominator >> ");
            denomi = input.nextInt();

            fraction = numerator / denomi;
            System.out.println("Answer " + fraction);
            
        } catch (ArithmeticException e) {
            System.out.println("Error ");
        } catch (InputMismatchException e) {
            System.out.println("Not a number ");
        }
        
        

    }

}
