public class PalindromicPrime 
{
	public static void printFirstHundred()
	{
		System.out.println("FIRST HUNDRED OF PALINDROMIC PRIMES: ");
		
		int counter = 0;
		int number = 2;
		boolean isPrime = true;
		boolean isPalindrome = true;
		
		String numberToString = "";
		
		while(counter < 100)
		{
			for(int i = 2; i < number; i++)
			{
				if(number % i == 0)
				{
					isPrime = false;
					break;
				}
				else
					isPrime = true;
			}
			
			numberToString = "" + number;
			
			if(isPrime)
			{
				for(int i = 0; i < (numberToString.length() / 2); i++)
				{
					if(numberToString.charAt(i) != numberToString.charAt(numberToString.length() - 1 - i))
					{
						isPalindrome = false;
						break;
					}
					else
						isPalindrome = true;
				}
			}
			
			if(isPrime && isPalindrome)
			{
				if(counter % 10 == 0)
					System.out.println();
				
				System.out.printf("%-8d", number);
				counter++;
			}
			
			number++;
		}
	}
}
