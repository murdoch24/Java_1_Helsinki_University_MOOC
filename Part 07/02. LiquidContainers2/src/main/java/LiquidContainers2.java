
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            System.out.print("> ");

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
            }else if(command.equals("add")){
                first.add(amount);
            }else if (command.equals("move")){
                if (amount > first.contains()){
                    amount = first.contains();
                }
                
                first.remove(amount);
                second.add(amount);
            }else if (command.equals("remove")){
                second.remove(amount);
            }

        }
    }

}
