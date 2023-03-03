/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Item {
    
    private String identifier;
    private String name;
    
    public Item(String idCode,String name){
        this.identifier = idCode;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object compared){
        
        // Check if compared is in same location as this item 
        if (this == compared){
            return true;
        }
        
        // check if compared is actually an item object
        if (!(compared instanceof Item)){
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        return (this.identifier.equals(comparedItem.identifier));
            

    }
    
    
}
