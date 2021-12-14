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
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				matrix[i][j] = scanner.nextDouble();
			}
		}
		
		System.out.println();
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
	
	public void print()
	{
		System.out.println("\nMATRIX PRINT: ");
		
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				System.out.printf("%-9.2f", matrix[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
	}
	
	public SquareMatrix sumMatrices(SquareMatrix matrix2) throws Exception
	{
		if(SIZE != matrix2.SIZE)
			throw new Exception("Sizes of matrices must be equal!");
		
		SquareMatrix resultMatrix = new SquareMatrix(SIZE);
		
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				(resultMatrix.getMatrix())[i][j] = matrix[i][j] + (matrix2.getMatrix())[i][j];
			}
		}
		
		return resultMatrix;
	}
	
	public SquareMatrix multiplyMatrices(SquareMatrix matrix2) throws Exception
	{
		if(SIZE != matrix2.SIZE)
			throw new Exception("Sizes of matrices must be equal!");
		
		SquareMatrix resultMatrix = new SquareMatrix(SIZE);
		
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				(resultMatrix.getMatrix())[i][j] = matrix[i][j] * (matrix2.getMatrix())[i][j];
			}
		}
		
		return resultMatrix;
	}
	
	public boolean isMarkovMatrix()
	{
		double[] sumOfColoumns = new double[SIZE];
		
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				if(matrix[i][j] <= 0)
					return false;
				
				sumOfColoumns[j] += matrix[i][j];
				
				if(sumOfColoumns[j] > 1)
					return false;
			}
		}
		
		for(int i = 0; i < SIZE; i++)
		{
			if(sumOfColoumns[i] != 1)
				return false;
		}
		
		return true;
	}
	
	public double[][] getMatrix()
	{
		return matrix;
	}
}
