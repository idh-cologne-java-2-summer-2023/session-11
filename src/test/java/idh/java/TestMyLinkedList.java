package idh.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMyLinkedList {
	
	@Test
	void testSize() {
		assertEquals(0, new MyLinkedList<Integer>().size());
	}
}
