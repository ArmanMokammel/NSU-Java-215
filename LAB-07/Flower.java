
public class Flower extends Plant{
	private boolean hasSmell;
	private boolean hasThorn;
	
	public Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
		super(name, color);
		this.hasSmell = hasSmell;
		this.hasThorn = hasThorn;
	}

	public boolean HasSmell() {
		return hasSmell;
	}

	public void setHasSmell(boolean hasSmell) {
		this.hasSmell = hasSmell;
	}

	public boolean HasThorn() {
		return hasThorn;
	}

	public void setHasThorn(boolean hasThorn) {
		this.hasThorn = hasThorn;
	}
	
	public String toString() {
		return "Name:\t\t" + getName() + "\nColor:\t\t" + getColor() + "\nHas Smell:\t" + hasSmell + "\nHas Thorn:\t" + hasThorn;
	}
}
