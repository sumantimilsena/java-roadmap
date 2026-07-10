import java.util.Scanner;
public class SalaryCalculation{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	int amount = sc.nextInt();
	int time = sc.nextInt();
	System.out.println(amount*time);
	}
}