public class NumberSystem 
{
	public static String decimalToHexadecimal(int decimal)
	{
		String result = "";
		int number = decimal;
		
		while(number != 0)
		{
			result += decToHexa(number % 16);
			number = number / 16;
		}
		
		result = reverseString(result);
		
		return result;
	}
	
	private static char decToHexa(int decimal)
	{
		if(decimal <= 9)
			return (char)(48 + decimal);
		else
			return (char)(65 + (decimal % 10));
	}
	
	private static String reverseString(String string)
	{
		String tempString = "";
		
		for(int i = 0; i < string.length(); i++)
			tempString += string.charAt(string.length() - 1 - i);
		
		return tempString;
	}
}
