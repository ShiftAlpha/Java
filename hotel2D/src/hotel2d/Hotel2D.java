/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel2d;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static javafx.beans.binding.Bindings.length;

/*
Questions
1. Store all values in a 2D array of double
2. Display
3. Full occupancy -> what is the income? 
4. Average of all rooms
5. Per floor income & average 

 {1500, 1750, 2000, 3000, 4000},
 {1250, 1700, 2300, 2750, 3500},
 {1100, 1800, 2000, 2800, 3000}
6. object aray consisting of room number rate accupied number of rooms

*/

//class
public class Hotel2D {

    //2D array - prepopulated
    static double[][] hotelPrices
            = {
                {1500, 1750, 2000, 3000, 4000},
                {1250, 1700, 2300, 2750, 3500},
                {1100, 1800, 2000, 2800, 3000}
            };

    static double total;
    static double average;
    static int c;

    //decimal format class
    static DecimalFormat df = new DecimalFormat("#.##");
    

    //main method
    public static void main(String[] args) {
        display();
        calcTotalAndAverage();
        perFloor(hotelPrices);
    }

    //display method
    public static void display() {
        for (int i = 0; i < hotelPrices.length; i++) {
            for (int j = 0; j < hotelPrices[i].length; j++) {
                System.out.print(hotelPrices[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }

    //calculate total and average
    public static double calcTotalAndAverage() {
        for (int i = 0; i < hotelPrices.length; i++) {
            for (int j = 0; j < hotelPrices[i].length; j++) {
                total += hotelPrices[i][j];
                c++;
            }
        }
        average = total / c;

        System.out.println("");
        System.out.println("Total: R" + total);
        System.out.println("Average: R" + df.format(total / c));
        return total;
    }

    //calculate total and average per floor
    public static void perFloor(double[][] arrayIn) {

        int count = 1;

        int rows = arrayIn.length;
        int col = arrayIn[0].length;

        for (int i = 0; i < rows; i++) {
            total = 0;
            for (int j = 0; j < col; j++) {
                total += arrayIn[i][j];
            }
            System.out.println("");
            System.out.println("Total floor " + count + ":" + " R" + total);
            System.out.println("Average floor " + count + ":" + " R" + total / col);
            count++;
        }
    }
    
    

}
