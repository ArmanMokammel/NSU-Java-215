import java.util.Scanner;;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student () ;
		s.setId(123); ;
		s.setCGPA(2.8f); 
		System.out.println(s.getId() + ", " +  s.getCGPA());
		s.printRemarks();
	}

}
