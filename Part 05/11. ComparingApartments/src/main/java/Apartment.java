
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares ){
            return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int thisPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        
        int priceDifference = thisPrice - comparedPrice;
        
        if (priceDifference < 0){
            return priceDifference * -1;
        }else{
            return priceDifference;
        }
        
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int thisPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        
        if (thisPrice > comparedPrice){
            return true;
        }else{
            return false;
        }
    }

}
