import java.util.Scanner;

public class GenelTekrar {

	public static void main(String[] args) {

		/*
		 * Scanner tara = new Scanner(System.in);
		 * System.out.println("Birinci sayıyı giriniz"); int birinciSayi =
		 * tara.nextInt(); System.out.println("İkinci sayıyı giriniz"); int ikinciSayi =
		 * tara.nextInt(); System.out.println("Üçüncü sayıyı giriniz"); int ucuncuSayi =
		 * tara.nextInt(); double ortalama = (double) (birinciSayi + ikinciSayi +
		 * ucuncuSayi) / 3.0; System.out.println("Girdiğiniz sayıların ortalaması : " +
		 * ortalama); System.out.printf("%.4f", ortalama);
		 */

		/*
		 * Scanner tara = new Scanner(System.in);
		 * System.out.println("Birinci kenarı giriniz"); int birinciKenar =
		 * tara.nextInt(); System.out.println("Ikinci kenarı giriniz"); int ikinciKenar
		 * = tara.nextInt(); System.out.println("Üçüncü kenarı giriniz"); int
		 * ucuncuKenar = tara.nextInt(); if( (birinciKenar == ikinciKenar) &&
		 * (birinciKenar == ucuncuKenar)){ System.out.println("Eşkenar üçgen"); }else
		 * if((birinciKenar != ikinciKenar) && (birinciKenar != ucuncuKenar) &&
		 * (ikinciKenar != ucuncuKenar)){ System.out.println("Çeşit kenar üçgen");
		 * }else{ System.out.println("İkiz kenar üçgen"); }
		 */

		/*
		 * Scanner tara = new Scanner(System.in); double vize = 0, finalNotu=0; double
		 * ortalama = 0; System.out.println("Vize notunuzu giriniz"); vize =
		 * tara.nextDouble(); System.out.println("Final notunuzu giriniz"); finalNotu =
		 * tara.nextDouble(); ortalama = vize * 0.4 + finalNotu * 0.6; if(ortalama >
		 * 50){ System.out.println("Dersi geçtiniz ortalamanız : "+ortalama); }else{
		 * System.out.println("Dersi geçemediniz ortalamanız : " + ortalama); }
		 */

		/*
		 * for(int i=0 ; i<5; i++){ System.out.println("For döngüsü "+ (i+1) +
		 * ". tur : Emre Altunbilek"); } int sayac = 0; while (sayac < 5){
		 * System.out.println("While döngüsü "+ (sayac+1) + ". tur : Emre Altunbilek");
		 * sayac ++; } int sayac2 = 0 ; do{ System.out.println("do while döngüsü "+
		 * (sayac2+1) + ". tur : Emre Altunbilek"); sayac2++; }while (sayac2 < 5);
		 */

		/*
		 * Scanner tara = new Scanner(System.in); int toplam = 0;
		 * System.out.println("Alt sınırı giriniz"); int altSinir = tara.nextInt();
		 * System.out.println("Üst sınırı giriniz"); int ustSinir = tara.nextInt(); for
		 * (int i= altSinir; i < ustSinir; i++){ toplam = toplam + i ; }
		 * System.out.println(altSinir + " ile " + ustSinir +
		 * " arasındaki sayıların toplamı :"+toplam);
		 */

		/*
		 * for (int i=1; i<=10 ; i++){ System.out.print(i); if(i != 10){
		 * System.out.print(","); } }
		 */

		/*
		 * Scanner tara = new Scanner(System.in);
		 * System.out.println("Faktoriyeli hesaplanacak sayıyı giriniz :"); int sayi =
		 * tara.nextInt(); int sayac = 1; long faktoriyel = 1; while (sayac <= sayi){
		 * faktoriyel = faktoriyel * sayac; sayac ++ ; }
		 * System.out.println("Girdiğiniz "+sayi+" sayısının faktoriyeli : " +
		 * faktoriyel);
		 */

		/*
		 * Scanner tara=new Scanner(System.in);
		 * System.out.println("x değerini giriniz"); int x = tara.nextInt();
		 * System.out.println("y değerini giriniz"); int y = tara.nextInt(); int sonuc =
		 * 0; if(x > 0 && y<0){ sonuc = 4*x + 2*y + 4; }else if(x > 0 && y==0){ sonuc =
		 * 2*x - y + 3; }else if(x < 0 && y>0){ sonuc = 3*x + 4*y + 3; }
		 * System.out.println("Sonuç : " +sonuc);
		 */

		/*
		 * Scanner tara = new Scanner(System.in); int notDegeri = 0, notSinir=0;
		 * System.out.println("Notunuzu giriniz"); notDegeri = tara.nextInt(); notSinir
		 * = notDegeri / 10 ; if(notDegeri == 100){ notSinir = 9; } switch (notSinir){
		 * case 9: System.out.println("Notunuz AA"); break; case 8:
		 * System.out.println("Notunuz BA"); break; case 7:
		 * System.out.println("Notunuz BB"); break; case 6:
		 * System.out.println("Notunuz CB"); break; case 5:
		 * System.out.println("Notunuz CC"); break; default:
		 * System.out.println("Notunuz CC'den düşük"); }
		 */

		/*
		 * for(int i = 1; i<=10; i++){ for(int j = 1 ; j <= 10 ; j++){
		 * System.out.print(i +"*"+ j + "=" + (i*j) + "\t"); } System.out.println();
		 * System.out.println(); }
		 */

		/*
		 * Scanner tara = new Scanner(System.in); int uretilenSayi = (int)
		 * (Math.random() * 101);//0 ile 100 arası sayı üretilir 100 dahil. int tahmin =
		 * -1 ; int tahminEtmeSayisi = 0; while (tahmin != uretilenSayi){
		 * System.out.println("Tahmininizi giriniz :"); tahmin = tara.nextInt();
		 * tahminEtmeSayisi++; if(tahmin == uretilenSayi){
		 * System.out.println("Tebrikler ! "+tahminEtmeSayisi +
		 * " seferde sayıyı buldunuz"); }else if(tahmin > uretilenSayi){
		 * System.out.println("Tahmin ettiğiniz sayı yüksek, DÜŞÜRÜN"); }else{
		 * System.out.println("Tahmin ettiğiniz sayı çok düşük, YÜKSELTİN"); } }
		 */

		/*
		 * Scanner tara = new Scanner(System.in);
		 * System.out.println("Bir değer giriniz, çıkmak için 0 tuşlayınız"); int
		 * kullaniciDegeri = tara.nextInt(); int carpimSonucu = 1; boolean
		 * hemenCikildiMi = true; while (kullaniciDegeri != 0){ carpimSonucu =
		 * carpimSonucu * kullaniciDegeri;
		 * System.out.println("Bir değer giriniz, çıkmak için 0 tuşlayınız");
		 * kullaniciDegeri = tara.nextInt(); hemenCikildiMi = false; }
		 * if(hemenCikildiMi){ System.out.println("Uygulamadan hemen çıktınız"); }else{
		 * System.out.println("Girdiğiniz sayıların çarpımı : " + carpimSonucu); }
		 */

		/*
		 * Scanner tara = new Scanner(System.in);
		 * System.out.println("Birinci sayıyı giriniz"); int sayi1 = tara.nextInt();
		 * System.out.println("İkinci sayıyı giriniz"); int sayi2 = tara.nextInt(); int
		 * ebob = 1; int kontrol = 2; while(kontrol <= sayi1 && kontrol <= sayi2){
		 * if(sayi1 % kontrol == 0 && sayi2 % kontrol ==0){ ebob = kontrol; } kontrol++;
		 * } if(ebob==1){ System.out.println(sayi1 +" ve " + sayi2+
		 * " aralarında asaldır"); }else{ System.out.println(sayi1 +" ve " + sayi2+
		 * " sayılarının en büyük ortak böleni : "+ebob); }
		 */

		/*
		 * Scanner tara = new Scanner(System.in);
		 * System.out.println("Bir kelime girin"); String kelime = tara.nextLine(); int
		 * altSinir = 0; int ustSinir = kelime.length() - 1; boolean palindromeMu =
		 * true; while(altSinir < ustSinir ){ if(kelime.charAt(altSinir) !=
		 * kelime.charAt(ustSinir)){ palindromeMu=false; break; } altSinir++;
		 * ustSinir--; } if (palindromeMu){
		 * System.out.println(kelime+" kelimesi palindromedur"); }else{
		 * System.out.println(kelime+" kelimesi palindrome değildir"); }
		 */

		/*
		 * Scanner tara = new Scanner(System.in);
		 * System.out.println("Üst sınırı giriniz"); int girilenSayi = tara.nextInt();
		 * for(int i =2; i<=girilenSayi; i++){ boolean asalMi=true; for(int j = 2; j <
		 * i; j++){ if(i % j == 0){ asalMi = false; break; } } if(asalMi)
		 * System.out.print(i+","); }
		 */

		int artis = 0;
		boolean artiyorMu = true;
		int toplam = 0;
		for (int i = 1; i <= 35; i = i + artis) {
			System.out.print(i);
			toplam = toplam + i;
			if (i != 35) {
				System.out.print(" + ");
			} else {
				System.out.print(" = " + toplam);
			}
			if (artis <= 4 && artiyorMu == true) {
				artis++;
				if (artis == 5) {
					artiyorMu = false;
					continue;
				}
			} else {
				artis--;
				if (artis == 1) {
					artiyorMu = true;
					continue;
				}
			}
		}

	}

}
