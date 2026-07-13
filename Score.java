import java.util.Scanner;
public class Score{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	int teamA = sc.nextInt();
	int teamB = sc.nextInt();
	if (teamA>teamB){
		System.out.println("A");
	}else if (teamA<teamB){
		System.out.println("B");
	}else{
		System.out.println("DRAW");
	}
		sc.close();
	}
}