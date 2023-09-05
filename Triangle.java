import java.util.Scanner;

public class Triangle {
	static int side1, side2, side3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		side1 = sc.nextInt();
		side2 = sc.nextInt();
		side3 = sc.nextInt();
		
		try {
			if(side1 + side2 < side3) {
				throw new IllegalTriangleException("Invalid Triangle");
			}
			else {
				System.out.println("Valid Triangle");
			}
		} catch (IllegalTriangleException e) {
			System.out.println(e.getMessage());
		}
	}
}
