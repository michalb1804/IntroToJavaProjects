public class MersennePrime 
{
	public static void printFirstSeven()
	{
		System.out.println("FIRST SEVEN MERSENNE PRIMES: ");
		
		int counter = 0;
		int p = 2;
		
		int value = 0;
		boolean isPrime = true;
		
		while(counter < 7)
		{
			value = (int)Math.pow(2, p) - 1;
			
			for(int i = 2; i < value; i++)
			{
				if(value % i == 0)
				{
					isPrime = false;
					break;
				}
				else
					isPrime = true;
			}
			
			if(isPrime)
			{
				System.out.printf("%-8d", value);
				counter++;
			}
			
			p++;
		}
	}
}
