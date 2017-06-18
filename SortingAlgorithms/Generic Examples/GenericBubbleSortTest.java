import static org.junit.Assert.*;

import org.junit.Test;

public class GenericBubbleSortTest {

	GenericBubbleSort gbs = new GenericBubbleSort();
	Integer[] arr = {0,2,2,3,4,45,21,2,1,7,0,9,8,5};
	
	@Test
	public void test() {
		bs.sort(arr);
		
		print();
		assertCorrect();
	}
	
	private void print()
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	private void assertCorrect()
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			assert arr[i] <= arr[i+1];
		}
	}
}
