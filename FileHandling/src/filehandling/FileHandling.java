package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        
        //objects being created of the phones
        Product p1 = new Product("Samsung", "Galaxy S10", 5, 11000, 14000);
        Product p2 = new Product("Iphone", "11", 6, 17000, 21000);
        Product p3 = new Product("Huawei", "P20", 6, 9000, 13000);
        Product p4 = new Product("Nokia", "Brick Phone", 100, 2000, 2500);
        

        File outFile = new File("data.txt");//creates and names the text file 
        
        FileWriter fWriter = new FileWriter(outFile);
        PrintWriter pWriter = new PrintWriter(fWriter);

        //Writes each object created and writes it to the text file 
        pWriter.println(p1.encode());
        pWriter.println(p2.encode());
        pWriter.println(p3.encode());
        pWriter.println(p4.encode());

        //closes the text writer
        pWriter.close();
        
        
        File inFile = new File("data.txt");

        Scanner sc = new Scanner(inFile);
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        
        sc.close();
        
        
//        String brand, description, quantity, cost, selling;
//        Scanner scan = new Scanner(inFile);
//        sc.useDelimiter("[|]");
//
//        // Check if there is another line of input
//        while (sc.hasNext()) {
//            brand = sc.next();
//            description = sc.next();
//            quantity = sc.next();
//            cost = sc.next();
//            selling = sc.next();
//            
//            
//            System.out.println("brand" + brand);
//        }
//        
//        sc.close();


    }

    }


