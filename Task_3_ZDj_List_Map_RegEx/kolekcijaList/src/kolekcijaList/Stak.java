package kolekcijaList;

import java.util.Stack;

public class Stak {

	public static void main(String[] args) {
		
		
		// Kreiranje  liste karaktera
		
		Stack<Character> slova = new Stack<>();
		
		 //  "Ugurni" neke elemente na listu
		
		slova.push('M');
		slova.push('I');
		slova.push('S');
		slova.push('A');
		slova.push('N');
		slova.push('U');

		// Stampanje liste
		
		System.out.println(slova);
		
		// Izbacivanje elementa sa steka. 
		
		char top =  slova.pop();
		System.out.println("Izbaceno " + top);
		
		// Stampanje liste ponovo
		
		System.out.println(slova);
		
		// Preuzimanj prvog elementa sa steka ili preuzimanje prvog elementa sa steka ili elemenata koji se nalaze na vrhu steka, Preuyeti element se ne brise niti uklanja sa steka
		
		char peek = slova.peek();  // vracanje top elementa bez pomjeranja
		
		// stampanje
		
		System.out.println(" Peekovani " + peek);
		
		
		

	}

}
