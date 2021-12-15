public class Stack<T extends Object>
{
	private int CAPACITY;
	
	private T[] stack;
	private int topIndex;
	
	@SuppressWarnings("unchecked")
	public Stack()
	{
		CAPACITY = 10;
		
		stack = (T[]) new Object[CAPACITY];
		
		topIndex = -1;
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int CAPACITY)
	{
		this.CAPACITY = CAPACITY;
		
		stack = (T[]) new Object[CAPACITY];
		
		topIndex = -1;
	}
	
	public void push(T element)
	{
		if(!isFull())
		{
			stack[++topIndex] = element;
		}
		else
		{
			enlargeStack();
			
			stack[++topIndex] = element;
		}
	}
	
	public T pop() throws Exception
	{
		if(((double)topIndex / CAPACITY) < 0.5 && CAPACITY > 5)
		{
			reduceStack();
		}
		
		if(!isEmpty())
		{
			return stack[topIndex--];
		}
		else
			throw new Exception("The stack is empty!");
	}
	
	public T peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("The stack is empty!");
		else
			return stack[topIndex];
	}
	
	public boolean isEmpty()
	{
		if(topIndex == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(topIndex == CAPACITY - 1)
			return true;
		else
			return false;
	}
	
	public int getSize()
	{
		return topIndex + 1;
	}
	
	public int getCapacity()
	{
		return CAPACITY;
	}
	
	@SuppressWarnings("unchecked")
	private void enlargeStack()
	{
		int newStackSize = CAPACITY * 2;
		
		T[] tempStack = (T[]) new Object[newStackSize];
		
		for(int i = 0; i < CAPACITY; i++)
		{
			tempStack[i] = stack[i];
		}
		
		stack = tempStack;
		
		CAPACITY = newStackSize;
	}
	
	@SuppressWarnings("unchecked")
	private void reduceStack()
	{
		int newStackSize = CAPACITY / 2;
		
		T[] tempStack = (T[]) new Object[newStackSize];
		
		for(int i = 0; i < CAPACITY / 2; i++)
		{
			tempStack[i] = stack[i];
		}
		
		stack = tempStack;
		
		CAPACITY = newStackSize;
	}
	
	@Override
	public String toString()
	{
		return String.format("Current capacity: %5d\t\tCurrent size: %5d", getCapacity(), getSize());
	}
}
