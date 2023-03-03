
import java.util.ArrayList;


public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        
        int[] arr = {1,2,3,4,5};
        
        ArrayList<Integer> sums = new ArrayList<>();
        
        int sum = 0;
        for (int number : arr){
            sum = number + sum;
        }
        
        System.out.println(sum);
                
                
        
        
        

    }
}
