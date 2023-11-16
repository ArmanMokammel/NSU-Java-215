import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc;
		FileWriter writer;
		File file = new File("numbers.txt");
		
		try {
			sc = new Scanner(System.in);
			writer = new FileWriter(file);
			
			System.out.print("Enter n: ");
			int n = sc.nextInt();
			while(n >= 0) {
				writer.write(n + "\n");
				System.out.print("Enter n: ");
				n = sc.nextInt();
			}
			writer.close();
			sc.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		try {
			int sum = 0;
			double count = 0;
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				sum = sum + Integer.parseInt(sc.nextLine());
				count++;
			}
			
			double average = sum / count;
			
			System.out.println("Sum: " + sum);
			System.out.println("Average: " + average);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
