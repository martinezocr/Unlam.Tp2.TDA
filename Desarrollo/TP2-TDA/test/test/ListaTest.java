package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import tda.Lista;

import org.junit.*;

public class ListaTest {

	private Lista<Integer> l;

	@Before
	public void iniciarTest() {
		l = new Lista<Integer>();
	}

	@After
	public void finalizarTest() {
		l = null;
	}

	@Test
	public void agregarAlFinalTest() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushBack(3);
		assertEquals(3, l.popBack());
		assertEquals(2, l.popBack());

	}

	@Test
	public void agregarAlPrincipioTest() {
		l.pushFront(1);
		l.pushFront(2);
		assertEquals(2, l.popFront());
		assertEquals(1, l.popFront());
	}

	@Test
	public void eraseAndSearchByIndex() {
		assertNull(l.searchAt(2));
		l.pushBack(1);
		l.pushFront(2);
		l.pushBack(3);
		assertEquals(2, l.searchAt(0));
		assertEquals(3, l.searchAt(2));
		assertNull(l.searchAt(-1));
		assertNull(l.searchAt(5));
		l.eraseAt(5);
		l.eraseAt(1);
		assertEquals(3, l.searchAt(1));
	}

	@Test
	public void removeAndSearchbyDataTest() {
		
		l.pushBack(1);
		l.pushFront(2);
		l.pushFront(3);
		l.pushBack(4);
		assertEquals(0, l.search(3));
		l.remove(3);
		assertEquals(-1, l.search(3));
	}
	@Test
	public void insertAtTest() {
		l.pushBack(1);
		l.pushBack(2);
		l.pushFront(3);
		l.pushFront(4);
		l.insertAt(6, 5);
		l.insertAt(2, 5);
		assertEquals(5, l.searchAt(2));
	}
	@Test
	public void reverseTest() {
		l.pushBack(5);
		l.pushBack(4);
		l.pushBack(3);
		l.pushBack(2);
		l.pushBack(1);
		l.reverse();
		assertEquals(5, l.popBack());
		assertEquals(4, l.popBack());
		assertEquals(3, l.popBack());
		assertEquals(2, l.popBack());
		assertEquals(1, l.popBack());
	}

	@Test
	public void sizeAndEmpty() {
		assertEquals(0, l.size());
		l.pushBack(1);
		l.pushFront(2);
		l.pushFront(4);
		assertEquals(3, l.size());
		l.empty();
		assertEquals(0, l.size());
	}

}
