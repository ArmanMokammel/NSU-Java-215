
public class BoundedStack {

	int[] stack;
	int size;
	int count = 0;

	public BoundedStack(int size) {
		this.size = size;
		stack = new int[size];
	}

	public void push(int a) {
		if (count != size) {
			stack[count] = a;
			count++;
		}
	}

	public int pop() {
		if (count != 0) {
			int element = stack[count - 1];
			count--;
			return element;
		}
		return -1;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < count; i++) {
			str += stack[i] + ", ";
		}
		str += "\n";
		return str;
	}
}
