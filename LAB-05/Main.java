
public class Main {

	public static void main(String[] args) {
		char[] string = {
				' ',' ',' ','H','e','l','l','o',' ','W','o','r','l','d',' ',' '
			};		
		
		MyString s1 = new MyString(string);
		MyString s2 = new MyString("   Hello World  ");
		
		s1.replace('e', 'u');
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.contains("Wor"));
		System.out.println(s1.equals("Hullo World"));		
		System.out.println(s1.trim());

	}

}
