import static org.junit.Assert.*;
import org.junit.Test;


public class KeyPadSolutionTest {

	int[] numbers1 = {1,3,4,5,8,2,1,4,5,9,5};
	int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
	int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	
	String hand1 = "right";
	String hand2 = "left";
	String hand3 = "right";
	
	String result1 = "LRLLLRLLRRL";
	String result2 = "LRLLRRLLLRR";
	String result3 = "LLRLLRLLRL";
	
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(result1, KeyPadSolution.solution(numbers1, hand1));
		assertEquals(result2, KeyPadSolution.solution(numbers2, hand2));
		assertEquals(result3, KeyPadSolution.solution(numbers3, hand3));
	}
}
