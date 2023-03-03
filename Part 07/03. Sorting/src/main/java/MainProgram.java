import java.util.Arrays;
        
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        
        MainProgram.sort(numbers);

    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int number : array){
            if (number < smallest){
                smallest = number;
            }
        }
        return smallest;   
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = smallest(array);
        
        if (array == null){
            return -1;
            
        }
        
        int length = array.length;
        int i = 0;
        
        while (i < length){
            if (array[i] == smallest){
                return i;
            }
            else {
                i ++;
            }
        }
        return -1;
        
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex];
        int length = table.length;
        int smallestIndex = startIndex; //the index holding the smallest val
        
        for (int i= startIndex; i < length; i++){
            if (table[i] < smallest){
                smallest = table[i];
                smallestIndex=i;
            }
        }
        
        return smallestIndex;
    }

    
    public static void swap(int[] array, int index1, int index2){
        int first = array[index1];
        int second = array[index2];
        
        array[index1] = second;
        array[index2] = first;
    }
    
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            int indexSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexSmallest);
            System.out.println(Arrays.toString(array));
            
        }
    }
     
}
