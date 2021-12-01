public class GreatestCommonDivisior 
{
	public static int compute(int val1, int val2)
	{
		int minimalValue = Math.min(val1, val2);
		int commonDivisior = 1;
		
		for(int i = 2; i <= minimalValue; i++)
			if((val1 % i == 0) &&(val2 % i == 0))
				commonDivisior = i;
		
		System.out.println("Greatest common divisior of (" + val1 + ", " + 
							val2 + ") is " + commonDivisior);
		
		return commonDivisior;
	}
}
