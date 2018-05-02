package datastructures.stack.usecases;

/**
 * Stack implementation using Arrays
 *
 */
public class StackInt
{
    private int maxSize;
    private int[] stack;
    private int top;
    
    StackInt(int size)
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
    	stack[++top] = value;
    }
    
    int pop()
    {
    		return stack[top--];
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
}
