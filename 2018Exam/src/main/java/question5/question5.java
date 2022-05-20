/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class question5 {

    static int[] deviceID = new int[3];
    static String[] deviceName = new String[3];
    static double[] devicePrice = new double[3];

    public static void main(String[] args) {

        int option = Integer.parseInt(JOptionPane.showInputDialog("Enter (1) to add devices."
                + "\nEnter (2) to search for device details."
                + "\nEnter (3) to display all the device details."
                + "\nEnter (0) to exit."));
        while (option != 0) {
            switch (option) {

                case '1':
                    loadArray();
                    break;
                case '2':
                    searchArray();
                    break;
                case '3':
                    break;
                case '0':
                    break;
            }
        }

    }

    public static void loadArray() {
        
            deviceID[0] = Integer.parseInt(JOptionPane.showInputDialog("Please enter the ID for Device 1"));
            deviceName[0] = JOptionPane.showInputDialog("Please enter the name for Device " + deviceID);
            devicePrice[0] = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price for Device " + deviceID));
        

    }

    public static void searchArray() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Device ID"));
        for (int i = 0; i < deviceID.length; i++) {
            
        }
    }

}
