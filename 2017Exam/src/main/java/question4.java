
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
public class question4 {

    static int count1 = 0;
    static int count3 = 0;
    static int count2 = 0;

    static int input;

    public static void main(String[] args) {

        getInput();
    }

    public static void getInput() {

        int c = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a 1,2 or 3 for the winning player:"
                + "\n(1)Novak Djokovic"
                + "\n(2)Andy Murray"
                + "\n(3)Roger Federer");

        System.out.println("Enter the player number who won match " + c + ": ");

        input = sc.nextInt();
        incrementGames(input);

        while (input != 0) {
            if (input == 1 || input == 3 || input == 2) {
                incrementGames(input);
                System.out.println("Enter the player number who won match " + (c += 1) + ": ");
                input = sc.nextInt();
            } else {
                System.out.println("You have entered an invalid selection. \nPlease enter a selection from 1-3.");
                input = sc.nextInt();

                incrementGames(input);
            }

        }incrementGames(input);

    }

    public static void incrementGames(int input) {

        switch (input) {
            case '1':
                count1++;
                break;
            case '2':
                count2++;
                break;
            case '3':
                count3++;
                break;
            case '0':
                System.out.println("\n(1)Novak Djokovic: " + count1
                        + "\n(2)Andy Murray:    " + count2
                        + "\n(3)Roger Federer:  " + count3);
                break;
        }

    }

}
