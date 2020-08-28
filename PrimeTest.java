/* https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java
 * Define a function that takes an integer argument
 * and returns logical value true or false depending on if the integer is a prime.
 * Per Wikipedia, a prime number (or a prime) is a natural number
 * greater than 1 that has no positive divisors other than 1 and itself.
 * Requirements
 * You can assume you will be given an integer input.
 * You can not assume that the integer will be only positive.
 * You may be given negative numbers as well (or 0).
 * NOTE on performance: There are no fancy optimizations required,
 * but still the most trivial solutions might time out.
 * Numbers go up to 2^31 (or similar, depends on language version).
 * Looping all the way up to n, or n/2, will be too slow.
 * Example
 * is_prime(1) -> false 
 * is_prime(2) -> true  
 * is_prime(-1) -> false 
 * */
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PrimeTest {

	@Test
	public void testBasic() {
		assertFalse("0  is not prime", Prime.isPrime(0));
		assertFalse("1  is not prime", Prime.isPrime(1));
		assertTrue ("2  is prime",     Prime.isPrime(2));
		assertTrue ("73 is prime",     Prime.isPrime(73));
		assertFalse("75 is not prime", Prime.isPrime(75));
		assertFalse("-1 is not prime", Prime.isPrime(-1));
	}
	
	@Test
	public void testPrime() {
		assertTrue("3 is prime", Prime.isPrime(3));
		assertTrue("5 is prime", Prime.isPrime(5));
		assertTrue("7 is prime", Prime.isPrime(7));
		assertTrue("41 is prime", Prime.isPrime(41));
		assertTrue("5099 is prime", Prime.isPrime(5099));
	}
	
	@Test
	public void testNotPrime() {
		assertFalse("4 is not prime", Prime.isPrime(4));
		assertFalse("6 is not prime", Prime.isPrime(6));
		assertFalse("8 is not prime", Prime.isPrime(8));
		assertFalse("9 is not prime", Prime.isPrime(9));
		assertFalse("45 is not prime", Prime.isPrime(45));
		assertFalse("-5 is not prime", Prime.isPrime(-5));
		assertFalse("-8 is not prime", Prime.isPrime(-8));
		assertFalse("-41 is not prime", Prime.isPrime(-41));
	}
}