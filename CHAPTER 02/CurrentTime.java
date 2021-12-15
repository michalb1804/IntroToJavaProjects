public class CurrentTime 
{
	private int second;
	private int minute;
	private int hour;
	
	public CurrentTime()
	{
		second = 0;
		minute = 0;
		hour = 0;
		
		calculateTime();
	}
	
	public void calculateTime()
	{
		long currentMilis = System.currentTimeMillis();
		
		second = (int)((currentMilis / 1000) % 60);
		minute = (int)((currentMilis / 60000) % 60);
		hour = (int)((currentMilis / 3600000) % 24);
	}
	
	@Override
	public String toString()
	{
		return "ACTUAL TIME: \t" + 
				((hour < 10) ? ("0" + Integer.toString(hour)) : Integer.toString(hour)) + 
				":" + ((minute < 10) ? ("0" + Integer.toString(minute)) : Integer.toString(minute)) + 
				":" + ((second < 10) ? ("0" + Integer.toString(second)) : Integer.toString(second));
	}

	public int getSecond() 
	{
		return second;
	}

	public int getMinute() 
	{
		return minute;
	}

	public int getHour() 
	{
		return hour;
	}
}
