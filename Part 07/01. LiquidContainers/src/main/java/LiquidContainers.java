
import java.util.Scanner;

public class LiquidContainers {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;                
        int second = 0;      


        while (true) {
            

            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.println("> ");
            String input = scan.nextLine();
            
            String command = "";
            int amount = 0;
            
            if (input.contains(" ")){
                String[] parts = input.split(" ");     
                command = parts[0];
            
                amount = Integer.valueOf(parts[1]);
            }else{
                command = input;
                amount = 0;
            }


            if (command.equals("quit")) {
                break;
            }
            
            if (command.equals("add")){

                if (amount < 0){
                    first = first;
                }else if (amount + first > 100){
                    first = 100;
                }else{
        
                    first = amount + first;
                }
            }else if (command.equals("move")){
                if (amount < 0){
                    first = first;
                    second = second;
                }else if (amount > first){
                    
                    second = first + second;
                    first = 0;
                }else{
                    if (second + amount > 100){
                        second = 100;
                        first = first - amount;
                    }else{
                        first = first - amount;
                        second = second + amount;
                    }
                }
            }else if (command.equals("remove")){
                
                if (amount < 0){
                    first = first;
                    second = second;
                }else if (amount > second){
                    second = 0;
                }else{
                    second = second - amount; 
                }
                
                
            }

        }
    }


}
