package datastructures.stack.usecases;

/**
 * Stack implementation using Arrays
 *
 */
public class StackChar
{
    private int maxSize;
    private char[] stack;
    private int top;
    
    StackChar(int size)
    {
    	maxSize = size;
    	stack = new char[maxSize];
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
    
    void push(char value)
    {
    	if(isFull())
    	{
    		System.out.println("stack is full!!! cannot insert element");
    		return;
    	}
    	stack[++top] = value;
    }
    
    char pop()
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
    
    char peek()
    {
    	return stack[top];
    }
}
