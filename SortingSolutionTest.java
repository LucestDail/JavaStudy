import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortingSolutionTest {

	@Test
	public void SolutionTests() {
		int[] testarray = {1,5,2,6,3,7,4};
		int[][] testcommands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] testreturn = {5,6,3};

		
		System.out.println("****** Solution Test ******");
		assertTrue(Arrays.equals(testreturn, SortingSolution.solved(testarray, testcommands)));
	}
}
