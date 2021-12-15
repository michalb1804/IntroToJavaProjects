public class Queue<T extends Object>
{
	private int CAPACITY;
	
	private T[] queue;
	
	private int size;
	
	@SuppressWarnings("unchecked")
	public Queue()
	{
		CAPACITY = 10;
		
		queue = (T[]) new Object[CAPACITY];
		
		size = -1;
	}
	
	@SuppressWarnings("unchecked")
	public Queue(int CAPACITY)
	{
		this.CAPACITY = CAPACITY;
		
		queue = (T[]) new Object[CAPACITY];
		
		size = -1;
	}
	
	public void enqueue(T element)
	{
		if(!isFull())
		{
			queue[++size] = element;
		}
		else
		{
			enlargeQueue();
			
			queue[++size] = element;
		}
	}
	
	public T dequeue() throws Exception
	{
		if(((double)size / CAPACITY) < 0.5 && CAPACITY > 5)
		{
			reduceQueue();
		}
		
		if(!isEmpty())
		{
			T element = queue[0];
			replaceElements();
			size--;
			return element;
		}
		else
			throw new Exception("The queue is empty!");
	}
	
	public T peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("The queue is empty!");
		else
			return queue[0];
	}
	
	public boolean isEmpty()
	{
		if(size == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(size == CAPACITY - 1)
			return true;
		else
			return false;
	}
	
	public int getSize()
	{
		return size + 1;
	}
	
	public int getCapacity()
	{
		return CAPACITY;
	}
	
	private void replaceElements()
	{
		for(int i = 0; i < CAPACITY - 1; i++)
		{
			queue[i] = queue[i + 1];
		}
	}
	
	@SuppressWarnings("unchecked")
	private void enlargeQueue()
	{
		int newQueueSize = CAPACITY * 2;
		
		T[] tempQueue = (T[]) new Object[newQueueSize];
		
		for(int i = 0; i < CAPACITY; i++)
		{
			tempQueue[i] = queue[i];
		}
		
		queue = tempQueue;
		
		CAPACITY = newQueueSize;
	}
	
	@SuppressWarnings("unchecked")
	private void reduceQueue()
	{
		int newQueueSize = CAPACITY / 2;
		
		T[] tempQueue = (T[]) new Object[newQueueSize];
		
		for(int i = 0; i < CAPACITY / 2; i++)
		{
			tempQueue[i] = queue[i];
		}
		
		queue = tempQueue;
		
		CAPACITY = newQueueSize;
	}
	
	@Override
	public String toString()
	{
		return String.format("Current capacity: %5d\t\tCurrent size: %5d", getCapacity(), getSize());
	}
}
