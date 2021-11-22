public class PopulationProjection 
{
	private float birthRatePerSecond;
	private float deathRatePerSecond;
	private float immigrationRatePerSecond;
	private long startingPopulation;
	
	public PopulationProjection()
	{
		birthRatePerSecond = 0F;
		deathRatePerSecond = 0F;
		immigrationRatePerSecond = 0F;
		startingPopulation = 0L;
	}
	
	public PopulationProjection(float birthRatePerSecond, float deathRatePerSecond, 
			float immigrationRatePerSecond, long startingPopulation)
	{
		this.startingPopulation = startingPopulation;
		this.birthRatePerSecond = birthRatePerSecond;
		this.deathRatePerSecond = deathRatePerSecond;
		this.immigrationRatePerSecond = immigrationRatePerSecond;
	}
	
	public long getPopulationAfterYears(int numberOfYears)
	{	
		long numberOfSeconds = numberOfYears*365*24*60*60;
		
		long result = (long)(startingPopulation + (birthRatePerSecond * numberOfSeconds) - 
				(deathRatePerSecond * numberOfSeconds) + 
				(immigrationRatePerSecond * numberOfSeconds));
		
		if(result < 0)
			return 0;
		
		return result;
	}

	public float getBirthRatePerSecond() 
	{
		return birthRatePerSecond;
	}

	public float getDeathRatePerSecond() 
	{
		return deathRatePerSecond;
	}

	public float getImmigrationRatePerSecond() 
	{
		return immigrationRatePerSecond;
	}

	public long getStartingPopulation() 
	{
		return startingPopulation;
	}

	public void setBirthRatePerSecond(float birthRatePerSecond) 
	{
		this.birthRatePerSecond = birthRatePerSecond;
	}

	public void setDeathRatePerSecond(float deathRatePerSecond) 
	{
		this.deathRatePerSecond = deathRatePerSecond;
	}

	public void setImmigrationRatePerSecond(float immigrationRatePerSecond) 
	{
		this.immigrationRatePerSecond = immigrationRatePerSecond;
	}

	public void setStartingPopulation(long startingPopulation) 
	{
		this.startingPopulation = startingPopulation;
	}
}
