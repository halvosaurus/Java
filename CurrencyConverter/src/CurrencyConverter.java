import java.util.Scanner;

public class CurrencyConverter {
	private static double result;
	private static double eur;
	private static double gbp;
	private static int userInput;
	
	static Scanner in = new Scanner(System.in);
	
	public static void EurSter(){
		System.out.println("Please enter the Euro amount to convert to GBP" );
		eur = in.nextDouble();
		result = eur * 0.71;
		System.out.println("Amount in GBP: £" + result);
	}
	
	public static void SterEur(){
		System.out.println("Please enter the GBP amount to convert to Euro" );
		gbp = in.nextDouble();
		result = gbp * 1.41;
		System.out.println("Amount in Euro: €" + result);
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the Euro/GBP currency converter");
		System.out.println("Accurate as of 10/08/2015\n");
		
		while(true){
			
		System.out.println("\n\nThere are two options:");
		System.out.println("1. Euro to Sterling \n2. Sterling to Euro\n");
		
		System.out.println("Please enter your choice: ");
		userInput = in.nextInt();
		
		if (userInput == 1){
			EurSter();
		}
		
		else if (userInput == 2){
			SterEur();
		}
		
		else{
			System.out.println("Invalid input");
		}
	}
	}
}
