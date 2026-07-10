import java.util.Scanner;

public class ArithmeticSequence{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i= 0; i<10; i++){
			if(i<10){
				System.out.print(n);
				n = n+m;
				if(i<9){
				System.out.print(" ");
				}
			}
		}
		
		}//main ended
	}//class ended