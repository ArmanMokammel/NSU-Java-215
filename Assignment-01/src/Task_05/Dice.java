package Task_05;

import java.util.Random;

public class Dice {
	private int sides;
	private int currentValue;
	
	public Dice(int sides) 
	{
		this.sides = sides;
	}

	public int getSides() 
	{
		return sides;
	}

	public int getCurrentValue() 
	{
		return currentValue;
	}

	public void setCurrentValue(int currentValue) 
	{
		this.currentValue = currentValue;
	}
	
	public int roll()
	{
		Random random = new Random();
		int x = random.nextInt(sides);
		
		while(x == 0)
		{
			x = random.nextInt(sides);
		}
		
		currentValue = x;
		return currentValue;
	}
}
