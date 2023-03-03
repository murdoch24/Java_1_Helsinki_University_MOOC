import java.util.Scanner;
import java.util.ArrayList;

public class BirdManager {
    
    private ArrayList<Bird> birdList;
    private Scanner scanner;
    
    public BirdManager(Scanner scanner){
        this.birdList = new ArrayList<>();
        this.scanner = scanner;
    }
    
 
    public void addObservation(){
        
        System.out.println("Bird?");
        String birdObserved = scanner.nextLine();
        
        if (birdList.isEmpty()){
            System.out.println("No birds to be found!");
        }
        
        boolean birdFound = false;
        
        for (Bird bird: birdList){
            if(bird.getName().contains(birdObserved)){
                bird.addObservation();
                birdFound = true;
                break;
            }

                
        }
        
        if (!birdFound){
            System.out.println("Not a bird");
        }
        
    }
    
    public void printAll(){
        for (Bird bird: birdList){
            System.out.println(bird);
        }
    }
    
    public void printOne(){
        System.out.println("Bird?");
        
        String birdToPrint = scanner.nextLine();
        
        if (birdList.isEmpty()){
            System.out.println("Not a bird!");
        }
        
        for (Bird bird: birdList){
            if (bird.getName().equals(birdToPrint)){
                System.out.println(bird);
                break;
            }else{
                System.out.println("Not a bird!");
            }
       
        }
 
    }
    
    public void addBird(){
 
        System.out.println("Name: ");
        String birdName = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = scanner.nextLine();
        
        Bird bird = new Bird(birdName, latinName);
        this.birdList.add(bird);
        
    }
    
}
