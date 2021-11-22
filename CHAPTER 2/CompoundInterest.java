public class CompoundInterest 
{
	public static float calculateAfterYears(float startingValue, float annualInterestRate, int years)
	{
		float multiplicationFactor = 1;
		
		for(int i = 0; i < years; i++)
		{
			multiplicationFactor *= (1 + annualInterestRate/100.0F);
		}
		
		return startingValue * multiplicationFactor;
	}
}
