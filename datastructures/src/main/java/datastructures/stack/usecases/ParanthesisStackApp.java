package datastructures.stack.usecases;

import java.util.Scanner;

public class ParanthesisStackApp {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter expression:");
		String expression = scan.nextLine();
		StackChar stack = new StackChar(100);
		scan.close();
		for(int i=0; i<expression.length();i++)
		{
			char c = expression.charAt(i);
			if (c == '{' || c == '[' || c =='(')
			{
				stack.push(c);
			}
			else if (c == '}')
			{
				if (stack.peek() != '{')
				{
					System.out.println("Unbalanced expression");
					return;
				}
				else
				{
					stack.pop();
				}
			}
			else if (c == ']')
			{
				if (stack.peek() != '[')
				{
					System.out.println("Unbalanced expression");
					return;
				}
				else
				{
					stack.pop();
				}
			}
			else if (c == ')')
			{
				if (stack.peek() != '(')
				{
					System.out.println("Unbalanced expression");
					return;
				}
				else
				{
					stack.pop();
				}
			}
		}
		if(stack.isEmpty())
		{
			System.out.println("balanced expression");
		}
		else
		{
			System.out.println("unbalanced expression");
		}
	}
	
}
