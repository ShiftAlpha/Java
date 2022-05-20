package arrayclass;

import java.util.Arrays;

public class ArrayClass {
    
    
    public static void arraySort(int[] myArr) {
        
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 100);
        }
        
        Arrays.sort(myArr);
        
        System.out.println("Array sorting : \n" + Arrays.toString(myArr));
        
    }
    
   
    
    public static void arraySearch(int[] myArr, int number) {

        int result = Arrays.binarySearch(myArr, number);

        if (result < 0) {
            System.out.println("\nElement not found");
        } else {
            System.out.println("\nElement is found at index : " + result);
        }

    }
    
    
    
    public static void arraySubset(int [] myArr){
    
         int [] secondArray = Arrays.copyOfRange(myArr, 50 , myArr.length);
         
         // int [] ArrayName = Arrays.copyOfRange(myArr, firstIndex , lastIndex);
        
          System.out.println("\nSubset of original array from index 50 : " + Arrays.toString(secondArray));
          
    }
    
    
//    public static void arrayComparision(int [] myArr){
//    
//        Arrays.de
//    
//    }
    
    

    public static void main(String[] args) {
        
        int[] myArray = new int[100];

        
        
        arraySort(myArray);
                
        arraySearch(myArray, 6);  
        
        arraySubset(myArray);
        
        
        
    }

}
