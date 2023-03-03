
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        
        int elementSize = this.elements.size();
        String printOutput = "";
        if (this.elements.isEmpty()){
            printOutput = "The collection " + this.name + " is empty.";
        }else if (this.elements.size()== 1){
            printOutput = "The collection " + this.name + " has " + 
                    this.elements.size() + " element:";    
        }else {
            printOutput = "The collection " + this.name + " has " + 
                    this.elements.size() + " elements:";          
        }
        String listOfElements = "";
        int i = 0;
        for (String element: elements){
            if (i == elements.size() -1){
                listOfElements = listOfElements + element;
            }else{
                listOfElements = listOfElements + element + "\n";
            }
        }
        
        if (this.elements.isEmpty()){
            return printOutput;
        }else{
            return printOutput + "\n" + listOfElements;
        }
    }
}
