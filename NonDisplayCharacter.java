import java.util.Scanner;
public class NonDisplayCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//If str exceed 10 charcter display the exceed value of length
		// If str is equal below the character display zero'0'
		if(str.length()>=10){
			System.out.println(str.length()-10);
		}else{
			System.out.println(0);
		}		
	}
}