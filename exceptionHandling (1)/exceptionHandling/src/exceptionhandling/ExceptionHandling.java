/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionHandling {

    public static void main(String[] args) {

        // Java program to demonstrate how exception is thrown. 
        //exception 
        //1
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //2 - array out of bounds
        try {
            String[] names = new String[3];
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error cannot find element at index " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the app");
        }

        //3 - arithmetic
        try {
            int num = 5;
            System.out.println(num / 0);
        } catch (ArithmeticException e) {

            System.out.println("Number cannot be " + e.getMessage());
        }

        //read from file exception
        try {
            Scanner sc = new Scanner(new FileReader("gdg.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("Cannot find file" + ex.getMessage());
        }

        
        //write to file exception
        String directory = System.getProperty("user.home");
        String fileName = "sample.txt";
        String absolutePath = directory + File.separator + fileName;

// write the content in file 
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {
            String fileContent = "This is a sample text.";
            bufferedWriter.write(fileContent);
        } catch (IOException e) {
            System.out.println("Cannot write to text file: "+e.getMessage());
        }
        
//input mismatch
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
