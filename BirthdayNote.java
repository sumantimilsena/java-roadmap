import java.util.Scanner;

public class BirthdayNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // Number of classmates
        int M_0 = sc.nextInt();  //
        int D_0 = sc.nextInt();
        
        int Day1 = getDayOfYear(M_0, D_0);
        int Day4 = getDayFromApril2(M_0, D_0);
        
        int count1 = 0;
        int count4 = 0;
        
        for (int i = 0; i < N; i++) {
            int M_i = sc.nextInt();
            int D_i = sc.nextInt();
            
            int classmateDay1 = getDayOfYear(M_i, D_i);
            if (classmateDay1 < Day1) {
                count1++;
            }
            
            
            int classmateDay4 = getDayFromApril2(M_i, D_i);
            if (classmateDay4 < Day4) {
                count4++;
            }
        }
        
        System.out.println(count1 + 1);
        System.out.println(count4 + 1);
        
        sc.close();
    }
    
    private static int getDayOfYear(int month, int day) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int totalDays = 0;
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;
        return totalDays;
    
    }
    
                
    private static int getDayFromApril2(int month, int day) {
        int dayOfYear = getDayOfYear(month, day);
        int april2DayOfYear = getDayOfYear(4, 2); 
        
        if (dayOfYear >= april2DayOfYear) {
            return dayOfYear - april2DayOfYear;
        } else {
            return (dayOfYear + 366) - april2DayOfYear;
        }
    }
}