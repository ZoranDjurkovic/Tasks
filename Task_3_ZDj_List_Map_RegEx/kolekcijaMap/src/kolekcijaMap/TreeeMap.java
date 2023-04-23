package kolekcijaMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeeMap {
public static void main(String[] args) {
		
		
		String tekst = "Kako se navodi, na sastanak sa Kampacom su iz Madrida otputovali predsednik košarkaške sekcije Blankosa Huan Karlos Sančez i sportski direktor Alberto Ereros.\r\n"
				+ "\r\n"
				+ "Relevo ističe i da je želja za obnavljanjem saradnje bila obostana, a obrazloženo je da Faku zbog velikih poreza nije potpisao za Real još ove sezone. Naime, da se vratio u špansku prestonicu u decembru prošle godine, po odlasku iz NBA, plaćao bi porez 45 odsto u 2023. godini. S ozbirom da je na stolu imao ponudu od 1.600.000 evra, oko 720.000 bi otišlo na porez, izračunali su Španci.\r\n"
				+ "\r\n"
				+ "Uz to, tu je i dug prema bivšem klubu od 2.600.000 evra na ime neisplaćenog dela otpusne klauzule koju je aktivirao po odlasku u NBA, piše ovaj španski list.\r\n"
				+ "\r\n"
				+ "Ovako je dolaskom u Crvenu zvezdu navodno odložio prelazak u Real za naredno leto, te bi tako tokom prve godine u Madridu na njegova primanja trebalo da bude primenjen porez od 22 odsto za osobe koje nemaju registrovano mesto prebivališta (\"non-resident\"), što bi mu omogućilo da zadrži više novca i lakše otplati dug klubu.\r\n"
				+ "\r\n"
				+ "Kampaco je od dolaska na Mali Kalemegdan upisao 15 nastupa u ABA ligi i prosečno beležio 14,3 poena i 6,7 asistencija. Odigrao je samo devet mečeva u Evroligi zbog tromesečne zabrane registrovanja igrača koja je izrečena srpskom i regionalnom šampionu, ali upisao impozantne brojke: 15 poena, 5,9 asistencija i prosečan indeks korisnosti 18,7.\r\n"
				+ "\r\n"
				+ "Predstoji mu borba za regionalni tron sa crveno-belima, kao i Superliga Srbije, a već je osvojio Kup Radivoja Koraća kao član Crvene zvezde.\r\n"
				+ "\r\n"
				+ "";
		
		String [] rijeci = tekst.split(" ");   // "gura" tekst u niz prem odvojenim praznim mjestima
		
		TreeMap<String, Integer> ucestalostMap =  new TreeMap<>();
		
		for (String rijec : rijeci) {
			
			Integer ucestalost = ucestalostMap.get(rijec);
				if(ucestalost == null) {
					ucestalost = 0;
				}
				ucestalostMap.put(rijec, ucestalost + 1);
		}
		
		
		for(Map.Entry<String, Integer> entry : ucestalostMap.entrySet()){
			System.out.println(entry.getKey() + ": " + entry.getValue() );
}
		
}

}