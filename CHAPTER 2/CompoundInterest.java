public class CompoundInterest 
{
	public static float calculateAfterPeriod(float startingValue, float annualInterestRate, int periodOfTime, String mode)
	{
		float multiplicationFactor = 1;
		
		for(int i = 0; i < periodOfTime; i++)
		{
			if(mode.equals("Anually"))
				multiplicationFactor *= (1 + annualInterestRate / 100.0F);
			
			if(mode.equals("Monthly"))
				multiplicationFactor *= (1 + (annualInterestRate / 12.0F) / 100.0F);
			
			if(mode.equals("Daily"))
				multiplicationFactor *= (1 + (annualInterestRate / 365.0F) / 100.0F);
		}
		
		return startingValue * multiplicationFactor;
	}
}
