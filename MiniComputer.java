import java.util.Scanner;

public class MiniComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize both variables to 0
        int var1 = 0;
        int var2 = 0;

        // Read the number of commands
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            if (command.equals("SET")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
				
                // Assign value to the specific variable
                if (index == 1) {
                    var1 = value;
                } else if (index == 2) {
                    var2 = value;
                }
				
            } else if (command.equals("ADD")) {
                int value = sc.nextInt();
				
                // add to var2
                var2 = var1 + value;
            } else if (command.equals("SUB")) {
                int value = sc.nextInt();
                // Substract to var2
                var2 = var1 - value;
            }
        }

        // Final values
        System.out.println(var1 + " " + var2);
        sc.close();
    }
}