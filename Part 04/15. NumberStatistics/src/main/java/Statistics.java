
public class Statistics {
    
    private int count;
    private int total;
   
    
    public Statistics(){
        this.count = 0;
        this.total = 0;
    
    }
    
    public void addNumber(int number){
        this.count ++;
        this.total = this.total + number;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.total;
    }
    
    public double average(){
        if (this.total == 0){
            return 0.0;
        }else{
            return (double) this.total / (double) this.count;
        }
    }
}
