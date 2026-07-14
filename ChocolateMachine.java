import java.util.Scanner;

public class ChocolateMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt(); // Number of machines (M)
        int n = sc.nextInt(); // Number of candies (N)
        
        int maxCapacity = 0;// To track the maximum capacity of the machine with the minimum remainder
        int bestMachine = 0;       // To track the index of the best machine
        int minRemainder = 0;   // To track the minimum remainder as a best machine is found
               

        // Loop from 1 to m to directly get the 1-based machine number (i)
        for (int i = 1; i <= m; i++) {
            int trayCapacity = sc.nextInt(); // The number of containers for the i-th machine
            int remainCandy = n % trayCapacity; // Calculate the remainder when candies are evenly divided
            

            // Update the best machine 
            // if it's the first machine or if it has a smaller remainder 
            // or if it has the same remainder but a larger capacity
        if (i == 1 || remainCandy < minRemainder || (remainCandy == minRemainder&& trayCapacity> maxCapacity)) {
                minRemainder = remainCandy;// Update the minimum remainder
                maxCapacity = trayCapacity;// Update the maximum capacity
                bestMachine = i; // Update the index of the best machine
            }
        }
        
        sc.close();
        
        // Print the bestMachine's number
        System.out.println(bestMachine);
    }
}