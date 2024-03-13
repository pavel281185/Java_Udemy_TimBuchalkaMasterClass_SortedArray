import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {
    
    public static int[] getIntegers(int number){
        int[] arrayToSort = new int[number];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < number; i++){
            arrayToSort[i] = sc.nextInt();
        }
        return arrayToSort;
    }
    
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    
    public static int[] sortIntegers(int[] array){
        Arrays.sort(array);
        int[] newArray = new int[array.length];
        int positionInNewArray = array.length - 1;
        for(int number : array){
            newArray[positionInNewArray] = number;
            positionInNewArray -= 1;
        }
        return newArray;
    }
}
    
 
