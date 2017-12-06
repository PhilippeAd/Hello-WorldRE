package exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

	Rectangle myRectangle = new Rectangle(20.5, 10.3);

	@Test
	public void test1() {
		// Test Case 1: Test, if Rectangle was created successfully
		assertNotNull(myRectangle);
		assertEquals(20.5, myRectangle.getLength(), 0);
		assertEquals(10.3, myRectangle.getWidth(), 0);
	}

	@Test
	public void test2() {
		// Test Case 2: Test, if calculation of the perimeter was correct
		assertTrue(61.6 == myRectangle.calcPerimeter());
		// assertEquals(61.6, myRectangle.calcPerimeter(), 0);
	}

	@Test
	public void test3() {
		// Test Case 3: Test, if calculation of the area was correct
		assertTrue(211.15 == myRectangle.calcArea());
		// assertEquals(211.15, myRectangle.calcArea(), 0);
	}

	@Test
	public void test4() {
		// Test Case 4: Test, if rectangle was deleted successfully
		myRectangle = null;
		assertNull(myRectangle);
	}

}
