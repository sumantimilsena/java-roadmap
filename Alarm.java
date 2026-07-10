import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Alarm{
	public static void main(String[] args){
		//Making an object
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		while(true){
			try{
			System.out.print("Input wakeup time: ");			
			String input = sc.nextLine();
			//Parsing Time
			java.time.LocalTime wakeTime = java.time.LocalTime.parse(input, formatter);
			java.time.LocalTime sleepTime = wakeTime.minusHours(8);
			System.out.println(sleepTime.format(formatter));
		}catch(DateTimeParseException e){
			System.out.println("Error: Input format must be HH:mm AM/PM");
			System.out.print("Input wakeup time: ");
			}
			break;
		}
	}
}