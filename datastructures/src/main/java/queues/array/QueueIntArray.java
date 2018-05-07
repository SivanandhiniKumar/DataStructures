package queues.array;

public class QueueIntArray {
	int front,rear;
	int[] queue;
	int size,maxSize;

	public QueueIntArray(int size) {
		this.maxSize = size;
		queue = new int[this.maxSize];
		front = this.size = 0;
		rear = -1;
	}
	
	boolean isEmpty()
	{
		return (size == 0);
	}
	
	boolean isFull()
	{
		return (size == maxSize);
	}
	
	void enqueue(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is full!!! cannot enqueue");
		}
		else
		{
			rear = (rear+1)%maxSize;
			queue[rear] = value;
			size++;
		}
	}
	
	int dequeue()
	{
		int value = queue[front];
		front = (front+1)%maxSize;
		size--;
		return value;
	}
	
	int front()
	{
		return queue[front];
	}
	
	int rear()
	{
		return queue[rear];
	}

	void display()
	{
		for(int i=front; i<=size; i++)
		{
			System.out.println(queue[i%maxSize]);
		}
	}
}
