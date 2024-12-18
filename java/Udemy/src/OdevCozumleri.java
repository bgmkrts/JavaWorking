import java.util.Scanner;

public class OdevCozumleri {

	public static void main(String[] args) {
		/* odev1  
		
		String stringDegiskeni="150";
		int IntegerDegiskeni=Integer.parseInt(stringDegiskeni);
		int IntegerDegiskeni2=Integer.valueOf(stringDegiskeni);
		
		System.out.println(IntegerDegiskeni);
		System.out.println(IntegerDegiskeni2);
		
		
		
		
		stringDegiskeni=String.valueOf(IntegerDegiskeni2);
		System.out.println(stringDegiskeni); */
		
		
		/*ödev2
		 
		 System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
         System.out.println(1.0 - 0.9);
      */
		
		
        /* int sayi1 = 10;
         int sayi2 = ++sayi1;
         int sayi3 = sayi1--;
         System.out.println("Sonuc : " + (sayi1)+(--sayi2)+(sayi3++));*/
		
		/*double ondalikliSayi=6.50;
		double sonuc = 0;
		sonuc++;
		ondalikliSayi *= sonuc;
		System.out.println("Sonuç : " + sonuc);*/
		
		/*	int s1 = 10;

			System.out.println(s1++);

			System.out.println(++s1);*/
		
	/*	int a =10, b =8, c=0;
		c = (a>b) ? (a-b) : (a+b);
		System.out.println(c);*/
		
		int boy=0;
		double kilo=0;
		Scanner tara=new Scanner(System.in);
		System.out.println("vücut kitle index programına hoşgeldiniz");
		
		System.out.println("Lütfen boyunuzu cm cinsinden girin");
		boy=tara.nextInt();
		
		System.out.println("Lütfen kilonuzu kg cinsinden girin");
		kilo=tara.nextDouble();
		
		double index=0;
		double cmToMetre=(double) boy/100;
		double boyunKaresi=Math.pow(cmToMetre, 2);
		index=kilo/boyunKaresi;
		
		System.out.println(index);
		
		if(index<15) {
			System.out.println("çok ciddi derecede düşük kilolu");
		}
		else if(index>15 && index<10) {
			System.out.println("Ciddi derecede düşük kilolu");	
		}
		else if(index>16 && index<25) {
			System.out.println("Sağlıklı");	

		}
		else if(index>25 && index<40) {
			System.out.println("Kilolu");	

		}
		else {
			System.out.println("Aşırı kilolu");
		}
;
		
	}

}
