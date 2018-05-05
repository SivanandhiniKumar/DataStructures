package datastructures.stack.operations;

public class RecursiveSortStackApp {
	static StackInt stack = new StackInt(5);
	public static void main(String args[]){
		
		stack.push(5);
		stack.push(3);
		stack.push(1);
		stack.push(4);
		stack.push(2);
		System.out.println("Original stack:");
		stack.display();
		
		sortStack();
		System.out.println("Sorted stack:");
		stack.display();
	}

	private static void sortStack() {
		if (stack.size()>0)
		{
			int element = stack.pop();
			sortStack();
			sortAndInsert(element);
		}
		
	}

	private static void sortAndInsert(int element) {
		if(stack.isEmpty())
		{
			stack.push(element);
		}
		else
		{
			int topElement = stack.peek();
			if(topElement < element)
			{
				stack.pop();
				sortAndInsert(element);
				stack.push(topElement);
			}
			else
			{
				stack.push(element);
			}
		}
	}
}
