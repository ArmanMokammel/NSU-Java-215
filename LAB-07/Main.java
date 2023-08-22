
public class Main {
	
	public static int count = 0;
	public static int SIZE = 10;

	public static void main(String[] args) {
		
		/** Here the array is of fixed size (10) **/
		Plant[] plants = new Plant[SIZE];
				
		Plant p = new Herb("Dhoniya", "Green", true, "Summer");
		Plant p2 = new Flower("Rose", "Red", false, true);
		Plant p3 = new Flower("Dandelion", "Yellow", true, true);

		
		add(plants, p);
		add(plants, p2);
		add(plants, p3);

		display(plants);
		
		remove(plants, "Rose");
		
		display(plants);
		
		System.out.println(search(plants, "Dhoniya"));
	}
	
	static void add(Plant[] plants, Plant p)
	{				
		if(count < SIZE)
		{
			plants[count] = p;
			count++;
		}
	}
	
	static void remove(Plant[] plants, String name)
	{
		for(int i = 0; i < count; i++)
		{
			if(plants[i].getName().equals(name))
			{
				for(int j = i; j < count - 1; j++)
				{
					plants[j] = plants[j + 1];
				}
				count--;
			}
		}
	}
	
	static Plant search(Plant[] plants, String name)
	{
		for (int i = 0; i < count; i++) {
			if(plants[i].getName().equals(name))
			{
				return plants[i];
			}
		}
		return null;
	}
	
	static void display(Plant[] plants)
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println(plants[i] + "\n");				
		}
	}

}
