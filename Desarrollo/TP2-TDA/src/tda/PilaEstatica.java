package tda;

public class PilaEstatica<T> implements Pila<Object> {
	
	private Object datos[];
	private int tope = -1;
	
	public PilaEstatica(int tamanio) {
		
		this.datos = new Object[tamanio];
		
	}

	@Override
	public void push(Object dato) throws Exception {
		
		if(tope == datos.length - 1)
			throw new Exception("Pila llena");
		
		this.datos[++tope] = dato;
		
	}

	@Override
	public Object pop() {
		
		if(tope == -1)
			return null;
		
		return datos[tope--];
	}

	@Override
	public Object peek() {

		if(tope == -1)
			return null;
		
		return datos[tope];
		
	}

	@Override
	public boolean isEmpty() {
		
		return tope == -1;
	}

	@Override
	public void empty() {

		for(int i = 0; i <= tope; i++)
			datos[i] = null;
		
		tope = -1;
	}

}
