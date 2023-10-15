
public class Main {

	public static void main(String[] args) {
		BoundedStack stack = new BoundedStack(5);
		stack.push(1);
		System.out.println(stack);

		stack.push(2);
		System.out.println(stack);

		stack.push(3);
		System.out.println(stack);

		stack.push(4);
		System.out.println(stack);

		stack.push(5);
		System.out.println(stack);

		stack.push(6);
		System.out.println(stack);

		
		System.out.println("Popped: " + stack.pop());
		System.out.println(stack);

		System.out.println("Popped: " + stack.pop());
		stack.push(9);
		System.out.println(stack);

		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());
		stack.push(69);		
		System.out.println(stack);
	}

}
