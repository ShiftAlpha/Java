package pkg2darrayhotel;

import java.text.DecimalFormat;

public class Main {

    static double[][] hotelPrices = {
        {1500, 1750, 2000, 3000, 4000},
        {1250, 1700, 2300, 2750, 3500},
        {1100, 1500, 2000, 2800, 3000}
    };

    static double total = 0;
    

    public static void display(double[][] hotelPrices) {

        for (int i = 0; i < hotelPrices.length; i++) {
            for (int j = 0; j < hotelPrices[i].length; j++) {
                System.out.print(hotelPrices[i][j] + "   ");
            }

            System.out.println();

        }

    }

    public static double total() {
       

        for (int i = 0; i < hotelPrices.length; i++) {
            for (int j = 0; j < hotelPrices[i].length; j++) {
                total += hotelPrices[i][j];
            }
        }
        
        
        return total;
        
    }
    
    public static double average(){
        
        double average = 0;
    
        average = total() / hotelPrices.length;
               
        return average;
        
    }
    
    public static int[] sumTableRows(double[][] hotelPrices) {
        int rows = hotelPrices.length;
        int cols = hotelPrices[0].length;

        int[] sum = new int[rows];
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                sum[x] += hotelPrices[x][y];
            }
        }
        return sum;
    }


    
    
    public static void main(String[] args) {

        display(hotelPrices);
        
        System.out.println("Total is : " + total());
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Average is : " + df.format(average()));
        
        
        int[] sumOfRows = sumTableRows(hotelPrices);
        for (int x = 0; x < hotelPrices.length; x++) {
            for (int y = 0; y < hotelPrices[x].length; y++) {
                System.out.print(hotelPrices[x][y] + "\t");
            }
            System.out.println("total: " + sumTableRows(hotelPrices)[x]);
        }
    }

        
        
    }


