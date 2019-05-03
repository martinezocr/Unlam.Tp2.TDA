package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tda.PilaDinamica;

public class PilaDinamicaTest {
	
	PilaDinamica<Integer> pila;

	@Before
	public void setUp() {
		pila =  new PilaDinamica<>();
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
