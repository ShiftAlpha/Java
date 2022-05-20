
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 16012775
 */
public class q2 {

    static double input = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a value");
            input = Double.parseDouble(sc.next());

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(input);
            System.exit(0);
        }
        System.out.println(input);

    }

}
