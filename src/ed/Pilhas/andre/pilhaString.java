package ed.Pilhas.andre;

import model.no;

public class pilhaString {
	no topo;
	
	public pilhaString() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(String valor) {
		no element = new no();
		element.dadoString = valor;
		if(isEmpty()) {
			topo = element;
		}else {
			element.proximoString = topo;
			topo = element;
		}
	}
	
	public String pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Pilha vazia");
		}else {
			String valor = topo.dadoString;
			topo = topo.proximoString;
			return valor;
		}
	}
	
	public String top()throws Exception{
		if(!isEmpty()) {
			String valor = topo.dadoString;
			return valor;
		}else {
			throw new Exception("Pilha vazia");
		}
	}

	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			no auxiliar = topo;
			cont = 1;
			while(auxiliar.proximoString != null) {
				cont = cont + 1;
				auxiliar = auxiliar.proximoString;
			}
		}
		return cont;
	}
}