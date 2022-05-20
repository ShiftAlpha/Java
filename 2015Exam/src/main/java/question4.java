
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class question4 {

    static double chickMaySand = 32.95;
    static double viennaChips = 29.95;
    static double tunaTram = 30.95;

    static int input = 0;
    static int quit = 0;

    static double total = 0;

    public static void main(String[] args) {

        input = Integer.parseInt(JOptionPane.showInputDialog("(1) Chicken May Sandwich " + chickMaySand
                + "\n(2) Vienna and Chips " + viennaChips
                + "\n(3) Tuna Tramezini " + tunaTram));

        getInput(input);

    }

    public static void getInput(int input) {

        
        
        while (input != quit) {
            input = Integer.parseInt(JOptionPane.showInputDialog("(1) Chicken May Sandwich " + chickMaySand
                    + "\n(2) Vienna and Chips " + viennaChips
                    + "\n(3) Tuna Tramezini " + tunaTram));
            getPrice(input);

        }
        JOptionPane.showMessageDialog(null, "Your total order comes to R" + total);

    }

    public static void getPrice(int input) {

        switch (input) {
            case '1':
                total = total + chickMaySand;
                break;
            case '2':
                total = total + viennaChips;
                break;
            case '3':
                total = total + tunaTram;
                System.out.println(total);

                break;
            /*case '0':
                //JOptionPane.showMessageDialog(null, "Your total order comes to R" + total);
                printDetails(total);

                break;*/
        }

    }

    public static void printDetails(double total) {
        
        

    }

}
