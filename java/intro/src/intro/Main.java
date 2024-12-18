package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		
		int dolarDun=17;
		double dolarBugun=17;
		String okYonu="";
		
		if(dolarBugun<dolarDun) {
			okYonu="down.svg";
			System.out.println(okYonu);
			
		}
		else if(dolarBugun>dolarDun){
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
			String[] krediler= {"Hızlı kredi","maaşın halkbanktan","mutlu kredi"};
/*	System.out.println(krediler[0]);
			System.out.println(krediler[1]);
			System.out.println(krediler[2]);*/
			
			for (int i = 0; i < krediler.length; i++) {
				System.out.println(krediler[i]);
				
			}


	}

}
