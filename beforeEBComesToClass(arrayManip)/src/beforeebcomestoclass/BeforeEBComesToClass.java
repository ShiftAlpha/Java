/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforeebcomestoclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author 16012775
 * Todays lesson was :/ but check it out
 */
public class BeforeEBComesToClass {

    static int[] testArr = new int[100];

    static int highest;
    static int lowest;
    static int average;
    static int length;
    static int sum;

    public static void main(String[] args) {

        /*System.out.println("");
        System.out.println("Highest: " + getHighest(testArr));
        System.out.println("Lowest: " + getLowest(testArr));
        System.out.println("Length: " + getlength(testArr));
        System.out.println("Average: " + getHighest(testArr));
        System.out.println("Highest With Collection: " + getHighestWithCollections(testArr));
        System.out.println("Highest With Collection: " + getLowestWithCollections(testArr));
        System.out.println("Integer Array as List: "
                           + Arrays.asList(testArr)); */
        //displayArray();
        
        arraySort(testArr);
        arraySearch(testArr, 6);
        arraySubset(testArr);

    }
    //display array

    public static void displayArray() {
        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = (int) (Math.random() * 100);
            System.out.print(testArr[i] + " ");

        }
    }

    //Array Sort
    public static void arraySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        System.out.println("Array sorting: \n" + Arrays.toString(arr));
    }

    //Array search
    public static void arraySearch(int[] arr, int number) {
        int result = Arrays.binarySearch(arr, number);

        if (result < 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at index: " + result);
        }
    }

    //Array Subset
    public static void arraySubset(int[] arr) {
        int[] secondArray = Arrays.copyOfRange(arr, 50, arr.length);

        System.out.println("Subset of original array from index 50 : " + Arrays.toString(secondArray));
    }
    
    //get Highest old method
    public static int getHighest(int[] arr) {
        highest = testArr[0];
        for (int i = 0; i < testArr.length; i++) {
            if (testArr[i] > highest) {
                highest = testArr[i];
            }
        }
        return highest;
    }

    //get Lowest old method
    public static int getLowest(int[] arr) {
        lowest = testArr[0];
        for (int i = 0; i < testArr.length; i++) {
            if (testArr[i] < lowest) {
                lowest = testArr[i];
            }
        }
        return lowest;
    }

    //collection Highest
    public static int getHighestWithCollections(int[] arr) {
        int min = Collections.max(Arrays.asList());
        return min;
    }

    //collection Lowest
    public static int getLowestWithCollections(int[] arr) {
        int low = Collections.min(Arrays.asList());
        return low;
    }

    //get Length
    public static int getlength(int[] arr) {
        for (int i = 0; i < testArr.length; i++) {
            length++;
        }
        return length;
    }

    //get Average
    public static int getAverage(int[] arr) {
        for (int i = 0; i < testArr.length; i++) {
            sum += testArr[i];
        }
        average = sum / length;
        return average;
    }

}
