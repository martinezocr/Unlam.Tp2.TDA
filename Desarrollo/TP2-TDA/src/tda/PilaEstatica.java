package tda;

public class PilaEstatica<T> implements Pila<T> {
	
	private T[] datos;
	private int tope;
	private int tamanio;
	
	public PilaEstatica(){
		tope = -1;
		tamanio = 2;
		this.datos =  (T[])new Object[tamanio];
	}
	
	public void push(T dato) {
		// TODO Auto-generated method stub
		if(tope == tamanio -1)
			redimensionar();
		tope ++;
		datos[tope] = dato;
	}
	
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return null;
		return datos[tope --];
	}
	
	public T peek() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return null;
		return datos[tope];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return tope == -1;
	}

	public void empty() {
		// TODO Auto-generated method stub
		tope = -1;
	}
	
	private void redimensionar() {
		T[] newArr = (T[])new Object[tamanio * 2];
		for (int i =0; i< datos.length ; i++) {
			newArr[i]=datos[i];
		}
		this.tamanio = newArr.length;
		this.datos = newArr;
	}

}
