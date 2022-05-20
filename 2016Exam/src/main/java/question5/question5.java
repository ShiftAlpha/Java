package question5;

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
public class question5 {

    static String ussd = "*800";
    static String ussdInput = "";
    static int input;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("ENTER USSD CODE: ");

        ussdInput = sc.next();

        while (!ussdInput.contains(ussd)) {

            System.out.println("Enter the correct code: ");
            ussdInput = sc.next();
        }
        mainMenu();

    }

    public static void mainMenu() {

        System.out.println("\n1 - Balances"
                + "\n2 - Buy Data"
                + "\n3 - Buy Airtime"
                + "\n4 - Buy SMS"
                + "\n5 - Quit");
        input = sc.nextInt();

        switch (input) {
            case '1':
                balanceMenu();
                break;
            case '2':
                buyDataMenu();
                break;
            case '3':
                buyAirtimeMenu();
                break;
            case '4':
                buySMSMenu();
                break;
            case '5':
                exitProgram();
                break;

        }

    }

    public static void balanceMenu() {

        System.out.println("\n1 - Talk Balance"
                + "\n2 - Data Balance"
                + "\n3 - Quit");
        input = sc.nextInt();

        switch (input) {
            case '1':
                System.out.println("You have requested balance for: Talk Balance");
                break;
            case '2':
                System.out.println("You have requested balance for: Data Balance");
                break;
            case '3':
                exitProgram();
                break;

        }

    }

    public static void buyDataMenu() {

        System.out.println("\n1 - 500MB"
                + "\n2 - 1 GB"
                + "\n3 - Quit");
        input = sc.nextInt();

        switch (input) {
            case '1':
                System.out.println("You have purchased Data bundle for: 500MB");
                break;
            case '2':
                System.out.println("You have purchased Data bundle for: 1 GB");
                break;
            case '3':
                exitProgram();
                break;

        }
    }

    public static void buyAirtimeMenu() {
        System.out.println("\n1 - R20.00"
                + "\n2 - R40.00"
                + "\n3 - Quit");
        input = sc.nextInt();

        switch (input) {
            case '1':
                System.out.println("You have purchased Airtime for: R20.00");
                break;
            case '2':
                System.out.println("You have purchased Airtime for: R40.00");
                break;
            case '3':
                exitProgram();
                break;

        }
    }

    public static void buySMSMenu() {
        System.out.println("\n1 - 50 SMS Bundle"
                + "\n2 - 100 SMS Bundle"
                + "\n3 - Quit");
        input = sc.nextInt();

        switch (input) {
            case '1':
                System.out.println("You have purchased SMS bundle for: 50 SMS");
                break;
            case '2':
                System.out.println("You have purchased SMS bundle for: 100 SMS");
                break;
            case '3':
                exitProgram();
                break;

        }
    }

    public static void exitProgram() {

        sc.close();

    }

}
