import java.util.Scanner;

public class PointBackSale { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Initail points
        int x = sc.nextInt(); // 還元率(%)
        
        sc.close();

        int pointBalance = n;
        int totalUsedPoints = 0;

        //7days loop.
        for (int i = 0; i < 7; i++) {
            // Use all points for shopping and add to total shopping amount
            totalUsedPoints += pointBalance;
            pointBalance = (pointBalance * x) / 100;
        }
        System.out.println(totalUsedPoints);
    }
}