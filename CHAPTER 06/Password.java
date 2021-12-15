public class Password 
{
	private String password;
	private int digits;
	
	public Password()
	{
		password = "";
		digits = 0;
	}
	
	public Password(String password)
	{
		this.password = password;
		analyzePassword();
	}
	
	public boolean checkPassword()
	{
		//RULES: AT LEAST 8 CHARACTERS, ONLY LETTERS AND DIGITS, AT LEAST TWO DIGITS
		
		if((password.length() >= 8) && (areOnlyLettersOrDigits() == true) && (digits >= 2))
		{
			System.out.println("Valid password");
			return true;
		}
		else
		{
			System.out.println("Invalid password");
			return false;
		}
	}
	
	private boolean areOnlyLettersOrDigits()
	{
		digits = 0;
		
		for(int i = 0; i < password.length(); i++)
		{
			if(!Character.isLetterOrDigit(password.charAt(i)))
				return false;
		}
		
		analyzePassword();
		
		return true;
	}
	
	private void analyzePassword()
	{
		digits = 0;
		
		for(int i = 0; i < password.length(); i++)
		{
			if(Character.isDigit(password.charAt(i)))
				digits++;
		}
	}
	
	public void setPassword(String password)
	{
		this.password = password;
		analyzePassword();
	}
}
