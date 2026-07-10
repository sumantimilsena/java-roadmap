import java.util.Scanner;
public class Share{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int investment = sc.nextInt();
		int sharePrice = sc.nextInt();
		int ltp = sc.nextInt();
		int unit = investment/sharePrice;
		System.out.println((unit*ltp)-(unit*sharePrice));
	}
}