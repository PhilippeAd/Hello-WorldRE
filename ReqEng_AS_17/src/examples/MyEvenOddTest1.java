package examples;

//Copyright: http://www.java2novice.com/junit-examples/test-annotation/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyEvenOddTest1 {

	@Test
	public void testEvenOddNumber() {
		MyEvenOdd meo = new MyEvenOdd();
		assertEquals("12 is a even number", true, meo.isEvenNumber(12));
	}

}