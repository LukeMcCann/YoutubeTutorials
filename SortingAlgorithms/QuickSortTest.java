/**
 * @Author - Luke McCann - simple generic quicksorttest
**/
import static org.junit.Assert.*;

import org.junit.Test;
 // this test has been adapted for the generic quick sort to demonstrate how
 // to change your own test method to test the generic version of QuickSort
public class QuicksortTest {

	QuickSort<Integer> qs = new QuickSort<Integer>();
	
	Integer[] arr = {0,44,3,2,1,4,6,8,8,5,6,0,9,3,2};
	
	@Test
	public void test() {
		qs.sort(arr);
		
		print(arr);
	}
	
	private void print(Integer[] arr2)
	{
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		assertCorrect();
	}
	
	private void assertCorrect()
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			assert arr[i] <= arr[i+1];
		}
	}
}
