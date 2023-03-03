
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Item> items = new ArrayList<>();
        
        boolean itemFound = false;
        
        while (true){
            
            System.out.println("Identifier? (empty will stop)");
            String idCode = scanner.nextLine();
            
            if (idCode.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()){
                break;
            }
            
            Item newItem = new Item(idCode, name);
            
            for (Item item : items){
                if (newItem.equals(item)){
                    itemFound = true;
                }else{
                    itemFound = false;
                }
            }
            
            if (!(itemFound)){
                items.add(newItem);
            }
            
            
            
                      
        }
        
        for (Item item : items){
            System.out.println(item);
        }


    }
}
