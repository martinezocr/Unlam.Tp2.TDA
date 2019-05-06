package tda;

public class Lista<T> {
	protected Nodo<T> primero;
	protected Nodo<T> ultimo;
	protected int tamanio;
	
	public Lista() {
		this.empty();
	}
	
	public void pushBack(T dato) {
		Nodo<T> aux =new Nodo<T>(dato,null);
		if(isEmpty()) {
			primero = aux;
			ultimo =aux;
			primero.setSiguiente(ultimo);
		}else {
			ultimo.setSiguiente(aux);
			ultimo=aux;
		}
		tamanio ++;
	}
	public T popBack() {
		if(isEmpty()) {
			return null;
		}
		Nodo<T> aux = ultimo;
		ultimo = getNodo(tamanio-2);
		tamanio--;
		return aux.getElemento();
 	}
	
	public void pushFront(T dato) {
		Nodo<T> aux = new Nodo<T>(dato,null);
		if(isEmpty()) {
			ultimo=aux;
			primero=aux;
			primero.setSiguiente(ultimo);
		}else {
			aux.setSiguiente(primero);
			primero = aux;
		}
		tamanio++;
	} 
	public T popFront() {
		if(isEmpty()) {
			return null;
		}
		Nodo<T> aux = primero;
		primero = primero.getSiguiente();
		tamanio--;
		return aux.getElemento();
	}
	
	public void remove(T dato) {
		int index = search(dato);
		if(index==-1) {
			return;
		}
		eraseAt(index);
	} 
	
	public void reverse() {
		if(isEmpty()) {
			return;
		}
		Nodo<T> nuevoPri  = ultimo;
		
		int cont = tamanio-1;
		Nodo<T> nodoActual = nuevoPri;
		while(cont > 0) {
			Nodo<T> aux = getNodo(cont-1);
			nodoActual.setSiguiente(aux);
			nodoActual = aux;
			cont--;	
		}
		primero = nuevoPri;
		ultimo = nodoActual;
		ultimo.setSiguiente(null);
		
	}
	 
	public void insertAt(int index, T dato) {
		if(index < 0 || index >= tamanio) {
			return;
		}
		Nodo<T> aux = new Nodo<T>(dato,null);
		
		if(index==0) {
			aux.setSiguiente(primero);
			primero = aux;
		}else if(index == tamanio-1) {
			ultimo.setSiguiente(aux);
			ultimo=aux;
		}
		else {
			Nodo<T> ant = getNodo(index-1);
			Nodo<T> sig = getNodo(index);
			aux.setSiguiente(sig);
			ant.setSiguiente(aux);
		}
		tamanio++;
		
		
	}
	public void eraseAt(int index){
		if(index < 0 || index >= tamanio|| isEmpty() ) {
			return;
		}
		Nodo<T> ant;
		if(index == 0) {
			primero = primero.getSiguiente();
		}else if(index==tamanio-1) {
			ant = getNodo(index-1);
			ant.setSiguiente(null);
		}
		else {
			ant= getNodo(index-1);
			Nodo<T> sig= getNodo(index+1);
			ant.setSiguiente(sig);
				
		}
		tamanio--;
		
	}
	public boolean isEmpty() {
		return tamanio==0;
	}
	
	public void empty() {
		this.primero=null;
		this.ultimo=null;
		this.tamanio=0;
	}
	public int search(T dato) {
		if(isEmpty()) {
			return -1;
		}
		Nodo<T> aux = primero;
		int i=0;
		
		while(aux!=null) {
			if(dato.equals(aux.getElemento())){
				return i;
			}else {
				aux = aux.getSiguiente();
			}
			i++;
		}
		return -1;
		
		
	}
	
	public T searchAt(int index) {
		Nodo<T> aux = getNodo(index);
		return aux==null? null: aux.getElemento();
	}
	public int size() {
		return this.tamanio;
	}
	
	public Nodo<T> getNodo(int index) {
		if(index <0 || index >= tamanio || isEmpty() ) {
			return null;
		}
		if(index==0) {
			return  primero;
		}else if(index == tamanio-1) {
			return ultimo;
		}
		Nodo<T> aux = primero.getSiguiente();
		int i =1;
		while(i< index) {
			i++;
			aux= aux.getSiguiente();
		}
		return aux;
	}
	public void recorrerElem() {
		for(int i=0; i<tamanio; i++) {
			System.out.println(i + ": " + getNodo(i).getElemento());
			
		}
	}
	
}
