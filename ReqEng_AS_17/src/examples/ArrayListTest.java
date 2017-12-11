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
		assertEquals(0, list.size());
	}

	@Test
	public void test2() {
		// Test Case 2: Test, if adding an element was successful
		list.add("Hugo");
		list.add("Boris");
		assertEquals(2, list.size());
		assertEquals("Hugo", list.get(0));
		assertEquals("Boris", list.get(1));
	}

	@Test
	public void test3() {
		// Test Case 3: Test, if deleting an element was successful
		list.add("Hugo");
		list.remove(0);
		assertEquals(0, list.size());
	}

}