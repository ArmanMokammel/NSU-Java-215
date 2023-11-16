import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc;
		FileWriter writer;
		File file = new File("Quiz.txt");
		
		try {
			sc = new Scanner(System.in);
			writer = new FileWriter(file);
			
			System.out.print("Enter number of records: ");
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				System.out.print("Enter ID: ");
				String id = sc.next();
				System.out.print("Enter Marks: ");
				double marks = sc.nextDouble();
				
				writer.write(id + "\t" + marks + "\n");
			}
			writer.close();
			sc.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		try {
			sc = new Scanner(file);
			
			int size = 0;
			while(sc.hasNextLine()) {
				sc.nextLine();
				size++;
			}

			Quiz[] quizzes = new Quiz[size];
			
			sc = new Scanner(file);
			
			for(int i = 0; i < size; i++) {
				String line = sc.nextLine();
				String[] data = line.split("\t");
				
				Quiz q = new Quiz();
				q.id = data[0];
				q.mark = Double.parseDouble(data[1]);
				
				quizzes[i] = q;
			}
			
			double highestMark = 0;
			String id = "";
			
			for(int i = 0; i < size; i++) {
				System.out.println(quizzes[i]);
				
				if(quizzes[i].mark > highestMark) {
					highestMark = quizzes[i].mark;
					id = quizzes[i].id;
				}
			}
			
			System.out.println("\nThe sutdent who obtained highest mark: " + id);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
