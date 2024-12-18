package intro;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "İnternet şubeye gir";
		System.out.println(internetSubeButonu);
		int vade = 36;

		double bugunkuDeger = 8.20;
		double dunkuDeger = 8.20;

		boolean dustuMu = false;

		if (bugunkuDeger < dunkuDeger) {
			System.out.println("dolar düştü resmi");

		} else if (bugunkuDeger > dunkuDeger) {
			System.out.println("dolar yükseldi resmi");
		} else {
			System.out.println(" eşit değer resmi");
			
		}

		
		
		
		String[] krediler = { "Hızlı Kredi", "Mutlu Emekli Kredisi", "Konut kredisi", "Msb kredisi", "Çiftçi kredisi"

		};

		// foreach döngüsü

		for (String kredi : krediler) {
			System.out.println(kredi);

		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
		
		
		System.out.println("-----------------------------------------------");

        // referans tiplari / deger Tipleri

        // su iki konu , Tasarim desenleri, Tasarim prensiplerini, Katmanli mimarileri, dependency injection,
        // ais container gibi konulari anlamamizi saglayan temel bilgidir, interface leri bilip o interfaceleri
        // gercek hayatta da kullanmamizi saglayacak hususu icerir


		//deger-ilkel(primitiv/stack) tip : degere sahip olurlar
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1); // 10

		
		//referans(non-primitive/heap) tip : degeri gösterirler
		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50, 60 };
		sayilar1 = sayilar2;// sayilar1 referansi artik sayilar2 referansinin gösterdigi elemanlari, gösteriyor
		 // sayilari1 in onceki elemanlar listesi artik null, cöp oldu
		sayilar2[0] = 100; 
		System.out.println(sayilar1[0]); // 100
		
		

		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1); // İstanbul

		 /*

        1- Ilkel (Primitive) Veri Tipleri:

           1.byte: 8-bit işaretsiz tamsayıları temsil eder. -128 ile 127 arasındaki değerleri alabilir.
           2.short: 16-bit işaretsiz tamsayıları temsil eder. -32,768 ile 32,767 arasındaki değerleri alabilir.
           3.int: 32-bit tam sayıları temsil eder. -2,147,483,648 ile 2,147,483,647 arasındaki değerleri alabilir.
           4.long: 64-bit tam sayıları temsil eder. Çok büyük veya çok küçük tamsayıları saklamak için kullanılır.
           5.float: 32-bit kayan noktalı sayıları temsil eder. Kesirli sayıları (ondalık) saklar.
           6.double: 64-bit kayan noktalı sayıları temsil eder. Daha yüksek hassasiyetli kesirli sayıları saklar.
           7.char: 16-bit Unicode karakterleri temsil eder. Tek bir karakteri saklar.
           8.boolean: Mantıksal değerleri temsil eder. Sadece true veya false değerlerini alabilir.

        2- Referans veri tipleri:

           - Class: Sınıflar, nesnelerin oluşturulmasını ve yönetilmesini sağlar. Özelleştirilebilir veri tiplerini
           tanımlamak için kullanılır.
           - Interface: Arayüzler, metotların imzalarını içeren ancak metotların gövdelerini içermeyen referans
           veri tipleridir. Sınıflar bu arayüzleri - uygular.
           - Array: Dizi veri tipi, aynı türden verileri saklamak için kullanılır. Örneğin, int[] bir tamsayı
           dizisini temsil eder.
           - Enum: Enumerations (sıralamalar), önceden tanımlanmış sabit değerlerin bir koleksiyonunu temsil eder.

           1.String: Metin dizilerini temsil eder ve metin işlemleri için kullanılır.
           2.Array (Dizi): Diziler, aynı türden öğeleri saklamak için kullanılır. Bir dizi, bellekte bir nesne olarak
           saklanır ve bu nesnenin bir referansı vardır.
           3.ArrayList: ArrayList, dinamik boyutlu bir diziyi temsil eder. ArrayList, bir nesne olarak
           bellekte saklanır ve bir referansa sahiptir.
           4.HashMap: HashMap, anahtar-değer çiftlerini saklamak için kullanılır ve bir anahtarla ilişkilendirilen
           değerlere hızlı erişim sağlar. HashMap da bir nesne ve bir referans içerir.
           5.Kullanıcı Tanımlı Sınıflar (Custom Classes): Java'da kullanıcı tarafından tanımlanan sınıflar,
           nesneleri ve veri yapılarını oluşturmanıza olanak tanır. Bu sınıflar, programınızın mantığını ve
           veri yapısını temsil etmek için kullanılır.
           6.Enum (Sıralı Tip): Enumerations (enum), belirli bir sınırlı küme değeri temsil etmek için kullanılır.
           Bu değerler bir referans veri tipi olan enum türüne aittir.



        3- Özel Veri Tipleri:

           - String: Metin verilerini temsil eden bir sınıf. String verileri değiştirilemez (immutable) ve birçok
           metinsel işlem için kullanılır.
           - Wrapper Sınıflar: Java'da her biri bir ilkel veri türünü sarmalayan (wrap) sınıflar vardır. Örneğin,
           Integer, Double, Boolean vb.

        4- Null Veri Tipi:

           null: Herhangi bir nesnenin değeri yoksa veya atanmamışsa kullanılan özel bir değerdir. Özellikle referans
           türlerinde kullanılır.

           NULL - "null" bir değeri ifade eden özel bir değerdir ve Java'da sadece referans veri tiplerine aittir.
           "null", bir nesnenin atanmamış olduğunu veya herhangi bir bellek alanını işaret etmediğini
           belirtmek için kullanılır.

        */
		
		
		
		
		
		
		
		
		/*
		 * for(int i=0;i<5;i++) { System.out.println(i); }
		 */

		
		 int i=0;
		 /*
		 *  while(i<5)
		 *   { System.out.println(i); i++; 
		 *   }
		 */
		 
		do
		{
			System.out.println(i);
			i++;
		} while (i < 5);
		
		
		
		
		
		
		
	/*	char harf='I';
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
			default:
				System.out.println("ince SESli harf");
		}
		
		*/
		
		int[] sayilar=new int[] {1,2,7,8,9};
		int aranacak=5;
		boolean varMı=false;
		
		for(int sayi:sayilar) {
			if(aranacak==sayi) {
				varMı=true;
				break;
			}
			
		}
		
		if(varMı) {
			System.out.println("mevcut sayı");
		}
		else {
			System.out.println("sayı mevcut değil");
		}
		

	}
}
