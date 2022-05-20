/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ranad
 */
public class Question1 {

    static String[] arrArtistName = {"Ed Sheeran", "Pink", "Bruno Mars", "Foo Fighters", "Taylor Swift"};
    static String[] arrSalesType = {"CD SALES", "DVD SALES", "BLU RAY SALES"};
    static int[][] arrSales = {
        {900000, 800000, 500000},
        {700000, 500000, 500000},
        {800000, 100000, 50000},
        {100000, 200000, 200000},
        {300000, 100000, 50000},};

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a position (between 1 and 5) to view the artist's CD, DVD, and Blu Ray Sales for 2017:");
        int position = sc.nextInt();
        int total = 0;

        switch (position) {
            case 1:
                System.out.println(arrArtistName[0] + " was in position " + position + " for 2017 sales:");
                for (int i = 0; i < arrSales[i].length; i++) {
                    System.out.println(arrSalesType[i] + ": " + arrSales[0][i]);
                    total+=arrSales[0][i];
                }
                System.out.println("TOTAL: " + total);
                break;
            case 2:
                System.out.println(arrArtistName[1] + " was in position " + position + " for 2017 sales:");
                for (int i = 0; i < arrSales[i].length; i++) {
                    System.out.println(arrSalesType[i] + ": " + arrSales[1][i]);
                    total+=arrSales[1][i];
                }
                System.out.println("TOTAL: " + total);
                break;
            case 3:
                System.out.println(arrArtistName[2] + " was in position " + position + " for 2017 sales:");
                for (int i = 0; i < arrSales[i].length; i++) {
                    System.out.println(arrSalesType[i] + ": " + arrSales[2][i]);
                    total+=arrSales[2][i];
                }
                System.out.println("TOTAL: " + total);
                break;
            case 4:
                System.out.println(arrArtistName[3] + " was in position " + position + " for 2017 sales:");
                for (int i = 0; i < arrSales[i].length; i++) {
                    System.out.println(arrSalesType[i] + ": " + arrSales[3][i]);
                    total+=arrSales[3][i];
                }
                System.out.println("TOTAL: " + total);
                break;
            case 5:
                System.out.println(arrArtistName[4] + " was in position " + position + " for 2017 sales:");
                for (int i = 0; i < arrSales[i].length; i++) {
                    System.out.println(arrSalesType[i] + ": " + arrSales[4][i]);
                    total+=arrSales[4][i];
                }
                System.out.println("TOTAL: " + total);
                break;
        }
    }

}
