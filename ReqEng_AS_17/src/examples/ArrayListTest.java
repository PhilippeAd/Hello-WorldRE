package examples;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

	ArrayList<String> list;

	@Before
	public void initObject() {
		list = new ArrayList<String>();
	}

	@Test
	public void test1() {
		// Test Case 1: Test, if initializing the list was successful
		assertNotNull(list);
		assertEquals(list.size(), 0);
	}

	@Test
	public void test2() {
		// Test Case 2: Test, if adding an element was successful
		list.add("Hugo");
		list.add("Boris");
		assertEquals(list.size(), 2);
		assertEquals(list.get(0), "Hugo");
		assertEquals(list.get(1), "Boris");
	}

	@Test
	public void test3() {
		// Test Case 3: Test, if deleting an element was successful
		list.add("Hugo");
		list.remove(0);
		assertEquals(list.size(), 0);
	}

}