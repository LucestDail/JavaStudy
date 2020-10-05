import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StockSolutionTest {

	@Test
	public void SolutionTests() {
		int[] expectedResult1 = {4, 3, 1, 1, 0};
		int[] testarray1 = {1, 2, 3, 2, 3};
		System.out.println("****** Solution Test ******");
		assertTrue(Arrays.equals(expectedResult1, StockSolution.solved(testarray1)));
	}
}
