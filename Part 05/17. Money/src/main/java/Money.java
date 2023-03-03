
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        
        int newEuros = addition.euros + this.euros;
        int newCents = addition.cents + this.cents;
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
        
    }
    
    public boolean lessThan(Money compared){
        
        if(this.euros < compared.euros){
            return true;
            
        } else if(this.euros == compared.euros){
            if(this.cents< compared.cents){
                return true;
            }else{
                return false;
            }   
        }else{
            return false;
        }
        
    }
    
    public Money minus(Money decreaser){
        
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
        
        if (this.cents == 0){
            
            newCents = 100 - decreaser.cents;
            newEuros --;
        } else if ( this.cents < decreaser.cents){
            newCents = 100 + this.cents - decreaser.cents;
            newEuros --;
        }else{
            newCents = this.cents - decreaser.cents;
        }
        
        /*if (newCents < 0){
            newCents = newCents * -1;
            newEuros --;
            
        }
        */
        if (newEuros < 0){
            newEuros = 0;
            newCents = 0;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }    

}
