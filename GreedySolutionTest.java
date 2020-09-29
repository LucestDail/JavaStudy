import static org.junit.Assert.*;

import org.junit.Test;

public class GreedySolutionTest {

	@Test
	public void SolutionTests() {
		int[] lost1 = {2, 4};
		int[] lost2 = {2, 4};
		int[] lost3 = {3};
		int[] reserve1 = {1,3,5};
		int[] reserve2 = {3};
		int[] reserve3 = {1};
		System.out.println("****** Solution Test ******");
		assertEquals(5, GreedySolution.solution(5,lost1,reserve1));
		assertEquals(4, GreedySolution.solution(5,lost2,reserve2));
		assertEquals(2, GreedySolution.solution(3,lost3,reserve3));
	}

}
