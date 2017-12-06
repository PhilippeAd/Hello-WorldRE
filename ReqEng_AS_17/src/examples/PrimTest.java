package examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimTest {

	@Test
	public void testIsPrime1() {
		assertEquals("13 is a prime number", true, Prim.isPrim(13));
	}

	@Test
	public void testIsPrime2() {
		assertEquals("22 is not a prime number", false, Prim.isPrim(22));
	}

	@Test
	public void testIsPrime3() {
		assertEquals("37 is a prime number", true, Prim.isPrim(37));
	}
}