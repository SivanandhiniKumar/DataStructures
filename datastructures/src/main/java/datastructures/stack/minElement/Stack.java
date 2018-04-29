package datastructures.stack.minElement;

/**
 * Stack implementation using Arrays
 *
 */
public class Stack 
{
    private int maxSize;
    private int[] stack;
    private int top;
    private int minValue;
    
    Stack(int size)
    {
    	maxSize = size;
    	stack = new int[maxSize];
    	top = -1;
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
    	if(isEmpty())
    	{
    		minValue = value;
    	}
    	else
    	{
    		if(value < minValue)
    		{
    			stack[++top] = 2*value - minValue;
    			minValue = value;
    			return;
    		}
    	}
    	stack[++top] = value;
    }
    
    void pop()
    {
    	if(!isEmpty())
    	{
    		int popValue = stack[top--];
    		if (popValue > minValue)
    		{
    			System.out.println(popValue);
    		}
    		else
	    	{
    			System.out.println(minValue);
	    		if(popValue < minValue)
	    		{
	    			minValue = 2*minValue - popValue;
	    		}
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
    	if(top == -1)
    	{
    		System.out.println("Empty stack.. cannot find minelement");
    		return;
    	}
    	System.out.println(minValue);
    }
}
