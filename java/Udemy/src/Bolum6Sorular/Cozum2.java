package Bolum6Sorular;

public class Cozum2 {

	public static void main(String[] args) {

		/*
		 * Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan sayıların
		 * toplamını yazdıran program yazınız.Ayrıca bu matriste yer alan en küçük ve en
		 * büyük sayıyı da mesaj olarak göstersin
		 */

		int[][] matris = new int[3][2];
		int enKucuk = 900, enBuyuk = 0;

		for (int satir = 0; satir < matris.length; satir++) {
			for (int sutun = 0; sutun < matris[satir].length; sutun++) {
				int rastgeleSayi = (int) (Math.random() * 100);
				matris[satir][sutun] = rastgeleSayi;
				System.out.println(satir + " . satırdaki " + sutun + " . sutununelemanı :" + matris[satir][sutun]);
				if (enKucuk > rastgeleSayi) {
					enKucuk = rastgeleSayi;
				}
				if (enBuyuk < rastgeleSayi) {
					enBuyuk = rastgeleSayi;
				}
			}
		}
		System.out.println("Bu matristeki en küçük sayı :" + enKucuk + " en buyuksayı:" + enBuyuk);
	}

}
