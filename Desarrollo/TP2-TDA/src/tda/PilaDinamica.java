package tda;

public class PilaDinamica<T> implements Pila<T>{
	
	private Nodo<T> tope = null;

	@Override
	public void push(T dato) {
		
		tope = new Nodo<T>(dato, tope);
		
	}

	@Override
	public T pop() {
		
		if(tope == null)
			return null;
		
		T dato = tope.getElemento();
		Nodo<T> aux = tope.getSiguiente();
		tope = null;
		tope = aux;
		
		return dato;
	}

	@Override
	public T peek() {
		if(tope == null)
			return null;
		
		return tope.getElemento();
	}

	@Override
	public boolean isEmpty() {

		return tope == null;
	}

	@Override
	public void empty() {
		
		while(tope != null)
			tope = tope.getSiguiente();
		
	}

}
