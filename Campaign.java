import java.util.Scanner;
import java.util.HashSet;

public class Campaign{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input password: ");
		String s = sc.nextLine();
		
		char[] digitArray = s.toCharArray();
		boolean hasDuplicate = false;
		
		HashSet<Character> seenChars = new HashSet<>();
		for (char c: digitArray){
			if(seenChars.contains(c)){
				hasDuplicate = true;
				break;
			}
			seenChars.add(c);
		}
		if(hasDuplicate){
			System.out.println("NG");
		}else{
			System.out.println("OK");
		}
	}//main ended
}//class ended