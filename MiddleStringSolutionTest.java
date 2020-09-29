import static org.junit.Assert.*;
import org.junit.Test;


public class MiddleStringSolutionTest {

	String testCase1 = "abcde";
	String testResult1 = "c";
	
	String testCase2 = "qwer";
	String testResult2 = "we";
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(testResult1, MiddleStringSolution.solved(testCase1));
		assertEquals(testResult2, MiddleStringSolution.solved(testCase2));
	}
}
