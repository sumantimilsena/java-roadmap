import java.util.Scanner;

public class TestScore{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//Number of Students
		int m = sc.nextInt();//PassMarks
		
		for(int i= 1; i<=n; i++){
			int score = sc.nextInt();//score per stu.
			int absence = sc.nextInt(); //for calculation marks
			
			//Final Grade
			int finalGrade = score-(absence*5);
			if(finalGrade<0){
				finalGrade= 0; //Upgrdae incase of marks below 0
			}
			if(finalGrade>=m){
				System.out.println(i);
			}			
		}	
		sc.close();
	}//main ended
}//class ended