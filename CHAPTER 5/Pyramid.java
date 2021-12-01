public class Pyramid 
{
	public static void display(int depth)
	{
		for(int i = 0; i < depth; i++)
		{
			for(int j = 0; j < depth - i - 1; j++)
				System.out.print("    ");
			
			for(int j = 0; j < i; j++)
			{
				System.out.printf("%4d", (i + 1 - j));
			}
			
			for(int j = depth; j <= depth + i; j++)
			{
				System.out.printf("%4d", (j - depth + 1));
			}
			
			System.out.println();
		}
	}
}
