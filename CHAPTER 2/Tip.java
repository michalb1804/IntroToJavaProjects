public class Tip 
{
	private static float[] results = new float[2];
	
	public static float[] calculate(float subtotal, int gratuityRate)
	{
		results[0] = subtotal * (gratuityRate/100.0F);
		results[1] = subtotal + results[0];
		
		return results;
	}
}
