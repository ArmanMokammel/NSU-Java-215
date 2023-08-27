package Task_03;

public class Car {
	
	private String manufacturer;
	private String model;
	private int year;
	private double currentSpeed;
	
	public Car(String manufacturer, String model, int year) 
	{
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
	}

	public String getManufacturer() 
	{
		return manufacturer;
	}

	public String getModel() 
	{
		return model;
	}

	public int getYear() 
	{
		return year;
	}

	public double getCurrentSpeed() 
	{
		return currentSpeed;
	}
	
	public void accelerate(double speedIncrease)
	{
		this.currentSpeed += speedIncrease;
		System.out.println("\n" + manufacturer + "-" + model + "'s speed increased to: " + currentSpeed);
	}
	
	public void brake(double speedDecrease) 
	{
		this.currentSpeed -= speedDecrease;
		System.out.println("\n" + manufacturer + "-" + model + "'s speed decreased to: " + currentSpeed);
	}
	
	public void displayInfo()
	{
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("CurrentSpeed: " + currentSpeed + "\n");
	}
}
