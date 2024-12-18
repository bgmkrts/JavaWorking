
public class DizilerinKopyalanması {

	public static void main(String[] args) {

		int anaDizi[] = { 5, 9, 70, 8 };
		int kopyaDizi[] = new int[anaDizi.length];

		for (int i = 0; i < anaDizi.length; i++) {
			kopyaDizi[i] = anaDizi[i];
		}
		for (int kopyalanan : kopyaDizi) {
			System.out.println(kopyalanan);
		}

		// arrayCopy

		int[] kopyaDizi2 = new int[anaDizi.length];
		System.arraycopy(anaDizi, 0, kopyaDizi2, 0, anaDizi.length);
		diziYazdir(kopyaDizi2);
		
		int[] tersineOlusanDizi=tersiniOlustur(anaDizi);
		System.out.println("ters sırala:");
		diziYazdir(tersineOlusanDizi);

	}

	public static void diziYazdir(int[] yazilacakDizi) {
		for (int sayi : yazilacakDizi) {
			System.out.println(sayi);

		}
	}
	public static int[] tersiniOlustur(int[] dizi) {
		int gecici[]=new int[dizi.length];
		for(int i=0,j=dizi.length-1;i<dizi.length;i++,j--) {
			gecici[j]=dizi[i];
			
		}
		return gecici;
	}

}
