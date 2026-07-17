import java.util.Scanner;
//C062
public class MelonOnShushi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dishes = sc.nextInt();
        
        int melonCount = 0;      
        int eatingCooldown = 0; 
        
        for (int i = 0; i < dishes; i++) {
            String item = sc.next();
            
            if (eatingCooldown > 0) {
                eatingCooldown--;
            } else if (item.equals("melon")) {
                melonCount++;
                eatingCooldown = 9;
            }
        }
        
        System.out.println(melonCount);
        
        sc.close();
    }
}