package datastructures.doublestack.singlearray;

import java.util.Scanner;

public class StackApp {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of stack:");
		int stackSize = scan.nextInt();
		DoubleSideStack stack = new DoubleSideStack(stackSize);
		while(true)
		{
			System.out.println("Do u want to push1(0)/pop1(1)/display1(2)/push2(3)/pop2(4)/display2(5)?");
			int choice = scan.nextInt();
			
			if (choice == 1)
			{
				stack.pop1();
			}
			else if (choice == 0)
			{
				System.out.println("Enter value to push:");
				stack.push1(scan.nextInt());
			}
			else if (choice == 2)
			{
				stack.display1();
			}
			else if (choice == 4)
			{
				stack.pop2();
			}
			else if (choice == 3)
			{
				System.out.println("Enter value to push:");
				stack.push2(scan.nextInt());
			}
			else if (choice == 5)
			{
				stack.display2();
			}
			else
			{
				break;
			}
		}
		scan.close();
	}

}
