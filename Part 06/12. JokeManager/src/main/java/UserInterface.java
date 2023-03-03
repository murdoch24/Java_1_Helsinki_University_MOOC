/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private JokeManager jokeManager;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }
    
    public void start(){
        
        while (true){
            this.printCommands();
            String userInput = scanner.nextLine();
            
            if (userInput.equals("X")){
                break;
            }
            
            processCommand(userInput);
        }
        
    }
    
    public void printCommands(){
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
    
    public void processCommand(String command){
        
        if ( command.equals("1")){
            this.add();
        }else if ( command.equals("2")){
            this.draw();
        }else if (command.equals("3")){
            this.list();
        }else{
            System.out.println("Unknown command");
        }
        
        
    }
    
    public void add(){
        System.out.println("Write the joke to be added: ");
        String userJoke = scanner.nextLine();
        
        jokeManager.addJoke(userJoke);

    }
    
    public void draw(){
        System.out.println(jokeManager.drawJoke());
    }
    
    public void list(){
        System.out.println("Printing the jokes.");
        jokeManager.printJokes();
    }
    
}
