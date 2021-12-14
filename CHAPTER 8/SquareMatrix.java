import java.util.Scanner;

public class SquareMatrix 
{
	private final int SIZE;
	private double[][] matrix;
	
	public SquareMatrix(int SIZE) throws Exception
	{
		if(SIZE <= 0)
			throw new Exception("Size must be a positive number!");
		
		this.SIZE = SIZE;
		matrix = new double[SIZE][SIZE];
	}
	
	public void keyboardFill()
	{
		System.out.println("FILL THE MATRIX: ");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				matrix[i][j] = scanner.nextDouble();
			}
		}
		
		System.out.println();
		
		scanner.close();
	}
	
	public double sumMajorDiagonal()
	{
		double sum = 0;
		
		for(int i = 0; i < SIZE; i++)
		{
			sum += matrix[i][i];
		}
		
		return sum;
	}
}
