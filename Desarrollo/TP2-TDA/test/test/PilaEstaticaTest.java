package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tda.PilaEstatica;

public class PilaEstaticaTest {
	
	PilaEstatica<Integer> pila;

	@Before
	public void setUp() {
		pila =  new PilaEstatica<>(10);
	}
	
	@Test
	public void PilaVaciaTest(){
		Assert.assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void apilarTest() throws Exception{
		Integer dato = new Integer(10);
		pila.push(dato);
		Assert.assertEquals(false, pila.isEmpty());
		Assert.assertEquals(dato, pila.peek());
	}

}
