
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList();
        
        while (true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 9999){
                break;
            }
            
            list.add(userInput);
        }
               
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        int smallest = list.get(0);
        
        // Find smallest number in list
        for (int i = 0; i <= list.size()-1; i++){
            if (list.get(i) <= smallest){
                smallest = list.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        // Find which index/indices the smallest number appears at in the list
        
        int index = -1;
        
        for (int i=0; i <= list.size()-1; i++){
            if (smallest == list.get(i)){
                index = i;
            }
            
        if (index >= 0){
            System.out.println("Found at index: " + index);
        }
    }
        
        
       
        
        

        
    }
}