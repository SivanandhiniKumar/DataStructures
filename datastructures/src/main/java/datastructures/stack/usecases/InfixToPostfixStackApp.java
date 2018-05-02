package datastructures.stack.usecases;

import java.util.Scanner;

public class InfixToPostfixStackApp
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter infix expression:");
		String expression = scan.nextLine();
		scan.close();
		String postfix =infixToPosfix(expression);
		System.out.println("Postfix: "+postfix);
	}
	
	public static String infixToPosfix(String expression)
	{
		String postfix ="";
		StackChar stack = new StackChar(100);
		for(int i=0; i<expression.length();i++)
		{
			char c = expression.charAt(i);
			if (c =='(')
			{
				stack.push(c);
			}
			else if (c == '*' || c == '/' || c == '+' || c == '-')
			{
				if(!stack.isEmpty())
				{
					if (precedence(c) > precedence(stack.peek()))
					{
						stack.push(c);
					}
					else
					{
						while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
						{
							postfix = postfix +stack.pop();
						}
						stack.push(c);
						
					}
				}
				else
				{
					stack.push(c);
				}
			}
			else if (c == ')')
			{
				while(stack.pop() != '(')
				{
					postfix = postfix +stack.pop();
				}
			}
			else
			{
				postfix=postfix+c;
			}
		}
		while(!stack.isEmpty())
		{
			postfix=postfix+stack.pop();
		}
		return postfix;
	}
	private static int precedence(char c) {
		switch(c)
		{
			case '*':
			case '/':
				return 2;
			case '+':
			case '-':
				return 1;
		}
		return 0;
	}

}
