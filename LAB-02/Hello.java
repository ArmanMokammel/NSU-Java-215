public class Student {
	private int id;
	private float cgpa;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setCGPA(float cgpa)
	{
		this.cgpa = cgpa;
	}
	
	public float getCGPA()
	{
		return this.cgpa;
	}
	
	public void printRemarks()
	{
		System.out.print(id + " " + cgpa);
	}
}
