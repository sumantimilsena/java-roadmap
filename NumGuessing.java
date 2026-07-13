import java.util.Scanner;
public class NumGuessing{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int target = sc.nextInt();
//		System.out.println(p1+" "+p2);
		System.out.println((p1-target)+" "+(p2-target));

		sc.close();
	}
}