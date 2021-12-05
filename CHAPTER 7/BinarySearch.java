import java.util.Arrays;

public class BinarySearch
{
	public static int onArray(int[] array, int element)
	{
		Arrays.sort(array);
		
		int startingIndex = 0;
		int endingIndex = array.length - 1;
		int prevMiddle = 0;
		int middle = (array.length - 1) / 2;
		boolean found = false;
		
		while(!found)
		{
			if(array[middle] == element)
			{
				System.out.println("Element found on position: " + middle);
				found = true;
			}
			else if(prevMiddle == middle)
			{
				break;
			}
			else if(element < array[middle])
			{
				endingIndex = middle - 1;
				prevMiddle = middle;
				middle = (startingIndex + endingIndex) / 2;
			}
			else
			{
				startingIndex = middle + 1;
				prevMiddle = middle;
				middle = (startingIndex + endingIndex) / 2;
			}
		}
		
		if(middle == 0 && array[0] == element)
		{
			System.out.println("Element found on position: " + middle);
			found = true;
		}
		
		if(middle == array.length - 1 && array[array.length - 1] == element)
		{
			System.out.println("Element found on position: " + middle);
			found = true;
		}
		
		if(!found)
			System.out.println("Element not found!");
		
		return middle;
	}
}
