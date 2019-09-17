package TestUnit;

import org.junit.Assert;
import org.junit.Test;

import com.FindLargest;

public class TestLargest {
	FindLargest function = new FindLargest();
	@Test
	public void testNull() {
		
		int[] nullArray=null;
		Assert.assertEquals(0, function.largestFind(nullArray));
		
	}
	@Test
	public void testFindLargest() {
		int[] myArray={2,5,7,9};
		Assert.assertEquals(9, function.largestFind(myArray));
	}
	
	
}
