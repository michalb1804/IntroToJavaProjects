public class MathConstant 
{
	public static double pi(int precision)
	{
		if(precision <= 0)
		{
			System.out.println("Precision cannot be negative or equal to 0!");
			return -1;
		}
		
		double accumulator = 0;
		
		for(int i = 1; i <= precision; i++)
		{
			accumulator += Math.pow(-1, i + 1) / ((2 * i) - 1);
		}
		
		return 4 * accumulator;
	}
	
	public static double e(int precision)
	{
		if(precision <= 0)
		{
			System.out.println("Precision cannot be negative or equal to 0!");
			return -1;
		}
		
		double accumulator = 0;
		
		for(int i = 1; i <= precision; i++)
		{
			if(i >= 34)
			{
				System.out.println("Reached maximal possible precision. Max precision is 33.");
				break;
			}
			accumulator += 1.0 / factorial(i);
		}
		
		return accumulator;
	}
	
	private static int factorial(int number)
	{
		int result = 1;
		
		for(int i = 2; i <= number; i++)
		{
			result *= i;
		}
		
		return result;
	}
}
