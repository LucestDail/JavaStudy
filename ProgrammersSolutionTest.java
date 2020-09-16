import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ProgrammersSolutionTest {

	@Test
	public void SolutionTests() {
		int[] expectedResult1 = {1,5,3,5,1,2,1,4};
		int[] expectedResult2 = {2,5,7,9,12};
		int[] testarray1 = {2,1,3,4,1};
		int[] testarray2 = {5,0,2,7};
		System.out.println("****** Solution Test ******");
		assertTrue(Arrays.equals(expectedResult1, ProgrammersSolution.solved(testarray1)));
		//assertTrue(Arrays.equals(expectedResult2, ProgrammersSolution.solved(testarray2)));
	}
}
