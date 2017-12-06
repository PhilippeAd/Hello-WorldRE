package examples;

//Copyright: http://www.java2novice.com/junit-examples/test-annotation/

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyEvenOddTest2 {

	MyEvenOdd meo;

	@Before
	public void executedBeforeEach() {
		meo = new MyEvenOdd();
		System.out.println("@Before: executedBeforeEach");
	}

	@Test
	public void testEvenOddNumber() {
		assertEquals("12 is a even number", true, meo.isEvenNumber(12));
		System.out.println("@Test: testEvenOdd");
	}

	@Test
	public void testEvenOddNumber2() {
		assertEquals("13 is not a even number", false, meo.isEvenNumber(13));
		System.out.println("@Test: testEvenOdd");
	}

}