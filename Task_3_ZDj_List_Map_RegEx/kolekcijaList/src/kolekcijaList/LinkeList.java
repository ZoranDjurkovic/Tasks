package kolekcijaList;

import java.util.LinkedList;
import java.util.List; 

public class LinkeList {

	public static void main(String[] args) {
		
		// Kreiranje liste cijelih brojeva
		
		List<Integer> brojevi = new LinkedList<>();
		
		// Dodavanje brojeva na listu
		
		brojevi.add(10); // dodaje se na kraj liste
		brojevi.add(0,50); // dodaje broj 50 na pocetak liste
		brojevi.add(2,150); // dodaje na index mjesto broj  2 tj. na trecu poziciju na listi
		
		
		// Brisanje elemenata sa liste
		
		brojevi.remove(1); // brisanje sa pozicije index broj 1 tj. na drugoj poziciji u listi
		brojevi.remove(Integer.valueOf(15)); // brisanje vrijednosti 15 
		
		
		// Stampanje liste
		
		System.out.println(brojevi);
		
		
		// Pristupanje nekim elementima na listi
		
		int prvi = brojevi.get(0);  // uzimanje prvog elementa na listi
		int zadnji = brojevi.get(brojevi.size() - 1); // uzimanje zadnjeg elementa na listi
		
		// Stampanje prvog i zadnjeg elementa na listi
		
		System.out.println("Prvi element na listi je broj " + prvi);
		System.out.println("Zadnje element na listi je broj " + zadnji);
		
		
 	

	}

}
