package queues.array;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		System.out.println("Enter queue size:");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		QueueIntArray queue = new QueueIntArray(size);
		while(true)
		{
			System.out.println("Do u want to enqueue/dequeue/front/rear/display[0/1/2/3/4]");
			int option = scan.nextInt();
			if(option == 0)
			{
				if(!queue.isFull())
				{
					System.out.println("enter value:");
					queue.enqueue(scan.nextInt());
				}
				else
				{
					System.out.println("Queue is full!!! cannot enqueue");
				}
			}
			else if(option == 1)
			{
				if(!queue.isEmpty())
				{
					System.out.println(queue.dequeue());
				}
				else
				{
					System.out.println("Queue is empty!!! nothing to enqueue");
				}
			}
			else if(option == 2)
			{
				if(!queue.isEmpty())
				{
					System.out.println(queue.front());
				}
			}
			else if(option == 3)
			{
				if(!queue.isEmpty())
				{
					System.out.println(queue.rear());
				}
			}
			else if(option == 4)
			{
				if(!queue.isEmpty())
				{
					queue.display();
				}
			}
			else
				break;
		}
		scan.close();
	}

}
