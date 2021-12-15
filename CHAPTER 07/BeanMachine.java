import java.util.Random;

public class BeanMachine 
{
	private int slots[];
	private int noOfBalls;
	private Random random;
	
	public BeanMachine()
	{
		slots = new int[1];
		noOfBalls = 0;
		random = new Random();
	}
	
	public BeanMachine(int noOfBalls, int noOfSlots)
	{
		this.noOfBalls = noOfBalls;
		this.slots = new int[noOfSlots];
		random = new Random();
	}
	
	public void simulate()
	{
		eraseSlots();
		
		System.out.println("SIMULATION RESULTS: ");
		System.out.println("--------------------");
		
		int rights = 0;
		
		//RANDOM: 0 - LEFT, 1 - RIGHT
		for(int i = 0; i < noOfBalls; i++)
		{
			for(int j = 0; j < slots.length - 1; j++)
			{
				if(random.nextInt(2) == 0)
				{
					System.out.print("L");
				}
				else
				{
					System.out.print("R");
					rights++;
				}
			}
			
			slots[rights]++;
			rights = 0;
			
			System.out.println();
		}
		
		System.out.println();
		
		visualize();
	}
	
	private void visualize()
	{
		for(int i = findMaxBalls(); i > 0; i--)
		{
			for(int j = 0; j < slots.length; j++)
			{
				if(i <= slots[j])
					System.out.print("O ");
				else
					System.out.print("  ");
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < slots.length; i++)
		{
			System.out.print(i + " ");
		}
	}
	
	private void eraseSlots()
	{
		for(int i = 0; i < slots.length; i++)
		{
			slots[i] = 0;
		}
	}
	
	private int findMaxBalls()
	{
		int maxNoOfBalls = 0;
		
		for(int i = 0; i < slots.length; i++)
		{
			if(slots[i] > maxNoOfBalls)
				maxNoOfBalls = slots[i];
		}
		
		return maxNoOfBalls;
	}
	
	public void setNoOfBalls(int noOfBalls)
	{
		this.noOfBalls = noOfBalls;
	}
	
	public void setNoOfSlots(int noOfSlots)
	{
		slots = new int[noOfSlots];
	}
}
