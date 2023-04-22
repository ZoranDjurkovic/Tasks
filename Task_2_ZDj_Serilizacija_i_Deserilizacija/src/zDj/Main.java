package zDj;
import java.io.*;
public class Main {
	
	public static void main(String []args) {
		
		//Serilizacija objekta
		
		try(ObjectOutputStream korpa1 = new ObjectOutputStream (new FileOutputStream("serilizacija")))
		{
			SeDe objekatKorpa1 = new SeDe("Serilizacija","Deserilzacija","i");
			
			System.out.println("Objekat Korpa 1 = "
					 + objekatKorpa1 );
			
			korpa1.writeObject(objekatKorpa1);
			
		}
		catch(IOException e) {
			System.out.println("Izuzetak ako se desi ako se desi");
			}
		
		//Deserilizacija objekta
		
		try(ObjectInputStream korpa1 = new ObjectInputStream (new FileInputStream ("serilizacija") )){
			
			SeDe objekatKorpa2 = (SeDe)korpa1.readObject();
			System.out.println("Objekat Korpa 2 = " + objekatKorpa2);
		}
		catch(Exception e){
			System.out.println("Izuzetak tokom deserijalizovanja");
			System.exit(0);
			
		}
	}

}
