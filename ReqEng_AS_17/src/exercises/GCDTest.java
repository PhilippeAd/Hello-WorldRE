package exercises;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GCDTest {

	@Test
	public void testGCD1() {
		assertEquals("12 is the GCD", 12, GCD.greatestCommonDivisor(12, 24));
	}
	
	@Test
	public void testGCD2() {
		assertEquals("9 is the GCD", 9, GCD.greatestCommonDivisor(27, 9));
	}
	
	@Test
	public void testGCD3() {
		assertEquals("3 is the GCD", 3, GCD.greatestCommonDivisor(9, 6));
	}
	
}