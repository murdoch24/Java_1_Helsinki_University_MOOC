
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        BirdManager birdManager = new BirdManager(scan);
        
        while (true){
            System.out.println("?");
            String userCommand = scan.nextLine();
            
            switch (userCommand){
                case "Add":
                    birdManager.addBird();
                    break;
                case "Observation":
                    birdManager.addObservation();
                    break;
                case "All":
                    birdManager.printAll();
                    break;
                case "One":
                    birdManager.printOne();
                    break;
                case "Quit":
                    return;
                default:
                    System.out.println("Unknown command");
                    
                    
                    
            }
        }

    }

}
