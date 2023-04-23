package kolekcijaList;

import java.util.List;
import java.util.ArrayList;

public class ArayList {

	public static void main(String[] args) {
		
		
		// Kreiranje liste tipa String
		
		List<String> imena = new ArrayList<>();
		
		// add metoda - dodavanje elemenata na listu
		
		imena.add("Zoran");
		imena.add("Jelena");
		imena.add("Andrija");
		imena.add("Lazar");
		imena.add("Dejan");
		imena.add("Petar");
		imena.add("Emilija");
		imena.add("Sladjana");
		imena.add("Kostana");
		imena.add("Milos");
		imena.add("Aleksandar");
		imena.add("Vladimir");
		imena.add("Milan");
		imena.add("Mirko");
		imena.add("Stevan");
		imena.add("Dragana");
		imena.add("Milica");
		imena.add("Slobodan");
		imena.add("David");
		imena.add("Andrea");
		imena.add("Nina");
		
		//Stampanje liste koristenjem for-each petlje
		
		
		for(String ime : imena) {
			System.out.println(ime);
		}

	}

}
