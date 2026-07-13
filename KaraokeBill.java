import java.util.Scanner;
public class KaraokeBill{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int priceper30 = sc.nextInt();
		int minute = sc.nextInt();
		int module = minute%30;
		if(module!=0){
			minute = minute+30-module;
			System.out.println((minute/30)*priceper30);			
		}else{
			System.out.println((minute/30)*priceper30);			
		}
		sc.close();
	}
}