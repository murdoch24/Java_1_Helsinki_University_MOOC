
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String nameOfOldest = "";
        
        while (true){
            

            
            String userInput = scanner.nextLine();
            
            if (userInput.equals("")){
                break;
            }
            
            String[]list = userInput.split(",");
            
           if (Integer.valueOf(list[1]) >= oldest){
               oldest = Integer.valueOf(list[1]);
               nameOfOldest = list[0];
               
           }
                       
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest );


    }
}
