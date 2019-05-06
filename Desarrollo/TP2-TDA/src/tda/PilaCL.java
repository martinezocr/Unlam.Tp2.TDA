package tda;

public class PilaCL<T> implements Pila<T> {

	Lista<T> pila = new Lista<T>();
	
	@Override
	public void push(T dato) {
		pila.pushBack(dato);
	}

	@Override
	public T pop() {
		return pila.popBack();
	}

	@Override
	public T peek() {
		return pila.searchAt(pila.size()-1);
	}

	@Override
	public boolean isEmpty() {
		return pila.isEmpty();
	}

	@Override
	public void empty() {
		pila.empty();
		
	}

	
}
