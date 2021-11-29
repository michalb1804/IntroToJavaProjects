public class Circle 
{
	private float centerX;
	private float centerY;
	private float radius;
	
	public Circle()
	{
		centerX = 0;
		centerY = 0;
		radius = 0;
	}
	
	public Circle(float centerX, float centerY, float radius)
	{
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
	}
	
	public boolean isPointWithinCircle(float pointX, float pointY)
	{
		if(getDistance(pointX, pointY) < radius)
			return true;
		
		return false;
	}
	
	private float getDistance(float pointX, float pointY)
	{
		return (float)Math.sqrt(Math.pow((pointX - centerX), 2) + 
				Math.pow((pointY - centerY), 2));
	}
}
