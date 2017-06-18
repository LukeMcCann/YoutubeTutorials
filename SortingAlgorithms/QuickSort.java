/**
 * @Author - Luke McCann - simple quicksort
**/
public class QuickSort {
	
	public static void main(String[] args)
	{
		// empty main method, this is not really needed, I only include it as convention.
	}
	
	public static void sort(int[] arr)
	{
		if(arr.length < 2) return;  // check that there are at least 2 elements in the array
		quicksort(arr, 0, arr.length-1);
	}
	
	private static void quicksort(int[] arr, int lo, int hi)
	{
		if(lo >= hi) return;
		
		int pivot = selectPivot(arr, lo, hi); // select the middle element as the pivot (I made a separate method to help your understanding of what is going on)
		partition(arr, pivot, lo, hi);  // partition the array
	}
	
	/**
	 * Partitions the array into two sub-arrays
	 * @param arr - array to partition
	 * @param pivot - the selected pivot value
	 * @param lo- lowest value (left value)
	 * @param hi - highest value (right value)
	 */
	private static void partition(int[] arr, int pivot, int lo, int hi)
	{
		int i = lo, j = hi;
		
		while(i <= j) // while left value is less than or equal to right value
		{
			while(arr[i] < pivot)  // if the current left element position is less than the pivot
			{
				i++; // move left pivot up one
			}
			
			while(arr[j] > pivot) // if the current right element position is greater than the pivot
			{
				j--; // move right pivot down one
			}
			
			if(i <= j) // if left is less than or equal to right value, swap the vaues
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++; j--;
			}
		}
		if(lo < j) quicksort(arr, lo, j); // run quicksort on right sub-array
		if(hi > i) quicksort(arr, i, hi); // run quicksort on left sub-array
	}
	
	/**
	 * Selects the middle value as the pivot
	 * @param arr - array to select from
	 * @param lo - lowest value (left value)
	 * @param hi - highest value (right value)
	 * @return pivot - the value of the pivot
	 */
	private static int selectPivot(int[] arr, int lo, int hi)
	{
		return arr[lo + (hi - lo) / 2];
	}

}
