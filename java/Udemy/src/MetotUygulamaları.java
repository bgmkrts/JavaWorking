import java.util.Scanner;

public class MetotUygulamaları {
	Scanner tara = new Scanner(System.in);

	public static void main(String[] args) {
		int kullaniciSecimi = -1;
		for (;;) {
			kullaniciSecimi = menuGoster();
			if (kullaniciSecimi == 0) {
				break;
			}

			Scanner tara = new Scanner(System.in);
			System.out.println("Birinci sayıyı girin");
			int birinciSayi = tara.nextInt();
			System.out.println("ikinci sayıyı girin");
			int ikinciSayi = tara.nextInt();

			switch (kullaniciSecimi) {
			case 1:
				int carpim = ikiSayiyiCarp(birinciSayi, ikinciSayi);
				break;

			case 2:
				int toplam = ikiSayininToplaminiBul(birinciSayi, ikinciSayi);
				break;

			case 3:
				ikiSayininKuvvetiniAl(birinciSayi, ikinciSayi);
				break;
			case 4:
				double toplamDouble=ikiDoubleSayininToplaminiBul(birinciSayi,ikinciSayi);
				System.out.println(toplamDouble);
				break;
			}
		}

	}

	public static double ikiDoubleSayininToplaminiBul(double birinciSayi, double ikinciSayi) {
		return birinciSayi+ikinciSayi;
		
	}

	public static int ikiSayiyiCarp(int birinciSayi, int ikinciSayi) {
		int carpim = birinciSayi + ikinciSayi;
		return carpim;
	}

	public static int ikiSayininToplaminiBul(int birinciSayi, int ikinciSayi) {
		int toplam = birinciSayi + ikinciSayi;
		return toplam;

	}

	public static void ikiSayininKuvvetiniAl(int birinciSayi, int ikinciSayi) {
		double sonuc = Math.pow(ikinciSayi, birinciSayi);
		System.out.println(sonuc);
	}

	public static int menuGoster() {
		System.out.println("*******Menü***********");
		System.out.println("1-İki sayının toplamını bul");
		System.out.println("2-İki sayının farkını bul");
		System.out.println("3-İki sayının çarpımını bul");
		System.out.println("Çıkmak için 0 tuşlayın");

		Scanner tara = new Scanner(System.in);
		int secim = tara.nextInt();

		return secim;

	}

}
