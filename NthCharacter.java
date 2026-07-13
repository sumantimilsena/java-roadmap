import java.util.Scanner;
public class NthCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String inputWords = sc.nextLine();
		int outputCharacter = sc.nextInt();
		String result = inputWords.substring(10,outputCharacter);
		System.out.println(result);
		sc.close();
	}
}