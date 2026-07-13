import java.util.Scanner;

public class EvenOdd{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if((m+n)%2 !=0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		sc.close();
		}//main ended
	}//class ended