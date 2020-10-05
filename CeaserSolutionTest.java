import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CeaserSolutionTest {

	String string_input1 = "AaZz";
	String string_input2 = "z";
	String string_input3 = "a B z";
	
	int int_input1 = 25;
	int int_input2 = 1;
	int int_input3 = 4;
	
	String string_result1 = "ZzYy";
	String string_result2 = "a";
	String string_result3 = "e F d";
	
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(string_result1, CeaserSolution.solution(string_input1, int_input1));
		assertEquals(string_result2, CeaserSolution.solution(string_input2, int_input2));
		assertEquals(string_result3, CeaserSolution.solution(string_input3, int_input3));
	}
}
