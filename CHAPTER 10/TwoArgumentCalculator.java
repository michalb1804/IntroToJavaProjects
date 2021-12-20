public class TwoArgumentCalculator 
{
	public static void performAction(String s) throws Exception
	{
		String[] splitted = s.split(" ");
		
		if(Character.isDigit(splitted[0].charAt(0)))
		{
			if(splitted.length != 3)
				throw new Exception("You've forgotten about spaces. The format should be: a x b");
				
			switch(splitted[1].charAt(0))
			{
			case '+':
				System.out.println(splitted[0] + " " + splitted[1] + " " + splitted[2] +
						" = " + (Double.parseDouble(splitted[0]) + Double.parseDouble(splitted[2])));
				break;
			case '-':
				System.out.println(splitted[0] + " " + splitted[1] + " " + splitted[2] +
						" = " + (Double.parseDouble(splitted[0]) - Double.parseDouble(splitted[2])));
				break;
			case '*':
				System.out.println(splitted[0] + " " + splitted[1] + " " + splitted[2] +
						" = " + (Double.parseDouble(splitted[0]) * Double.parseDouble(splitted[2])));
				break;
			case '/':
				System.out.println(splitted[0] + " " + splitted[1] + " " + splitted[2] +
						" = " + (Double.parseDouble(splitted[0]) / Double.parseDouble(splitted[2])));
				break;
			}
		}
		else
			throw new Exception("Invalid format.");
	}
}
