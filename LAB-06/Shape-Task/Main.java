public class Main {

	public static void main(String[] args) {
		Square sq = new Square(5, 5);
		sq.setName("My Square");
		
		System.out.println("Area of " + sq.getName() + ": " + sq.area());
		System.out.println("Perimeter of " + sq.getName() + ": " + sq.perimeter());

	}

}
