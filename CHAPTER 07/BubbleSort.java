public class BubbleSort 
{
	public static void sort(int[] array)
	{
		int length = array.length;
		
		do
		{
			for(int i = 0; i < length - 1; i++)
			{
				if(array[i] > array[i + 1])
					swap(array, i, i+1);
			}
			
			length -= 1;
		} while (length > 1);
	}
	
	private static void swap(int[] array, int a, int b)
	{
		int tempValue = 0;
		
		tempValue = array[a];
		array[a] = array[b];
		array[b] = tempValue;
	}
}
