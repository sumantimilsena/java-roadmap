import java.util.Scanner;
import java.util.Arrays;

public class MedalAwardCeremony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Read number of participants and scores with prompts
        System.out.print("Enter the number of participants: ");
        int num = sc.nextInt();
        
        int[] scores = new int[num];
        System.out.println("Enter the scores for " + num + " participants:");
        for (int i = 0; i < num; i++) {
            scores[i] = sc.nextInt();
        }
        
        // Step 2: Sort scores to extract top 3 cutoff values
        int[] sorted = scores.clone();
        Arrays.sort(sorted);

        int goldThreshold = sorted[num - 1];
        int silverThreshold = (num >= 2) ? sorted[num - 2] : Integer.MIN_VALUE;
        int bronzeThreshold = (num >= 3) ? sorted[num - 3] : Integer.MIN_VALUE;
        
        // Step 3: Display results with participant labels
        System.out.println("\n--- Final Results ---");
        for (int i = 0; i < num; i++) {
            int currentScore = scores[i];
            
            if (currentScore == goldThreshold) {
                System.out.println("Participant " + (i + 1) + " (Score: " + currentScore + "): Gold Medal (G)");
            } else if (currentScore == silverThreshold) {
                System.out.println("Participant " + (i + 1) + " (Score: " + currentScore + "): Silver Medal (S)");
            } else if (currentScore == bronzeThreshold) {
                System.out.println("Participant " + (i + 1) + " (Score: " + currentScore + "): Bronze Medal (B)");
            } else {
                System.out.println("Participant " + (i + 1) + " (Score: " + currentScore + "): No Medal (N)");
            }
        }
        
        sc.close();
    }    
}//C106