public class Factors 
{
	public static int[] get(int number)
	{
		int[] factors = new int[50];
		int factorsIndex = 0;
		int tempNumber = number;
		
		while(tempNumber != 1)
		{
			for(int i = 2; i <= tempNumber; i++)
			{
				if(tempNumber % i == 0)
				{
					factors[factorsIndex] = i;
					factorsIndex++;
					break;
				}
				
				if(tempNumber % i == 0)
					break;
			}
			
			tempNumber /= factors[factorsIndex-1];
		}
		
		System.out.println("Factors of " + number + ": ");
		
		for(int i = 0; i < factorsIndex; i++)
			System.out.print(factors[i] + " ");
		
		return factors;
	}
}
