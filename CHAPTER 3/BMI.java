public class BMI 
{
	public static float compute(float weight, float height)
	{
		//INPUT: WEIGHT IN KG, HEIGHT IN CM
		float BMI = 0;
		
		BMI = weight / (float)Math.pow((height/100), 2);
		
		System.out.printf("Your BMI is equal to %.2f%n", BMI);
		
		interpret(BMI);
		
		return BMI;
	}
	
	private static void interpret(float BMI)
	{
		if(BMI < 18.5)
			System.out.println("You are underweight");
		else if(BMI >= 18.5 && BMI < 25)
			System.out.println("Your BMI is good");
		else if(BMI >= 25 && BMI < 30)
			System.out.println("You are overweight");
		else
			System.out.println("You are obese");
	}
}
