
public class Herb extends Plant{
	private boolean isMedicinal;
	private String season;
	
	public Herb(String name, String color, boolean isMedicinal, String season) {
		super(name, color);
		this.isMedicinal = isMedicinal;
		this.season = season;
	}

	public boolean isMedicinal() {
		return isMedicinal;
	}

	public void setMedicinal(boolean isMedicinal) {
		this.isMedicinal = isMedicinal;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	public String toString() {
		return "Name:\t\t" + getName() + "\nColor:\t\t" + getColor() + "\nIs Medicinal:\t" + isMedicinal + "\nSeason:\t\t" + season;
	}
}
