package datastructures.stack.array;

import java.util.Scanner;

public class StackApp {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of stack:");
		int stackSize = scan.nextInt();
		Stack stack = new Stack(stackSize);
		while(true)
		{
			System.out.println("Do u want to push/pop/display [0/1/2]?");
			int choice = scan.nextInt();
			
			if (choice == 1)
			{
				stack.pop();
			}
			else if (choice == 0)
			{
				System.out.println("Enter value to push:");
				stack.push(scan.nextInt());
			}
			else if (choice == 2)
			{
				stack.display();
			}
			else
			{
				break;
			}
		}
		scan.close();
	}

}
