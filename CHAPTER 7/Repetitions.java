public class Repetitions 
{
	public static int[] delete(int[] array)
	{
		int[] distinct = new int[array.length];
		
		for(int i = 0; i < distinct.length; i++)
		{
			distinct[i] = Integer.MAX_VALUE;
		}
		
		int distinctIndex = 0;
		boolean foundDuplicate = false;
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < distinct.length; j++)
			{
				if(array[i] == distinct[j])
				{
					foundDuplicate = true;
					break;
				}
			}
			
			if(!foundDuplicate)
			{
				distinct[distinctIndex] = array[i];
				distinctIndex++;
			}
			
			foundDuplicate = false;
		}
		
		int[] results = new int[distinctIndex];
		
		System.arraycopy(distinct, 0, results, 0, results.length);
		
		return results;
	}
}
