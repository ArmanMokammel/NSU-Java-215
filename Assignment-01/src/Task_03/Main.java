package Task_03;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car(
			"Mercedes-Benz",
			"W214",
			2023
		);
		
		Car c2 = new Car(
			"Audi",
			"A8L",
			2021
		);
		
		c1.displayInfo();
		c2.displayInfo();

		c2.accelerate(40);
		c1.accelerate(90);
		
		c1.brake(10);
		c2.brake(5);
	}

}
