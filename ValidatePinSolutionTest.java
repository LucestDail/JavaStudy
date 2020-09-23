import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ValidatePinSolutionTest {
    @Test
    public void validPins() {
        assertEquals(true, ValidatePinSolution.validatePin("1234"));
        assertEquals(true, ValidatePinSolution.validatePin("0000"));
        assertEquals(true, ValidatePinSolution.validatePin("1111"));
        assertEquals(true, ValidatePinSolution.validatePin("123456"));
        assertEquals(true, ValidatePinSolution.validatePin("098765"));
        assertEquals(true, ValidatePinSolution.validatePin("000000"));
        assertEquals(true, ValidatePinSolution.validatePin("090909"));
    }
    
    @Test
    public void nonDigitCharacters() {
        assertEquals(false, ValidatePinSolution.validatePin("a234"));
        assertEquals(false, ValidatePinSolution.validatePin(".234"));
    }
    
    @Test
    public void invalidLengths() {
        assertEquals(false, ValidatePinSolution.validatePin("1"));
        assertEquals(false, ValidatePinSolution.validatePin("12"));
        assertEquals(false, ValidatePinSolution.validatePin("123"));
        assertEquals(false, ValidatePinSolution.validatePin("12345"));
        assertEquals(false, ValidatePinSolution.validatePin("1234567"));
        assertEquals(false, ValidatePinSolution.validatePin("-1234"));
        assertEquals(false, ValidatePinSolution.validatePin("1.234"));
        assertEquals(false, ValidatePinSolution.validatePin("00000000"));
    }
}