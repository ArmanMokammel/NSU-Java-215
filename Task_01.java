import java.util.Scanner;

public class Task_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			try {
				int x = sc.nextInt();
				if(x < 0) {
					throw new Exception("Input positive integer only");
				}
				sum += x;
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				return;
			}
		}
		System.out.println("Sum = "+ sum);
	}
}
