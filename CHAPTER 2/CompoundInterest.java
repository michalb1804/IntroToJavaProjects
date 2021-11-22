public class CompoundInterest 
{
	public static float calculateAfterYears(float startingValue, float annualInterestRate, int years)
	{
		float multiplicationFactor = 1;
		
		for(int i = 0; i < years; i++)
		{
			multiplicationFactor *= (1 + annualInterestRate / 100.0F);
		}
		
		return startingValue * multiplicationFactor;
	}
	
	public static float calculateAfterMonths(float startingValue, float annualInterestRate, int months)
	{
		float multiplicationFactor = 1;
		
		for(int i = 0; i < months; i++)
		{
			multiplicationFactor *= (1 + (annualInterestRate / 12.0F) / 100.0F);
		}
		
		return startingValue * multiplicationFactor;
	}
	
	public static float calculateAfterDays(float startingValue, float annualInterestRate, int days)
	{
		float multiplicationFactor = 1;
		
		for(int i = 0; i < days; i++)
		{
			multiplicationFactor *= (1 + (annualInterestRate / 365.0F) / 100.0F);
		}
		
		return startingValue * multiplicationFactor;
	}
}
