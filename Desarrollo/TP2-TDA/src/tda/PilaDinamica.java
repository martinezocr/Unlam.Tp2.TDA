package tda;

public class PilaDinamica<T> implements Pila<T>{
	
	private Nodo<T> nodo;

	public PilaDinamica() {
		// TODO Auto-generated constructor stub
		nodo = null;
	}
	
	@Override
	public void push(T dato) {
		nodo = new Nodo<T>(dato, nodo);
	}

	@Override
	public T pop() {
		
		if(nodo == null)
			return null;
		
		T dato = nodo.getElemento();
		Nodo<T> aux = nodo.getSiguiente();
		nodo = null;
		nodo = aux;
		
		return dato;
	}

	@Override
	public T peek() {
		if(nodo == null)
			return null;
		
		return nodo.getElemento();
	}

	@Override
	public boolean isEmpty() {
		return nodo == null;
	}

	@Override
	public void empty() {
		while(nodo != null)
			nodo = nodo.getSiguiente();
	}

}
