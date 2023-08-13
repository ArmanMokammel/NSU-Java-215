
public class Main {

	public static void main(String[] args) {
		char[] string = {
				'H','e','l','l','o',' ','W','o','r','l','d'
			};
			MyString s = new MyString(string);
			
			System.out.println(s.length());
			System.out.println(s);
			s.replace('e', 'u');
			System.out.println(s.charAt(4));
			System.out.println(s.contains("Wor"));
			System.out.println(s.equals("Hello World"));
			System.out.println(s.indexOf('o'));
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
			System.out.println(s.trim());

	}

}
