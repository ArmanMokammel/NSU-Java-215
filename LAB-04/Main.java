public class Main {
	public static void main(String args[])
	{
		LinkedListCustom lk = new LinkedListCustom();
		
		lk.add("Holy");
		lk.add("Moly");
		lk.add("meow");
		lk.add("Damn");
		
		System.out.println(lk);
		
		lk.remove("Moly");
		
		System.out.println(lk);
		
		lk.addFirst("Superman");
		lk.addLast("WOW");
		
		System.out.println(lk);
		
		lk.add(2, "tweet");
		
		System.out.println(lk);
		
		lk.remove(3);

		
		System.out.println(lk);
	}
}
