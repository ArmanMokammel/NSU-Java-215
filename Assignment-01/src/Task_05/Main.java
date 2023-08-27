package Task_05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice(6);
		
		String choice = "y";
		while(!choice.equals("n"))
		{
			System.out.print("Roll? (y/n): ");
			choice = sc.next();
			System.out.println("Value: " + dice.roll() + "\n");
		}
		sc.close();
	}

}
