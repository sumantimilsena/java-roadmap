import java.util.Scanner;

public class SkyDiving{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int w = sc.nextInt();
		
		if(a>14 && w>80){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		}//main ended
	}//class ended