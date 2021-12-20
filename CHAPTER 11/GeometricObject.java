public class GeometricObject
{
	private String color;
	private boolean isFilled;
	
	public GeometricObject()
	{
		color = "white";
		isFilled = false;
	}
	
	public GeometricObject(String color, boolean isFilled)
	{
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public String toString()
	{
		return String.format("The color is: %-10sIs it filled: %-6s", color, isFilled);
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public boolean isFilled() 
	{
		return isFilled;
	}

	public void setFilled(boolean isFilled) 
	{
		this.isFilled = isFilled;
	}
}
