package datastructures.doublestack.singlearray;

/**
 * Stack implementation using Arrays
 * The array is supports two stacks from both ends
 * This implementation is efficient in space usage
 *
 */
public class DoubleSideStack 
{
    private int maxSize;
    private int[] stack;
    private int top;
    private int top2;
    
    DoubleSideStack(int size)
    {
    	maxSize = size;
    	stack = new int[maxSize];
    	top = -1;
    	top2 = maxSize;
    }
    
    boolean isOneEmpty()
    {
    	if (top == -1)
    	{
    		return true;
    	}
   		return false;
    }
    
    boolean isTwoEmpty()
    {
    	return (top2 == maxSize);
    }
    
    boolean isFull()
    {
    	if (top == top2-1)
    	{
    		return true;
    	}
    	return false;
    }
    
    /*boolean isFull()
    {
    	if (top2 == top+1)
    	{
    		return true;
    	}
    	return false;
    }*/
    
    void push1(int value)
    {
    	if(isFull())
    	{
    		System.out.println("stack is full!!! cannot insert element");
    		return;
    	}
    	stack[++top] = value;
    }
    
    void pop1()
    {
    	if(!isOneEmpty())
    	{
    		System.out.println(stack[top--]);
    	}
    	else
    	{
    		System.out.println("Stack is empty!!! nothing to pop");
    	}
    }
    
    void display1()
    {
    	for(int index = top; index >=0 ; index--)
    	{
    		System.out.println(stack[index]);
    	}
    }
    
    int peek1()
    {
    	return stack[top];
    }
    
    void push2(int value)
    {
    	if(isFull())
    	{
    		System.out.println("stack is full!!! cannot insert element");
    		return;
    	}
    	stack[--top2] = value;
    }
    
    void pop2()
    {
    	if(!isTwoEmpty())
    	{
    		System.out.println(stack[top2++]);
    	}
    	else
    	{
    		System.out.println("Stack is empty!!! nothing to pop");
    	}
    }
    
    void display2()
    {
    	for(int index = top2; index < maxSize; index++)
    	{
    		System.out.println(stack[index]);
    	}
    }
    
    int peek2()
    {
    	return stack[top2];
    }
}
