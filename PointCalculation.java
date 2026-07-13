import java.util.Scanner;
public class PointCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num*10/100);	
		sc.close();
	}
}