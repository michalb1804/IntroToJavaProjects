public class RegularPolygon 
{
	public static double computeArea(int numberOfSides, double lengthOfSide)
	{
		if(numberOfSides <= 2)
			throw new IllegalArgumentException("There must me at least 3 sides");
		
		if(lengthOfSide <= 0)
			throw new IllegalArgumentException("Length must be greater than 0");
		
		return (numberOfSides * Math.pow(lengthOfSide, 2)) / 
				(4 * Math.tan(Math.PI / numberOfSides));
	}
}
