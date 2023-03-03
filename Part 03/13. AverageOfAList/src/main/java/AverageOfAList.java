
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> list = new ArrayList();
        
        
        
        while (true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1){
                break;
            }
            
            list.add(userInput);
        }
        
        
        
        // calculate the sum of the list
        
        int sum = 0;
        int count = 0;
        
        for (Integer number: list ){
            sum = sum + number;
            System.out.println(sum);
            count ++;
        }
        
        double average = (double) sum / (double) count;
        
        System.out.println("Average: " + average);
        
    }
}
