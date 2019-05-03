package test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import tda.ColaEstatica;

public class ColaEstaticaTest {
	
	ColaEstatica<Integer> cola;
	
	@Before
	public void setUp() {
		cola = new ColaEstatica<Integer>();
	}
	@After
	public void endTest() {
		cola=null;
	}
	@Test
	public void offerPollPeekTest() {
		assertEquals(null,cola.peek());
		cola.offer(1);
		cola.offer(2);
		assertEquals(1, cola.peek());
		assertEquals(1, cola.poll());
	}
	@Test
	public void emptyIsEmpty() {
		cola.offer(1);
		cola.offer(2);
		assertEquals(false, cola.isEmpty());
		cola.empty();
		assertEquals(true, cola.isEmpty());
	}
	@Test
	public void resizeArray() {
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);
		cola.offer(4);
		cola.offer(5);
		assertEquals(1, cola.poll());
		assertEquals(2, cola.poll());
		assertEquals(3, cola.poll());
		assertEquals(4, cola.poll());
		assertEquals(5, cola.poll());
	}
	@Test
	public void resizeArrayWithCrossIndex() {
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);
		cola.offer(4);
		cola.offer(5);
		assertEquals(1, cola.poll());
		assertEquals(2, cola.poll());
		assertEquals(3, cola.poll());
		cola.offer(6);
		cola.offer(7);
		cola.offer(8);
		cola.offer(9);
		cola.offer(10);
		cola.offer(11);
		cola.offer(12);
		assertEquals(4, cola.poll());
		assertEquals(5, cola.poll());
		assertEquals(6, cola.poll());
		assertEquals(7, cola.poll());
		assertEquals(8, cola.poll());
		assertEquals(9, cola.poll());
		assertEquals(10, cola.poll());
		assertEquals(11, cola.poll());
		assertEquals(12, cola.poll());
		assertEquals(null, cola.poll());
		assertEquals(true, cola.isEmpty());	
	}	

}
