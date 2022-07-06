package idh.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestMyLinkedList {
	
	@Test
	void testSize() {
		assertEquals(0, new MyLinkedList<Integer>().size());
	}

	@Test
	void testSize2() {
		assertEquals(2, new MyLinkedList<Integer>().size());
	}
	
	@Test
	void testClear() {
		MyLinkedList<Integer> l = new MyLinkedList<Integer>();
		
		l.add(54);
		
		l.clear();
		
		assertTrue(l.isEmpty());
		assertEquals(0, l.size());
		
	}

	
	
}
