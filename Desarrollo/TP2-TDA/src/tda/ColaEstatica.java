package tda;

public class ColaEstatica<T> implements Cola<T>{
	
	private Nodo<T> primero;
	private Nodo<T> ultimo;

	@Override
	public void offer(T dato) {
		Nodo<T> nuevo = new Nodo<>(dato, null);
		if(primero == null)
			primero = nuevo;
		else
			ultimo.setSiguiente(nuevo);
			
		ultimo = nuevo;
	}

	@Override
	public T poll() {
		
		if(primero == null)
			return null;
		
		Nodo<T> aux = primero;
		primero = primero.getSiguiente();
		return aux.getElemento();
	}

	@Override
	public T peek() {
		
		if(primero == null)
			return null;
		
		return primero.getElemento();	
	}

	@Override
	public boolean isEmpty() {
		
		return primero == null;
	}

	@Override
	public void empty() {

		while(primero != null)
			primero = primero.getSiguiente();
		ultimo = null;
	}

}
