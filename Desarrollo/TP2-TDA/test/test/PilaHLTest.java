package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import tda.PilaHL;

public class PilaHLTest {
	PilaHL<Integer> pila;
	
	@Before
	public void iniciarTest() {
		pila = new PilaHL<Integer>();
	}
	@After
	public void finalizarTest() {
		pila=null;
	}
	
	@Test
	public void push() {
		Integer dato =  4;
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		assertEquals(dato, pila.peek());
	}
	
	@Test
	public void pop() {
		Integer dato =  1;
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(1);
		assertEquals(dato,pila.pop());
	}
	@Test
	public void peek() {
		
		Integer dato =  1;
		pila.push(dato);
		assertEquals(dato, pila.peek());
	}
	
	@Test
	public void isEmpty() {
		assertEquals(true, pila.isEmpty());
	}
	@Test
	public void empty() {
		Integer dato =  1;
		pila.push(dato);
		pila.push(dato);
		pila.push(dato);
		pila.empty();
		assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void resize() {
		pila.push(1);
		pila.push(2);
		pila.push(3);
		assertEquals((Integer)3, pila.pop());
		assertEquals((Integer)2, pila.pop());
		pila.push(4);
		pila.push(2);
		pila.push(1);
		pila.push(4);
		pila.push(7);
		pila.push(4);
		pila.push(8);
		pila.push(9);
		pila.push(7);		
		assertEquals((Integer)7, pila.pop());
	}

}
