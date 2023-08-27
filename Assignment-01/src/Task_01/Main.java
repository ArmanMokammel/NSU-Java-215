package Task_01;

public class Main {

	public static void main(String[] args) {
		
		Box bx = new Box(12, 8, 5);
		
		System.out.println("Volume: " + bx.calculateVolume());
		System.out.println("Surface Area: " + bx.calculateSurfaceArea());
	}

}
