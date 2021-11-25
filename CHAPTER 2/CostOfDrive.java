public class CostOfDrive 
{
	public static float calculate(float kilometres, float fuelUsagePer100km, 
			float priceFor1Litre)
	{
		return (kilometres / 100) * fuelUsagePer100km * priceFor1Litre;
	}
}
