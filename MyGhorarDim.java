
public class MyString {
	char[] str ;
	
	MyString (String s)
	{
		str = s.toCharArray() ;		
	}
	
	MyString (char[] a)
	{
		this.str = a ;
	}
	
	public int length()
	{
		int len = 0;
		for(char s: str)
		{
			len++;
		}
		return len;
	}
	
	public char charAt(int i)
	{
		return this.str[i];
	}
	
	public indexOf()
	{
		
	}
	
	public boolean contains(String s)
	{
		int len = this.length();
		int j = 0;
		for(int i = 0; i < len - 1; i++)
		{
			if(j != s.length())
			{
				if(str[i] == s.charAt(j))
				{					
					j++;
				}
				else
				{
					j = 0;
				}
			}
		}
		
		if(j == s.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean equals(String s)
	{
		int len = this.length();
		
		if(len != s.length())
		{
			return false;
		}
		for(int i = 0; i < len - 1; i++)
		{
			if(str[i] != s.charAt(i))
			{					
				return false;
			}
		}
		return true;
	}
	
	public void replace(char oldchar, char newchar)
	{
		for(int i = 0; i < this.length(); i++)
		{
			if(str[i] == oldchar)
			{
				str[i] = newchar;
			}
		}
	}
		
	public void printString ()
	{
        // Lastly printing the array elements
        for (char ch : this.str) {
 
            System.out.print(ch);
        }		
        System.out.println();
	}
	
	public String toString ()
	{
		return new String (this.str) ;
	}
}
