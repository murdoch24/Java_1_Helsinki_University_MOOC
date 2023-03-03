
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        String longestName = "";
        int nameLength = 0;
        
        while (true){
            
            String userInput = scanner.nextLine();
            
            if (userInput.equals("")){
                break;
            }
            
            String[] list = userInput.split(",");
            
            if (list[0].length() > nameLength){
                nameLength = list[0].length();
                longestName = list[0];
            }
            
            sum = sum + Integer.valueOf(list[1]);
            count ++;
            
            
            
            
        }
        
        System.out.println("Longest name: " + longestName);
        
        System.out.println("Average of the birth years: " 
                + (double) sum / (double) count);


    }
}
