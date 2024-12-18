package Bolum6Sorular;

public class Cozum1 {

	public static void main(String[] args) {
		/*100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını
		rastgele olacak şekilde üretin. Bu işlemden sonra dizideki
		elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç
		tane eleman olduğunu yazdırın.*/
		
		
		int sayilar[] = new int[100];
		
		 int SayilarinToplami = 0;
		 for(int i=0; i<sayilar.length; i++){
		 int randomSayi = (int)(Math.random() * 100);
		 sayilar[i] = randomSayi;
		 /*System.out.println(sayilar[i]);*/
		 SayilarinToplami = randomSayi+SayilarinToplami;
		 }

		 double ortalama = (double) SayilarinToplami / (double)sayilar.length;
		 
		 int ortalamaAltindakiDegerlerinSayisi = 0;
		 for (int i=0 ; i<sayilar.length; i++){
			 if(sayilar[i] < ortalama){
			 ortalamaAltindakiDegerlerinSayisi++;
			 }
			 }
			 System.out.println("Ortalama : "+ortalama + " ve ortalamanın altındakilerin sayısı : "+ortalamaAltindakiDegerlerinSayisi);
			 }


}


