package ed.Pilhas.andre;

import model.no;

public class pilhaInt {
	no topo;
	
	public pilhaInt() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int valor) {//Inserir dados na pilha
		no element = new no();
		element.dado = valor;
		if(isEmpty()) {
			topo = element;
		}else {
			element.proximo = topo;
			topo = element;
		}
	}
	
	public int pop() throws Exception {//remover o primeiro dado da pilha
		if(isEmpty()) {
			throw new Exception("Pilha vazia");
		}else {
			int valor = topo.dado;
			topo = topo.proximo;
			return valor;
		}
	}
	
	public int top()throws Exception{//mostrar o primeiro dado da pilha
		if(!isEmpty()) {
			int valor = topo.dado;
			return valor;
		}else {
			throw new Exception("Pilha vazia");
		}
	}

	public int size() {//mostrar o tamanho da pilha 
		int cont = 0;
		if(!isEmpty()) {
			no auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null) {
				cont = cont + 1;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
	public int max() throws Exception{//mostrar o maior dado da pilha 
		int maior = 0;
		pilhaInt pInt = new pilhaInt();
		int size = size();
		for (int i = 0; i < size; i++) {
			int valor = pop();
			pInt.push(valor);
			if (maior < valor) {
				maior = valor;
			}
		}
		
		for(int i = 0; i < size; i++) {
			push(pInt.pop());
		}
		return maior;
	}
}