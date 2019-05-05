package tda;

public class ColaCL<T> implements Cola<T> {
	
	Lista<T> cola = new Lista<>();

	@Override
	public void offer(T dato) {
		//cola.pushBack(dato);
		
		Nodo<T> nuevo = new Nodo<>(dato, null);
		if(cola.primero == null)
			cola.primero = nuevo;
		else
			cola.ultimo.setSiguiente(nuevo);
					
		cola.ultimo = nuevo;			
	}

	@Override
	public T poll() {
		
		//cola.popFront();
		
		if(cola.primero == null)
			return null;
				
		Nodo<T> aux = cola.primero;
		cola.primero = cola.primero.getSiguiente();
		if(cola.primero == null)
			cola.ultimo = null;
		return aux.getElemento();
	}

	@Override
	public T peek() {

		//cola.searchAt(0);
		
		if(cola.primero == null)
			return null;
				
		return cola.primero.getElemento();
	}

	@Override
	public boolean isEmpty() {
		
		//return cola.isEmpty();
		return cola.primero == null;
	}

	@Override
	public void empty() {
		
		cola.empty();
	}

}
