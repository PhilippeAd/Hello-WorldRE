package exercises;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ArrayListExampleTest {

	ArrayListExample aListExample = new ArrayListExample();
	ArrayList<Double> aList;

	@Before
	public void executedBeforeEach() {
		aList = new ArrayList<Double>();
	}

	@Test
	public void testArrayList1() {
		aList.add(3.7);
		aList.add(5.0);
		aList.add(4.1);
		assertEquals(4.266666667, aListExample.average(aList), 0.001);
	}

	@Test
	public void testArrayList2() {
		aList.add(2.1);
		aList.add(7.0);
		aList.add(5.0);
		assertEquals(4.7, aListExample.average(aList), 0);
	}

}
