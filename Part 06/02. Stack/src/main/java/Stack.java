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

public class Stack {
    
    private ArrayList<String> strings;
    
    public Stack(){
        this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        
        if (strings == null || strings.size()==0){
            return true;
        } else{
            return false;
        }            
    }
    
    public void add(String value){
        strings.add(value);
    }
    
    public ArrayList<String> values(){
        return this.strings;
    }
    
    public String take(){
        int index = strings.size() - 1;
        String removedString = strings.get(index);
        strings.remove(index);
        
        return removedString;
    }
    
}
