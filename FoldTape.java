import java.util.ArrayList;
import java.util.Scanner;

public class FoldTape { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the tape");
        int length = sc.nextInt(); 

        System.out.println("Enter the times the tape will be folded.");
        int k = sc.nextInt(); 
        
        // Create an ArrayList to hold the tape elements
        ArrayList<Integer> tape = new ArrayList<>();

        System.out.println("Enter the elements of the tape.");
        // Read the tape elements into an ArrayList
        for (int i = 0; i < length; i++) {
            tape.add(sc.nextInt());
        }
        
        // Perform K folds on the tape
        for (int fold = 0; fold < k; fold++) {
            int mid = tape.size() / 2;
            ArrayList<Integer> nextTape = new ArrayList<>();
            
            // Fold the tape by summing the corresponding elements from both halves
            for (int i = 0; i < mid; i++) {
                int leftElement = tape.get(mid - 1 - i); 
                int rightElement = tape.get(mid + i);    
                nextTape.add(leftElement + rightElement);
            }
            tape = nextTape;
        }
        
        // Print the final tape elements
        for (int i = 0; i < tape.size(); i++) {
            System.out.print(tape.get(i));
            if (i < tape.size() - 1) { // Avoid printing a space after the last element-1
                System.out.print(" ");
            }
        }

        System.out.println(); 
        
        sc.close();
    }
}