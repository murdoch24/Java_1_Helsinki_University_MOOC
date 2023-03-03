
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        boolean shouldContinue = true;
        
        while(shouldContinue){
            String userInput = scanner.nextLine();
            String[] pieces = userInput.split(" ");
            
            if (userInput.equals("")){
                break;
            }
            for( int i = 0; i < pieces.length; i++){
                System.out.println(pieces[i]);
            }
        }

        
        



    }
}
