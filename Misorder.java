import java.util.Scanner;
public class Misorder { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        // Create a boolean array to track which orders have been received
        boolean[] isOrdered = new boolean[num+1];
        for(int i = 0; i < num; i++){
            int order = sc.nextInt();
            
            // Mark the order as received if it is within the valid range
            if(order >= 1 && order <= num){
                isOrdered[order] = true;
            }
        }//end of for
        
        int missedNumber = 0;
        for(int i = 1; i <= num; i++){
            if(!isOrdered[i]){
                missedNumber++;
            }

        }//end of for
        
        System.out.println(missedNumber);
        
        sc.close();
    }//end of main
}//end of class