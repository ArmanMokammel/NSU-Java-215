import java.util.Arrays;

public class MyGhorarDim {
	private char[] str;
	
	MyGhorarDim(){}
	
	MyGhorarDim(char[] str){
		this.str = str;
	}
	
	
	public void replace(char oldchar, char newchar)
	{
		for(int i = 0; i < str.length; i++)
		{
			if(str[i] == oldchar)
			{
				str[i] = newchar;
			}
		}
	}
	
	public String toString()
	{
		return new String(str);
	}
}
