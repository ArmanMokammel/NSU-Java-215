
public class Main {

	public static void main(String[] args) {
		Book b = new Book();
		
		b.setTitle("Baaler Programming");
		b.setAuthor("Arman");
		
		System.out.println(b);
		
		EBook eb = new EBook();
		eb.setTitle("WTF Programming");
		eb.setAuthor("Sakalala");
		eb.setSize(10.52);
		eb.setUrl("https://armanm.ddns.net/BaalerBooks/");
		
		System.out.println(eb);
		
		PaperBook pb = new PaperBook();
		pb.setTitle("Algathoritm");
		pb.setAuthor("Bolbona La la la la lalla la");
		pb.setStock(20);
		pb.setWeight(0.35);

		System.out.println(pb);
		
		b = eb;
		
		System.out.println(b);

	}

}
