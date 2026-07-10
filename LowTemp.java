import java.util.Scanner;
import java.util.Arrays;
public class LowTemp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input weather data");
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		int[] temp = {t1, t2, t3};
		Arrays.sort(temp);
		int minTemp = temp[0];
		System.out.println(minTemp);
	}
}