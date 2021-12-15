public class DayOfTheWeek 
{
	//OUTPUT: 0 - SATURDAY, 1 - SUNDAY ETC.
	//USING ZELLER'S CONGRUENCE
	public static int calculate(int y, int m, int dayOfTheMonth)
	{
		int year = y;
		int month = m;
		int dayOfMonth = dayOfTheMonth;
		int yearOfCentury = year % 100;
		int century = (year / 100);
		
		if(m == 1)
		{
			month = 13;
			year -= 1;
			yearOfCentury = year % 100;
			century = (year / 100);
		}
		else if(m == 2)
		{
			month = 14;
			year -= 1;
			yearOfCentury = year % 100;
			century = (year / 100);
		}
		
		int dayOfWeek = (dayOfMonth + ((26*(month + 1)) / 10) + yearOfCentury + 
				(yearOfCentury / 4) + (century / 4) + 5 * century) % 7;
		
		System.out.print(dayOfTheMonth + "-" + m + "-" + y + " is ");
		
		switch(dayOfWeek)
		{
		case 0:
			System.out.println("Saturday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		}
		
		return dayOfWeek;
	}
}
