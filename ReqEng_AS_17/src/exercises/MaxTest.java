package exercises;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxTest {

	@Test
	public void testMax1() {
		assertEquals("3 is the max", 3, Max.max(2, 1, 3));
	}

	@Test
	public void testMax2() {
		assertEquals("6 is the max", 6, Max.max(5, 5, 6));
	}

	@Test
	public void testMax3() {
		assertEquals("9 is the max", 9, Max.max(9, 9, 8));
	}
}