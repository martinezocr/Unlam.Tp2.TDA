package tda;

public class ColaEstatica<T> implements Cola<T>{
	T[] elementos;
	int tamanio;
	int indexOut;
	int indexIn;
	int elemEnArr;
	
	public ColaEstatica() {
		this.empty();
	}
	
	public void offer(T dato) {
		if(arrayLLeno()) {
			redimensionarArray();
		}
		this.elementos[indexIn]=dato;
		sumarIndexIn();
	}

	@Override
	public T poll() {
		if(this.isEmpty()) {
			return null;
		}
		T dato = this.elementos[indexOut];
		this.elementos[indexOut]=null;
		sumarIndexOut();
		return dato;
	}

	@Override
	public T peek() {
		if(this.isEmpty()) {
			return null;
		}
		return this.elementos[indexOut];
	}

	@Override
	public boolean isEmpty() {
		return this.indexIn==this.indexOut && this.elemEnArr==0;
	}

	@Override
	public void empty() {
		this.elementos= this.inicializarArray(2);
		this.indexOut = 0;
		this.indexIn =0;
		this.elemEnArr=0;	
	}
	private void redimensionarArray() {
		T[] newArr = this.inicializarArray(tamanio * 2);
		for (int i =0; i< elemEnArr ; i++) {
			newArr[i]=elementos[indexOut];
			indexOut++;
		    if(indexOut == elementos.length) {
		    	indexOut=0;
		    }
		}
		this.elementos=newArr;
		indexOut=0;
		indexIn=elemEnArr;
	}

	private T[] inicializarArray(int tam){
		this.tamanio=tam;
		return (T[]) new Object[tam];
	}
	private void sumarIndexOut() {
		this.indexOut++;
		if(this.indexOut == this.tamanio) {
			this.indexOut=0;
		}
		this.elemEnArr--;
	}
	
	private void sumarIndexIn() {
		this.indexIn++;
		if(this.indexIn == this.tamanio) {
			this.indexIn=0;
		}
		this.elemEnArr++;
	}

	private boolean arrayLLeno() {
		return this.elemEnArr == this.elementos.length;
	}



}
