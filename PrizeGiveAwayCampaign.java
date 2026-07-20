import java.util.Scanner;
public class PrizeGiveAwayCampaign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of participants:");
        int participants = sc.nextInt();
        System.out.println("Enter the value of X:");
        int x = sc.nextInt();
        System.out.println("Enter the value of Y:");
        int y = sc.nextInt();

        for(int i = 1; i <= participants; i++){
            // Logic for determining prize winner would go here
            if(i % x == 0 && i % y == 0){
                System.out.println("AB");
            } else if(i % x == 0){
                System.out.println("A");
            } else if(i % y == 0){
                System.out.println("B");
            } else {
                System.out.println("N");
            }
        }
        sc.close();
    }
}