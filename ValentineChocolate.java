import java.util.Scanner;
public class ValentineChocolate{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		String chocoType = sc.nextLine();
		int price = sc.nextInt();
		
		if (chocoType.equalsIgnoreCase("chocolate")){
			System.out.println(price*2);
		}else{
			System.out.println(price*5);
		}
		
		sc.close();
	}
	
}