public class QuadraticEquation 
{
	public static float[] solve(float factorA, float factorB, float factorC)
	{
		//MEANING: {DELTA, X1, X2}
		float[] results = {0, 0, 0};
		
		results[0] = (float)Math.pow(factorB, 2) - 4*factorA*factorC;
		
		if(results[0] < 0)
		{
			System.out.println("Delta is negative. No roots.");
			System.out.println("Delta = " + results[0]);
			return results;
		}
		else if(results[0] == 0)
		{
			System.out.println("Delta is equal to 0. One root exist.");
			System.out.println("Delta = " + results[0]);
			results[1] = (- factorB) / (2 * factorA);
			results[2] = results[1];
			System.out.println("x = " + results[1]);
			return results;
		}
		else
		{
			System.out.println("Delta is positive. Two roots exist.");
			System.out.println("Delta = " + results[0]);
			results[1] = ((- factorB) + (float)Math.sqrt(results[0])) / (2 * factorA);
			results[2] = ((- factorB) - (float)Math.sqrt(results[0])) / (2 * factorA);
			System.out.println("x1 = " + results[1]);
			System.out.println("x2 = " + results[2]);
			return results;
		}
	}
}
