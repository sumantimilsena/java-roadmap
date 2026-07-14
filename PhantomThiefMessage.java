import java.util.Scanner;

public class PhantomThiefMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read the entire line of input
        
        String numberString = "";// To collect digits for multi-digit numbers
        
        for (int i = 0; i < input.length(); i++) {// Iterate through each character in the input
            char c = input.charAt(i);// Get the current character
            
            //Collect numbers if the character is a digit
            if (c >= '0' && c <= '9') { 
                numberString += c; // Append digit to numberString
            } else {
                //If we have collected a number, print it incremented by 1
                if (numberString.length() > 0) {// Check if we have collected any digits
                    int num = Integer.parseInt(numberString);
                    System.out.print(num + 1);// Print the incremented number
                    numberString = ""; // Reset numberString for the next potential number
                }
                
                // Increment letters: A->B, B->C, ..., Z->A
                if (c >= 'A' && c <= 'Z') {
                    if (c == 'Z') {
                        System.out.print('A'); 
                    } else {
                        System.out.print((char)(c + 1));
                    }
                } 
                // Increment letters:(For Lower caase) a->b, b->c, ..., z->a
                else if (c >= 'a' && c <= 'z') {
                    if (c == 'z') {
                        System.out.print('A');//change to uppercase A if the letter is z
                    } else {
                        System.out.print(Character.toUpperCase((char)(c + 1))); // Increment and convert to uppercase
                    }
                } 
                else {
                    System.out.print(c); // Keep other characters as they are
                }
            }
        }
        
        // Final check: print any remaining number at the very end
        if (numberString.length() > 0) {
            int num = Integer.parseInt(numberString);
            System.out.print(num + 1);
        }
//        System.out.println();    
        scanner.close();
    }//End of main
}//End of class