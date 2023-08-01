import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int prev_index = 0;
		int current_index = 0;
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			switch (c)
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					prev_index = current_index;
					current_index = i;
					break;
			}
		}
		
		System.out.println("Second last vowel: " + str.charAt(prev_index) + " and index: " + prev_index);
	}

}
