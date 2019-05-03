package tda;

public interface Cola<T> {
	
	public void offer(T dato);
	public T poll();
	public T peek();
	public boolean isEmpty();
	public void empty();

}
