import java.util.*;
public class OutputnTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Input Count: ");
		int count = sc.nextInt();
		System.out.println("Input words to println: ");
	//	sc.nextLine();
		String name = sc.nextLine();		
		String name1 = sc.nextLine();

		for(int i = 0; i<count; i++){
			System.out.println(name1);
		}
		sc.close();
    }
}