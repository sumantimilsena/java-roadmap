import java.util.Scanner;
public class RockPaperScissors { 
    //The number of plyaers is 2. The game is played in rounds, and the winner of each round is determined by the choices made by Alice and Bob. The choices are represented by the letters R (Rock), P (Paper), and S (Scissors). The rules for determining the winner are as follows:
    // Rock beats Scissors (R > S)
    // Scissors beats Paper (S > P)
    // Paper beats Rock (P > R)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the first player: "); // Prompt the user for the name of the first player
        String user1 = sc.nextLine(); // Read the name of the first player
        System.out.print("Enter the name of the second player: "); // Prompt the user for the name of the second player
        String user2 = sc.nextLine(); // Read the name of the second player
        System.out.print("Enter the number of rounds: ");// Prompt the user for the number of rounds
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {// Loop through each round
            System.out.print("Enter the choice of " + user1 + " (R, P, S): "); // Prompt the first player for their choice
            String user1Choice = sc.next();
            System.out.print("Enter the choice of " + user2 + " (R, P, S): "); // Prompt the second player for their choice
            String user2Choice = sc.next();
            
            // Determine the winner based on the choices Rock (R), Paper (P), and Scissors (S)
            if ((user1Choice.equals("R") && user2Choice.equals("S")) || 
                (user1Choice.equals("S") && user2Choice.equals("P")) || 
                (user1Choice.equals("P") && user2Choice.equals("R"))) {
                System.out.println(user1+ " wins this round !"); // Print the name of the first player

            } else if ((user2Choice.equals("R") && user1Choice.equals("S")) || 
                       (user2Choice.equals("S") && user1Choice.equals("P")) || 
                       (user2Choice.equals("P") && user1Choice.equals("R"))) {
                        // If the second player wins, print their name
                System.out.println(user2+ " wins this round !");
            } else {
                // If it's a tie, print "Tie"
                System.out.println("Tie");
            }
        }
        sc.close();// Close the scanner to prevent resource leaks
    }
}