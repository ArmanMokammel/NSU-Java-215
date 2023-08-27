package Task_02;

public class Main {

	public static void main(String[] args) {

		Point p1 = new Point(3, 8);
		Point p2 = new Point(7, 15);
		
		System.out.println("P1: " + p1);
		System.out.println("P2: " + p2 + "\n");
		
		System.out.println("Distance from p1 to p2: " + p1.distanceTo(p2) + "\n");
		
		p2.translate(3, 5);
		
		System.out.println("P2: " + p2 + "\n");

	}

}
