import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Point p1 = new Point (10, 20) ;
		Point p2 = new Point (30, 40) ;
		
		Line l = new Line(p1, p2);
		Line lh = new Line(10, 20, 30, 40);
		
		System.out.println(l.length());
		System.out.println(lh.length());

	}

}
