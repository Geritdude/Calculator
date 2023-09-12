import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.println("Enter Celsius temperature:");
		
		celsius = keyboard.nextDouble();
		fahrenheit = 1.8 * celsius + 32;
		
		System.out.println("Temperature in Fahrenheit: " + fahrenheit);
		
	}
}
