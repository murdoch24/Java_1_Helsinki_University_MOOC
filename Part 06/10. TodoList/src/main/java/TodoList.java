/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todo;
    
    
    
    public TodoList (){
        this.todo = new ArrayList<>();
    }
    
    public void print(){      
        for (String item : todo){
            System.out.println(todo.indexOf(item) + 1 + ": " + item); 
        }       
    }
    
    public void add(String task){
        
        this.todo.add(task);
        
    }
    
    public void remove(int number){
        
        this.todo.remove(number-1);
        
    }
    
}
