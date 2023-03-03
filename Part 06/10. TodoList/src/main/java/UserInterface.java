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
    private TodoList todoList;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.todoList = list;
    }
    
    public void start(){
        while (true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            
            processCommand(input);
            
        }
        
        System.out.println("Bye bye!");
    }
    
    public void processCommand(String command){
        if (command.equals("add")){
            add();
        }else if(command.equals("list")){
            list();
        }else if (command.equals("remove")){
            remove();
        }else {
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        System.out.println("To add: ");
        String toAdd = this.scanner.nextLine();
        
        this.todoList.add(toAdd);
    }
    
    public void list(){
        
        this.todoList.print();
        
    }
    
    public void remove(){
        System.out.println("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(number);
        
    }
    
}
