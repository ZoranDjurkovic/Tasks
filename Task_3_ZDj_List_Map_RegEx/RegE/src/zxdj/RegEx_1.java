package zxdj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_1 {

	public static void main(String[] args) {
		
		
		String ulaz = " Misanu je extra ";
		String regex = "extra";
		
		Pattern shablon = Pattern.compile(regex);
		Matcher podudarach = shablon.matcher(ulaz);
		
		// Provjera da li se ulaz podudara sa shablonom
		
		boolean podudara = podudarach.find();
		System.out.println("Shablon se podudario sa ulazom i to je " + podudara);
		

	}

}
