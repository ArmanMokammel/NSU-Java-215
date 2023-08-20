
public class Main {

	public static void main(String[] args) {
		FullTimeEmployee ftm = new FullTimeEmployee(
				"Arman Mokammel",
				23,
				"Block-C, Bashundhara",
				"ECE",
				"Boss",
				60000,
				25.0
			);
		
		PartTimeEmployee ptm = new PartTimeEmployee(
				"Mahmuda Zannat Punny",
				24,
				"Block-F, Bashundhara",
				"ECE",
				"Baccha",
				30,
				1000.45
			);
		
		System.out.println(ftm);
		System.out.println("Salary: " + ftm.salary());
		System.out.println();
		System.out.println(ptm);
		System.out.println("Salary: " + ptm.salary());

	}

}
