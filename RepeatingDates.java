import java.util.Scanner;

public class RepeatingDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

	   //input variable
		String month = sc.next();
		String day = sc.next();
		sc.close();
		
		
		//Combine the Strings
		String combined = month+ day;
		

		boolean isZorome = true;
		char target = combined.charAt(0);
		
		
		for(int i= 1; i<combined.length(); i++){
			if(combined.charAt(i)!= target){
				isZorome = false;
				break;
			}
		}
				
		
		//Final Logic
		if(isZorome){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
    }
}
