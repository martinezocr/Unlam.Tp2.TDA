package test;

import org.junit.*;

import tda.ColaEstatica;

public class EjercicioTest {
	private final int ciclo= 1000000;

	@Test
	public void ColaEstaticaTest() {
		System.out.print("ColaEstatica: ");
		ColaEstatica<Integer> cola = new ColaEstatica();
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i<ciclo; i++) {
			cola.offer(i);
		}
		long endTime= System.currentTimeMillis();
		System.out.println(endTime -startTime);
	}
}
