package view;

import ed.Pilhas.andre.*;


//TESTE
public class Principal {

	public static void main(String[] args) {
		pilhaInt pInt = new pilhaInt();
		pilhaString pString = new pilhaString();
		
		
		try {
			pString.push("valeu");
			String topo = pString.top();
			System.out.println("topo = "+topo);
			
			pString.push("ou não");
			System.out.println(pString.pop());
			
			topo = pString.top();
			System.out.println("topo = "+topo);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; i++) {
				pInt.push(i);
		}		
		
		try {
			int maior = pInt.max();
			System.out.println(maior);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println(pInt.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
