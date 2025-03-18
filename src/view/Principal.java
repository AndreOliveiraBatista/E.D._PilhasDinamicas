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
		
		try {
			pInt.push(2);
			int topo = pInt.top();
			System.out.println("topo = "+topo);
			
			pInt.push(3);
			System.out.println(pInt.pop());
			
			topo = pInt.top();
			System.out.println("topo = "+topo);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
