
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

    static int leftHand = 0;
    static int rightHand = 0;

    static char quit = 'X';

    static String input = "";
    static char letter;

    public static void main(String[] args) {

        getInput(letter);

    }

    public static void getInput(char letter) {

        JOptionPane.showMessageDialog(null, "WELCOME TO THE STUDENT HAND SIDE PROGRAME\n\nEnter L for left-handed\nEnter R for right-handed\nEnter X to QUIT");
        while (letter != 'X') {
            input = JOptionPane.showInputDialog("Enter an L if you are left-handed,R if your are right-handed or X to quit");
            letter = input.charAt(0);
            totalHands(letter);

        }

    }
    
    public static void totalHands(char letter){
        
        switch (letter) {
                case 'L':
                    leftHand++;
                    break;
                case 'R':
                    rightHand++;
                    break;
                case 'X':
                    JOptionPane.showMessageDialog(null, "Number of left-handed students: " + leftHand
                            + "\nNumber of right-handed students: " + rightHand);
                    break;
            }
    }

}
