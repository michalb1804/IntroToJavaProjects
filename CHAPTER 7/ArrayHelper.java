public class ArrayHelper 
{
	public static void reverse(int[] array)
	{
		for(int i = 0; i < array.length / 2; i++)
		{
			swap(array, i, array.length - 1 - i);
		}
	}
	
	public static boolean isSortedIncreasingly(int[] array)
	{
		for(int i = 0; i < array.length - 1; i++)
		{
			if(array[i] > array[i + 1])
				return false;
		}
		
		return true;
	}
	
	private static void swap(int[] array, int a, int b)
	{
		int tempValue = 0;
		tempValue = array[a];
		array[a] = array[b];
		array[b] = tempValue;
	}
}
