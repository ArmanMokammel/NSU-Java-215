
public class PaperBook extends Book{
	private double weight;
	private int stock;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String toString()
	{
		return "Paper Book Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nWeight: " + this.weight + "\nStock: " + this.stock + "\n";
	}
}
