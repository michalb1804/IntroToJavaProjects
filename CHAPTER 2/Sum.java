//SUM OF DIGITS IN NUMBER

public class Sum 
{
	public static int digits(int number)
	{
		int tempNumber = number;
		
		int sum = 0;
		
		int numberOfDigits = 0;
		
		while(tempNumber != 0)
		{
			numberOfDigits++;
			tempNumber /= 10;
		}
		
		tempNumber = number;
		
		for(int i = 0; i < numberOfDigits; i++)
		{
			sum += tempNumber % 10;
			tempNumber /= 10;
		}
		
		return sum;
	}
}
