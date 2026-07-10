import java.util.Scanner;

public class Bookshelf{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		if(d*e>n){
			System.out.println("OK");
		}else{
			System.out.println("NG");
		}
		sc.close();
		}//main ended
	}//class ended