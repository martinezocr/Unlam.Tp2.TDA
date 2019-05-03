package tda;

public interface Pila<T> {
	
	public void push(T dato) throws Exception;
	public T pop();
	public T peek();
	public boolean isEmpty();
	public void empty();

}
