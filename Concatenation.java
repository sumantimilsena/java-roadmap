import java.util.Scanner;
public class Concatenation{
	public static void main(String[] args){
		String result = "Hello ";
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();		
		for(int i=0; i<input; i++){
		String name = sc.nextLine();
		result += name;
				
		if(i<input-1){
			result+=", ";
		}else{
			result += ".";
		}
	}	
		System.out.print(result);
		sc.close();		
	}
}