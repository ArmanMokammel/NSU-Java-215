package Task_02;

import java.lang.Math;

public class Point {
	
	private double x, y;

	public Point(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}

	public double getX() 
	{
		return x;
	}

	public void setX(double x) 
	{
		this.x = x;
	}

	public double getY() 
	{
		return y;
	}

	public void setY(double y) 
	{
		this.y = y;
	}
	
	public double distanceTo(Point other)
	{
		return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
	}
	
	public void translate(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return "x = " + x + ", y = " + y;
	}
}
