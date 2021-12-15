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
	
	public static int[] mergeSorted(int[] array1, int[] array2)
	{
		int[] arrayMerged = new int[array1.length + array2.length];
		int counter = 0;
		
		if(compareLength(array1, array2) == -1 || compareLength(array1, array2) == 0)
		{
			for(int i = 0; i < array2.length; i++)
			{
				arrayMerged[counter] = array1[i];
				counter++;
				
				arrayMerged[counter] = array2[i];
				counter++;
			}
			
			for(int i = array2.length; i < array1.length; i++)
			{
				arrayMerged[counter] = array1[i];
				counter++;
			}
		}
		else
		{
			for(int i = 0; i < array1.length; i++)
			{
				arrayMerged[counter] = array1[i];
				counter++;
				
				arrayMerged[counter] = array2[i];
				counter++;
			}
			
			for(int i = array1.length; i < array2.length; i++)
			{
				arrayMerged[counter] = array2[i];
				counter++;
			}
		}
		
		SelectionSort.sort(arrayMerged);
		
		return arrayMerged;
	}
	
	public static int[][] partition(int[] array, int pivotIndex)
	{
		int[][] arrays = new int[2][];
		
		int[] lessThanPivotTemp = new int[array.length - 1];
		int[] greaterThanPivotTemp = new int[array.length - 1];
		int counterLess = 0;
		int counterGreater = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] < array[pivotIndex])
			{
				lessThanPivotTemp[counterLess] = array[i];
				counterLess++;
			}
			else if(array[i] > array[pivotIndex])
			{
				greaterThanPivotTemp[counterGreater] = array[i];
				counterGreater++;
			}
		}
		
		int[] lessThanPivot = new int[counterLess];
		int[] greaterThanPivot = new int[counterGreater];
		
		System.arraycopy(lessThanPivotTemp, 0, lessThanPivot, 0, counterLess);
		System.arraycopy(greaterThanPivotTemp, 0, greaterThanPivot, 0, counterGreater);
		
		arrays[0] = lessThanPivot;
		arrays[1] = greaterThanPivot;
		
		return arrays;
	}
	
	public static int compareLength(int[] array1, int[] array2)
	{
		if(array1.length > array2.length)
			return -1;
		else if(array1.length < array2.length)
			return 1;
		else
			return 0;
	}
	
	private static void swap(int[] array, int a, int b)
	{
		int tempValue = 0;
		tempValue = array[a];
		array[a] = array[b];
		array[b] = tempValue;
	}
}
