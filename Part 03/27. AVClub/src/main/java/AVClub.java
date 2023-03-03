
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String userInput = scanner.nextLine();
            
            if (userInput.equals("")){
                break;
            }
            
            String[] pieces = userInput.split(" ");
            
            for (String piece : pieces){
                if (piece.contains("av")){
                    System.out.println(piece);
                }
            }
        }


    }
}
