import java.util.Scanner;

public class DizKavrami {

	public static void main(String[] args) {

		// ÇÖZÜM 1

		/*
		 * int sayilar[]=new int[10];
		 * 
		 * for(int index=0; index < sayilar.length ; index++){ //sayilar[index] = index
		 * * index; sayilar[index] = (int) Math.pow(index, 2); }
		 * 
		 * for(int index = 0; index < sayilar.length; index++){
		 * System.out.println(sayilar[index]); }
		 */

		// ÇÖZÜM 2

		/*
		 * //String[] aylar=new String[12]; String[] aylar =
		 * {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağuston","Eylül",
		 * "Ekim","Kasım","Aralık"}; Scanner tara=new Scanner(System.in);
		 * System.out.println("Ay değerini rakamla yazınız"); int ay = tara.nextInt();
		 * System.out.println("Seçtiğiniz ay :" + aylar[ay-1]);
		 */

		// ÇÖZÜM 3
		/*Scanner tara = new Scanner(System.in);
		System.out.println("Kaç tane sayının ortalamasını bulmak istiyorsun ?");
		int sayi = tara.nextInt();
		int kullaniciSayilari[] = new int[sayi];
		double ortalama = 0;
		for (int i = 0; i < sayi; i++) {
			System.out.println("Sayı giriniz : \n");
			kullaniciSayilari[i] = tara.nextInt();
			ortalama = ortalama + kullaniciSayilari[i];
		}
		System.out.println("Girdiğiniz sayıların ortalaması : " + (ortalama / kullaniciSayilari.length));
	}*/
		
		for(int oankiSayi : diziAdi){
			System.out.println(oankiSayi);
			}

}
