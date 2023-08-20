
public class EBook extends Book{
	private String url;
	private double size;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	public String toString()
	{
		return "EBook Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nSize: " + this.size + "\nUrl: " + this.url + "\n";
	}

}
