package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tda.ColaCL;

public class ColaCLTest {
	
	ColaCL<Integer> cola;
	
	@Before
	public void setUp(){
		cola = new ColaCL<>();
	}
	
	@Test
	public void offerPollPeekTest() {
		cola.offer(2);
		cola.offer(3);
		cola.offer(4);
		Assert.assertEquals(2, (int)cola.peek());
		Assert.assertEquals(2, (int)cola.poll());
		Assert.assertEquals(3, (int)cola.peek());
		Assert.assertEquals(3, (int)cola.poll());
		Assert.assertEquals(4, (int)cola.peek());
		Assert.assertEquals(4, (int)cola.poll());
	}
	
	@Test
	public void emptyTest() {
		Assert.assertEquals(true, cola.isEmpty());
		cola.offer(4);
		cola.offer(3);
		Assert.assertEquals(false, cola.isEmpty());
		cola.empty();
		Assert.assertEquals(true, cola.isEmpty());
	}

}
