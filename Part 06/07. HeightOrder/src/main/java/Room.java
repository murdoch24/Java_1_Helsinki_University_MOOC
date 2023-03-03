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

public class Room {
    
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        if (this.persons.size() == 0 || this.persons == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if (this.persons == null || this.persons.size() == 0){
            return null;
        }
        
        Person returnedPerson = persons.get(0);
        
        for (Person person : persons){
            if (person.getHeight() < returnedPerson.getHeight()){
                returnedPerson = person;
            }
        }
        
        return returnedPerson;
    }
    
    public Person take(){
        Person shortestPerson = this.shortest();
        
        if (persons.size() == 0){
            return null;
        }else{
            persons.remove(shortestPerson);
        }
        
        return shortestPerson;
    }
    
    
}
