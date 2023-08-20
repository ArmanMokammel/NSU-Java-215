package Task_04;

public class Student {
	
	private String name;
	private int age;
	private String studentID;
	
	public Student(String name, int age, String studentID) 
	{
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getStudentID() 
	{
		return studentID;
	}

	public void setStudentID(String studentID) 
	{
		this.studentID = studentID;
	}
	
	public void displayInfo()
	{
		System.out.println("Name: " + name + "\nAge: " + age + "\nStudentID: " + studentID + "\n");
	}
}
