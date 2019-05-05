package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import tda.ColaHL;

public class ColaHLTest {
	ColaHL<Integer> c;
	
	@Before
	public void iniciarTest() {
		c = new ColaHL<Integer>();
	}
	@After
	public void finalizarTest() {
		c=null;
	}
	@Test
	public void pushPeekPop() {
		c.offer(3);
		c.offer(5);
		assertEquals(3, c.peek());
		assertEquals(3, c.poll());
	}
	@Test
	public void emptyTest() {
		assertEquals(true, c.isEmpty());
		c.offer(7);
		c.offer(10);
		assertFalse(c.isEmpty());
		c.empty();
		assertTrue(c.isEmpty());
	}
	

}
