package sortingarrays;

public class SortingArrays {
    
    static int[] arrayInt = {6, 9, 4, 2, 3 ,12 ,4 ,6 , 3, 15};
    static String [] arrayString = {"North", "South", "East", "West"};
    
    
    public static void printArray(int[] arrayIn) {
        
        for (int i : arrayIn) {
            System.out.println(i);
        }
        
    }
    
    public static int[] bubbleSort() {
        
        for (int i = 0; i < arrayInt.length - 1; i++) {
            for (int j = 0; j < arrayInt.length - 1; j++) {
                if (arrayInt[j] > arrayInt[j + 1]) {
                   int temp = arrayInt[j];
                    arrayInt[j] = arrayInt[j + 1];
                    arrayInt[j + 1] = temp;                    
                }
            }            
        }
        
        return arrayInt;
    }
    
    
    public static int[] insertionSort() {

        int a = 1;
        int b = 0;
        while (a < arrayInt.length) {
           int temp = arrayInt[a];
            b = a - 1;
            while (b >= 0 && arrayInt[b] > temp) {
                arrayInt[b + 1] = arrayInt[b];
                b--;
            }
            arrayInt[b + 1] = temp;
            a++;
        }
        return arrayInt;

    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Bubble Sort");
        printArray(bubbleSort());
        
        System.out.println("Insertion Sort");
        printArray(insertionSort());
        
        
        
    }
}
