package zDj;

import java.io.Serializable;

public class SeDe implements Serializable {   //klasa koja implementira interfejs
	                                          //Serializable
	String s;   
	String d;
	String i;
	
	private static final long serialVersionUID = 50l;
			
	public SeDe(String s, String d, String i) {   //konstruktor
		
		this.s = s;
		this.d = d;
		this.i = i;
		}

	
	public String toString() {
		return " " + s + "  " + i + "  " + d ;
	}
	
	

}
