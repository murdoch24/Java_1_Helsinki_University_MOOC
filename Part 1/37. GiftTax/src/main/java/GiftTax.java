
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        int tax = 0;
        double taxRate = 0;
        double taxDue = 0;
        
        if (giftValue <= 4999){
            System.out.println("No tax!");
        }else if (giftValue >= 5000 && giftValue <= 24999){
            tax = 100;
            taxRate = 0.08;
            taxDue = tax + (giftValue - 5000) * taxRate;
            System.out.println(taxDue);    
        }else if (giftValue >= 25000 && giftValue <= 54999){
            tax = 1700;
            taxRate = 0.1;
            taxDue = tax + (giftValue - 25000) * taxRate;
            System.out.println(taxDue);            
        }else if (giftValue >= 55000 && giftValue <= 199999){
            tax = 4700;
            taxRate = 0.12;
            taxDue = tax + (giftValue - 55000) * taxRate;
            System.out.println(taxDue);
        }else if (giftValue >= 200000 && giftValue <= 999999){
            tax = 22100;
            taxRate = 0.15;
            taxDue = tax + (giftValue - 200000) * taxRate;
            System.out.println(taxDue);            
        }else if (giftValue >= 1000000){
            tax = 142100;
            taxRate = 0.17;
            taxDue = tax + (giftValue - 1000000) * taxRate;
            System.out.println(taxDue);
        }

    }
}
