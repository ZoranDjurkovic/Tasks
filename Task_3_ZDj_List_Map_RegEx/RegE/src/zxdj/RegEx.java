package zxdj;

import java.util.regex.*;


public class RegEx {

	public static void main(String[] args) {
		
		
		String regexShablon = " regex sablon ";
		
		String ulazniSablon = "sablon";
		
		Pattern sablon = Pattern.compile(regexShablon);
		
		Matcher poredjenje = sablon.matcher(ulazniSablon);
		
		
		if (poredjenje.matches()) {
			System.out.println("Ulazni string se podudara");
		}else {
			System.out.println("Ulayni string se ne podudara");
		}
		
		
		

	}

}
