
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number'
        
        System.out.println("Search for? ");
        int input = Integer.valueOf(scanner.nextLine());
        int index = -1;
        
        for (int i= 0; i <= list.size()-1; i++){
            if (input == list.get(i)){
                index = i;
                
            }
        if (index >= 0){
            System.out.println(input + " is at index " + index);   
        }
        
        }
          
    }

}

