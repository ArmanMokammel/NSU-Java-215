package Task_06;

public class Main {
	
	public static void main(String[] args) {
		Book b1 = new Book("WildLife Jhamela", "Arman Mokammel", "420420", 2022);
		Book b2 = new Book("Moron Coding", "Nobody", "482069", 2019);
		
		System.out.println("\nTitle: " + b1.getTitle() + "\nAuthor: " + b1.getAuthor() + "\nISBN: " + b1.getISBN() + "\nYear: " + b1.getYear());

		System.out.println("\nTitle: " + b2.getTitle() + "\nAuthor: " + b2.getAuthor() + "\nISBN: " + b2.getISBN() + "\nYear: " + b2.getYear());}
}
