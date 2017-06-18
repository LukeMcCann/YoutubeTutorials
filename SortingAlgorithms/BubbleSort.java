/**
 * BubbleSort is a very simple implementation
 * @author Luke McCann
 *
 */
public class BubbleSort {

	public static void main(String[] args)
	{
		
	}
	
	public void sort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++) // iterate the array
		{
			for(int j = 0; j < arr.length-1; j++) // iterate the pointer
			{
				if(arr[j] > arr[j+1]) // if the current element is greater than the next element
				{
					int temp = arr[j];  // swap the elements
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
