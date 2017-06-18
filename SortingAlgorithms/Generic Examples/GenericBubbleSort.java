/**
 * GenericBubbleSort
 * @author Luke McCann
 *
 */
public class GenericBubbleSort <T extends Comparable<T>> {

	public static void main(String[] args)
	{
		
	}
	
	public <T> void sort(T[] arr)
	{
		for(int i = 0; i < arr.length-1; i++) // iterate the array
		{
			for(int j = 0; j < arr.length-1; j++) // iterate the pointer
			{
				if(((Comparable<T>) arr[j]).compareTo(arr[j+1]) > 0) // if the current element is greater than the next element
				{                                                    // if you change "<" to ">" you can reverse the order of the sort
					T temp = arr[j];  // swap the elements
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}