
public class Main_V2 {
	
	/** Here the size of array will be dynamic **/
	public static Plant[] plants = new Plant[0];

	public static void main(String[] args) {

		Plant p = new Herb("Dhoniya", "Green", true, "Summer");
		Plant p2 = new Flower("Rose", "Red", false, true);
		Plant p3 = new Flower("Dandelion", "Yellow", true, true);
		
		add(p);
		add(p2);
		add(p3);

		display(plants);
		
		remove("Rose");
		
		display(plants);
		
		System.out.println(search(plants, "Dhoniya"));
	}
	
	static void add(Plant p)
	{
		int originalLength = plants.length;
		
		Plant[] newplants = new Plant[originalLength + 1];
		
		for (int i = 0; i < originalLength; i++) {
			newplants[i] = plants[i];
		}
		
		newplants[originalLength] = p;
		
		plants = newplants;
	}
	
	static void remove(String name)
	{
		int originalLength = plants.length;
		
		Plant[] newplants = new Plant[originalLength - 1];
		
		int j = 0;
		for (int i = 0; i < originalLength; i++) {
			if(!plants[i].getName().equals(name))
			{
				newplants[j] = plants[i];
				j++;
			}
		}
		
		plants = newplants;
	}
	
	static Plant search(Plant[] plants, String name)
	{
		for (int i = 0; i < plants.length; i++) {
			if(plants[i].getName().equals(name))
			{
				return plants[i];
			}
		}
		return null;
	}
	
	static void display(Plant[] plants)
	{
		for(int i = 0; i < plants.length; i++)
		{
			System.out.println(plants[i] + "\n");				
		}
	}

}
