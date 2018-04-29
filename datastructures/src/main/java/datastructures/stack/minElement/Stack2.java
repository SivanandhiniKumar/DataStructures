package datastructures.stack.minElement;

/**
 * Stack implementation using Arrays
 *
 */
public class Stack2 
{
    private int maxSize;
    private int[] stack;
    private int[] minStack;
    private int top, minTop;
    
    Stack2(int size)
    {
    	maxSize = size;
    	stack = new int[maxSize];
    	minStack = new int[maxSize];
    	top = -1;
    	minTop = -1;
    }
    
    boolean isEmpty()
    {
    	if (top == -1)
    	{
    		return true;
    	}
   		return false;
    }
    
    boolean isFull()
    {
    	if (top == maxSize-1)
    	{
    		return true;
    	}
    	return false;
    }
    
    void push(int value)
    {
    	if(isFull())
    	{
    		System.out.println("stack is full!!! cannot insert element");
    		return;
    	}
    	if(isEmpty() || (!isEmpty() && value <= minStack[minTop]))
    	{
    		minStack[++minTop] = value;
    	}
    	stack[++top] = value;
    }
    
    void pop()
    {
    	if(!isEmpty())
    	{
    		int popValue = stack[top--];
    		System.out.println(popValue);
    		if (popValue == minStack[minTop])
    		{
    			minTop--;
    		}
    	}
    	else
    	{
    		System.out.println("Stack is empty!!! nothing to pop");
    	}
    }
    
    void display()
    {
    	for(int index = top; index >=0 ; index--)
    	{
    		System.out.println(stack[index]);
    	}
    }
    
    int peek()
    {
    	return stack[top];
    }
    
    void getMin()
    {
    	if(!isEmpty())
    		System.out.println(minStack[minTop]);
    	else
    		System.out.println("Stack is empty!!! cannot get min");
    }
}
