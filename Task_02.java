import java.util.Scanner;

public class Task_02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		
		for(int i = 0; i < 100; i++) {
			int a = (int)(Math.random() * 1000);
			arr[i] = a;
		}
		
		int x = sc.nextInt();
		try {
			if(x > 99 || x < 0) {
				throw new Exception("Index out of array");
			}
			else {
				System.out.println(arr[x]);
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
