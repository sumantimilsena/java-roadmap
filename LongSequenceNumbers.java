import java.util.ArrayList;
import java.util.Scanner;

public class LongSequenceNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        // Apply the transformation rule K times
        for (int loop = 0; loop < k; loop++) {
            ArrayList<Integer> nextList = new ArrayList<>();
            int len = list.size();
            
            for (int i = 0; i < len; i++) {
                int currentNum = list.get(i);
                int count = 1;
                
                // Count how many times the number repeats consecutively
                while (i + 1 < len && list.get(i + 1) == currentNum) {
                    count++;
                    i++;
                }
                
                // THE FIX: Add the number ONCE, then add its count ONCE
                nextList.add(currentNum);
                nextList.add(count);
            }
            list = nextList; // Update for the next round
        }
        
        // Print the final result formatted with spaces
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
