package examples;

//Copyright: http://www.java2novice.com/junit-examples/test-annotation/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyEvenOddStaticTest {


	@Test
	public void testEvenOddNumber() {
		assertEquals("12 is a even number", true, MyEvenOddStatic.isEvenNumber(12));
		System.out.println("@Test: testEvenOdd");
	}

	@Test
	public void testEvenOddNumber2() {
		assertEquals("13 is not a even number", false, MyEvenOddStatic.isEvenNumber(13));
		System.out.println("@Test: testEvenOdd");
	}

}