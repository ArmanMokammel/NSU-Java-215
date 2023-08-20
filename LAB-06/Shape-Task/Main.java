public class Main {

	public static void main(String[] args) {
		Square sq = new Square("My Square");
		
		sq.setSide1(5);
		sq.setSide2(5);
		
		System.out.println("Area of " + sq.getName() + ": " + sq.area());
		System.out.println("Perimeter of " + sq.getName() + ": " + sq.perimeter());

	}

}
