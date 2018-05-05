package datastructures.stack.operations;

public class RecursiveReverseStack {
	static StackInt stack = new StackInt(5);
	public static void main(String args[]){
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println("Original stack:");
		stack.display();
		
		reverseStack();
		System.out.println("Reversed stack:");
		stack.display();
	}

	private static void reverseStack() {
		if (stack.size()>0)
		{
			int element = stack.pop();
			reverseStack();
			insertToEnd(element);
		}
		
	}

	private static void insertToEnd(int element) {
		if(stack.isEmpty())
		{
			stack.push(element);
		}
		else
		{
			int popElement = stack.pop();
			insertToEnd(element);
			stack.push(popElement);
		}
	}
}
