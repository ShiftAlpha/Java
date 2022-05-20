/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingintarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 16012775
 */
public class SortingIntArrays {
    
    static int[] numbers = {3, 5, 7, 2, 10};
    static String[] stringArray = {"mo", "ebi", "zahra", "dhirav", "raihaan"};
    static int temp;
    
    public static void printDetails(int[] arrayIn) {
        for (int i : arrayIn) {
            System.out.print(i);
        }
    }
    
    public static int[] bubbleSort() {
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    printDetails(numbers);
                }
            }
        }
        return numbers;
    }
    
    public static int[] insertionSort() {
        
        int a = 1;
        int b;
        
        while (a < numbers.length) {
            temp = numbers[a];
            b = a - 1;
            while (b <= 0 && numbers[b] > temp) {
                numbers[b + 1] = numbers[b];
                --b;
            }
            numbers[b + 1] = temp;
            ++a;
        }
        return numbers;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ans;
        System.out.println("");
        System.out.println("(1)Bubble sort or \n(2)Insetion sort or 3 for sorting names");
        ans = sc.nextInt();
        if (ans == 1) {
            //printDetails(bubbleSort());
            bubbleSort();
        } else if (ans == 2) {
            printDetails(insertionSort());
        } else if (ans == 3) {
            friends(stringArray);
        }
        
    }
    
    public static void friends(String[] Names) {
        Arrays.sort(Names);
        System.out.println(Arrays.toString(Names));
    }
    
}
