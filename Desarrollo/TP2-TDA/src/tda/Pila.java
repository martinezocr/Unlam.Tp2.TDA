package tda;

public interface Pila<T> {
	
	/**
	 * apila un dato en el tope de la pila
	 */
	public void push(T dato);
	/**
	 * desapila el dato apuntado por el tope de la pila
	 * @return Object: el objecto al que apunta el tope
	 */
	public T pop();
	/**
	 * devuelve el dato apuntado por el tope de la pila, pero no lo desapila.
	 * @return Object
	 */
	public T peek();
	/**
	 * verificar si la pila esta o no vacía.
	 */
	public boolean isEmpty();
	/**
	 * vaciar la pila
	 */
	public void empty();

}
