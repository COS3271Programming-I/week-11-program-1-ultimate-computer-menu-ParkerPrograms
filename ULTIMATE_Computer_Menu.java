package Week11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ULTIMATE_Computer_Menu {
	static Scanner userinput = new Scanner(System.in);
	public static void display() {
		
	}
	public static void text_art() {
		
	}
	public static void calculator() {
		
	}
	public static void binary_calculator() {
		
	}
	public static void encouragement() {
		
	}
	public static void dice() {
		
	}
	public static void oppish() {
		
	}
	public static void fibonacci() {
		
	}
	public static void double_factorial() {
		
	}
	public static int getInt(String message) {
		int response;
		String dummy;
		while (1 == 1) {
			try {
				System.out.print(message);
				response = userinput.nextInt();
				if ((response < 10 ) && (response >= 0)) {
					return response;
				}
			} catch (InputMismatchException e) {
				dummy = userinput.nextLine();
				continue;
			}
		}
	}
	public static void main(String[] args) {
		int menu_answer = 10;
		System.out.println("Welcome to the ULTIMATE COMPUTER");
		while (menu_answer != 0) {
			//menu
			System.out.println("\n1) Display App\n2) Text Art App\n3) Calculator App"
					+ "\n4) Binary Calculator App\n5) Encouragement App\n6) Dice App"
					+ "\n7) Oppish App\n8) Fibonacci App\n9) Double Factorial App"
					+ "\n0) Quit\n");
			//get valid user input
			menu_answer = getInt("Enter a number from the menu: ");
			//call the correct method
			if (menu_answer == 1) {display();}
			if (menu_answer == 2) {text_art();}
			if (menu_answer == 3) {calculator();}
			if (menu_answer == 4) {binary_calculator();}
			if (menu_answer == 5) {encouragement();}
			if (menu_answer == 6) {dice();}
			if (menu_answer == 7) {oppish();}
			if (menu_answer == 8) {fibonacci();}
			if (menu_answer == 9) {double_factorial();}
		}
		System.out.println("\nThanks for using the ULTIMATE COMPUTER");
	}
}
