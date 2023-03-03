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
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke (String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        if (jokes == null || jokes.size() == 0){
            return "Jokes are in short supply.";
        }else{
            Random rand = new Random();
            
            int randItem = rand.nextInt(jokes.size());
            
            return jokes.get(randItem);
               
        }
    }
    
    public void printJokes(){
        for (String joke : jokes){
            System.out.println(joke);
        }
    }
    
}
