import java.util.Scanner;
public class KadoMatsu{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the smallest part of kadomatsu(3:5:7)");
		int num = sc.nextInt();
		if(num > 0){
			int total = (num*15)/3;
			System.out.println(total);
		}else{
			System.out.print("Error");
		}
	}
}