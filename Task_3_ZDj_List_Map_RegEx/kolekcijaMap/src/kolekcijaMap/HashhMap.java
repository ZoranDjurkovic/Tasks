package kolekcijaMap;

import java.util.HashMap;
import java.util.Map;

public class HashhMap {

	public class MapExample {

	    public static void main(String[] args) {
	    	
	    	
	        // kreiranje mape podataka od stringova i cijelobronih brojeva
	    	
	        Map<String, Integer> rezultati = new HashMap<>();
	        
	        // Stavljanje nekih elemennta na mapu
	        
	        rezultati.put("Zoran", 90); 
	        rezultati.put("Goran", 80); 
	        rezultati.put("Zorana", 85); 	        
	        
	        
	        System.out.println(rezultati);
	        
	        // get some elements from the map
	        int zoranoviRezultati = rezultati.get("Zoran");
	        int goranoviRezultati  = rezultati.getOrDefault("Bob", 0); // postavi odgovarajucu vrijednos ili 0ako nije ponudjena
	        
	      
	        System.out.println("Zoranovi rezultati  " + zoranoviRezultati);
	        System.out.println("Goranovi rezultati " + goranoviRezultati);
	        
	        // remove some elements from the map
	        rezultati.remove("Alice");
	        rezultati.remove("Bob", 70); // brisanje para Goran i 80 , samo ako postoji	        
	        
	        System.out.println(rezultati);
	    }
	}
}
