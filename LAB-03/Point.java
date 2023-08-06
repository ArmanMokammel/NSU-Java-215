import java.lang.Math;

public class Point {
	private int x ;
	private int y ;
	
	Point (int x, int y)
	{
		this.x = x ;
		this.y = y ;
	}
	Point ()
	{
		
	}
	void setX (int i)
	{
		this.x = i ;
	}
	void setY (int j)
	{
		this.y = j ;
	}
	int getX ()
	{
		return this.x ;
	}
	int getY ()
	{
		return this.y ;
	}
	
	public String toString ()
	{
		return "x = " + this.x + ", y = " + this.y ;
	}

	public double distance (Point p)
	{
		int x2 = p.getX() ;
		int x1 = this.x ;
		int y2 = p.getY() ;
		int y1 = this.y ;
		return Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2)) ;
	}
	public static String hello ()
	{
		return "Hello Point" ;
	}
}
