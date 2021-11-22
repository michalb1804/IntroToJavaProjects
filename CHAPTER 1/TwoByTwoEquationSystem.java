//USING CRAMER'S RULE

//EQUATION SYSTEM:
//ax + by = e
//cx + dy = f

public class TwoByTwoEquationSystem
{
	private float[] factors;
	private float[] values;
	
	private float computedX;
	private float computedY;
	
	public TwoByTwoEquationSystem()
	{
		factors = new float[4];
		values = new float[2];
		
		computedX = 0F;
		computedY = 0F;
	}
	
	public TwoByTwoEquationSystem(float factorA, float factorB, float factorC, 
			float factorD, float valueE, float valueF)
	{
		factors = new float[4];
		values = new float[2];
		
		factors[0] = factorA;
		factors[1] = factorB;
		factors[2] = factorC;
		factors[3] = factorD;
		
		values[0] = valueE;
		values[1] = valueF;
		
		computedX = computeX();
		computedY = computeY();
	}
	
	public float computeX()
	{
		return (values[0] * factors[3] - factors[1] * values[1])/(factors[0] * factors[3] - factors[1] * factors[2]);
	}
	
	public float computeY()
	{
		return (values[1] * factors[0] - factors[2] * values[0])/(factors[0] * factors[3] - factors[1] * factors[2]);
	}
	
	public void printXY()
	{
		System.out.printf("X = %.3f\nY = %.3f", computedX, computedY);
	}
	
	@Override
	public String toString()
	{
		String concatenated = "SYSTEM OF EQUATIONS: \n";
		
		for(int i = 0; i < 4; i++)
		{
			concatenated += String.valueOf(Math.abs(factors[i]));
			
			if(i == 0 || i == 2)
				concatenated += "x ";
			else if(i == 1)
				concatenated += "y = " + String.valueOf(values[0]) + "\n";
			else
				concatenated += "y = " + String.valueOf(values[1]) + "\n";
			
			if(i + 1 < 4 && i != 1)
			{
				if(factors[i + 1] < 0)
					concatenated += "- ";
				else
					concatenated += "+ ";
			}
		}
		
		return concatenated;
	}

	public float getComputedX() 
	{
		return computedX;
	}

	public float getComputedY() 
	{
		return computedY;
	}
}
