public class SelectionSort 
{
	public static void sort(int[] array)
	{
		int startIndex = 0;
		int minIndex = 0;
		
		while(startIndex < array.length)
		{
			for(int i = startIndex; i < array.length; i++)
			{
				if(array[i] < array[minIndex])
				{
					minIndex = i;
				}
			}
			
			swap(array, startIndex, minIndex);
			
			startIndex++;
			minIndex = array.length-1;
		}
	}
	
	private static void swap(int[] array, int a, int b)
	{
		int tempValue = 0;
		
		tempValue = array[a];
		array[a] = array[b];
		array[b] = tempValue;
	}
}
