
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        double average = 0;
        
        while (true){
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0){
                break;
            }else{
                sum = sum + userInput;
                count = count + 1;
            }
        }
        
        average = (double) sum / (double) count;
        System.out.println("Average of the numbers: " + average);

    }
}
