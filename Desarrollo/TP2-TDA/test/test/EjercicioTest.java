package test;

import org.junit.*;

import tda.*;

public class EjercicioTest {
	private final int ciclo= 1000000;

	
	public void ColaEstaticaTest() {
		System.out.print("ColaHL: ");
		ColaHL<Integer> cola = new ColaHL<Integer>();
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i<ciclo; i++) {
			cola.offer(i);
		}
		long endTime= System.currentTimeMillis();
		System.out.println(endTime -startTime);
	}
	
	@Test
	public void PilasTest() {
		
		PilaEstatica<Integer> pilaE = new PilaEstatica<Integer>();
		PilaDinamica<Integer> pilaD = new PilaDinamica<Integer>();
		
		//pila estatica
		System.out.print("PilaEstatica ->  ");
		long startTime = System.currentTimeMillis();
		for(int i=0; i<ciclo; i++) {
			pilaE.push(i);
		}
		long endTime= System.currentTimeMillis();
		System.out.println("Tiempo: " + (endTime -startTime));
		//fin pila estatica
		
		//pila dinamica
		System.out.print("PilaDinamica ->  ");
		startTime = System.currentTimeMillis();
		for(int i=0; i<ciclo; i++) {
			pilaD.push(i);
		}
		endTime= System.currentTimeMillis();
		System.out.println("Tiempo: " + (endTime -startTime));
		// fin pila dinamica
		
	}
	
	
}
