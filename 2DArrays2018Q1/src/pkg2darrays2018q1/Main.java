package pkg2darrays2018q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> artists = new ArrayList();

        artists.add("Ed Sheeran");
        artists.add("Pink \t");
        artists.add("Bruno Mars");
        artists.add("Foo Fighters");
        artists.add("Taylor swift");
        
        int[][] cdSales = {
            {900000, 800000, 500000},
            {700000, 500000, 500000},
            {800000, 100000, 50000},
            {100000, 200000, 200000},
            {300000, 100000, 50000}

        };                    // this is how u declare & initialize 2D arrays 
//        for (int r = 0; r < 5; r++) {                       // this loop runs for the ROWS      0 1 2 3 4   = 5 rows
//            for (int c = 0; c < 3; c++) {                   // this loop runs for the COLUMNS   0 2 3       = 3 columns
//                System.out.println("please enter cd sales");
//                cdSales[r][c] = sc.nextInt();               //   int[][] cdSales = new int[5][3]; -> dynamic input
//                sc.nextLine();
//            }
//        }A
        System.out.println("Artist Name\t\tCD Sales\tDVD Sales\tBLU RAY Sales ");
        for (int r = 0; r < 5; r++) {
            System.out.print(artists.get(r) + "\t\t");
            for (int c = 0; c < 3; c++) {
                System.out.print(cdSales[r][c] + "\t\t");
            }

            System.out.println("");

        }
        int choice;
        System.out.println("please insert a position (between 1 - 5) to view artists cd, dvd and blue ray sales for 2017: ");
        System.out.println("***************************************************************************************************");
        choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.println(artists.get(0) + " has taken position " + choice + " for 2017 sales ");

            System.out.println("CD SALES: \t R " + cdSales[0][0]);
            System.out.println("DVD SALES: \t R " + cdSales[0][1]);
            System.out.println("BLU RAY SALES: \t R " + cdSales[0][2]);
        } else if (choice == 2) {

            System.out.println(artists.get(1) + " has taken position " + choice + " for 2017 sales ");

            System.out.println("CD SALES: \t R " + cdSales[1][0]);
            System.out.println("DVD SALES: \t R " + cdSales[1][1]);
            System.out.println("BLU RAY SALES: \t R " + cdSales[1][2]);
        } else if (choice == 3) {

            System.out.println(artists.get(2) + " has taken position " + choice + " for 2017 sales ");

            System.out.println("CD SALES: \t R " + cdSales[2][0]);
            System.out.println("DVD SALES: \t R " + cdSales[2][1]);
            System.out.println("BLU RAY SALES: \t R " + cdSales[2][2]);
        } else if (choice == 4) {

            System.out.println(artists.get(3) + " has taken position " + choice + " for 2017 sales ");

            System.out.println("CD SALES: \t R " + cdSales[3][0]);
            System.out.println("DVD SALES: \t R " + cdSales[3][1]);
            System.out.println("BLU RAY SALES: \t R " + cdSales[3][2]);
        } else if (choice == 5) {

            System.out.println(artists.get(4) + " has taken position " + choice + " for 2017 sales ");

            System.out.println("CD SALES: \t R " + cdSales[4][0]);
            System.out.println("DVD SALES: \t R " + cdSales[4][1]);
            System.out.println("BLU RAY SALES: \t R " + cdSales[4][2]);
        } else {
            System.out.println("you have entered an incorrect input");
        }

        System.out.println("");

    }

}
