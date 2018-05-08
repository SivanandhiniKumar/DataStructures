package datastructures.stack.operations;

public class SortStackApp {

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
		StackInt tempStack = new StackInt(5);
		
		while(!stack.isEmpty())
		{
			int element = stack.pop();
			if(tempStack.isEmpty())
			{
				tempStack.push(element);
			}
			else
			{
				while(!tempStack.isEmpty() && tempStack.peek() > element)
				{
					stack.push(tempStack.pop());
				}
				tempStack.push(element);
			}
		}
		while(!tempStack.isEmpty())
		{
			stack.push(tempStack.pop());
		}
	}

}
