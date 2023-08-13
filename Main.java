
public class Main {

	public static void main(String[] args) {
		char[] string = {
			'H','e','l','l','o',' ','W','o','r','l','d'
		};
		MyGhorarDim s = new MyGhorarDim(string);
		
		s.replace('e', 'u');
		
		System.out.println(s);
	}

}
