import java.awt.print.Printable;
import java.util.Scanner;

public class AddNumbers {
	private static int userInput2;
	private static int userInput1;
	private static int sum;


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		userInput1 = in.nextInt();
		
		System.out.println("Enter a second number: ");
		userInput2 = in.nextInt();
		
		sum = userInput1 + userInput2;
		System.out.println("Sum of numbers = " + sum);
		
	}
}
