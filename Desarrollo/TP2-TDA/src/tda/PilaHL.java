package tda;


public class PilaHL<T> extends Lista<T> implements Pila<T> {

	@Override
	public void push(T dato) {
		// TODO Auto-generated method stub
		super.pushFront(dato);		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return super.popFront();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return super.searchAt(0);
	}	

}
