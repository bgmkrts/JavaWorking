
public class ikiBoyutluDizi {

	public static void main(String[] args) {

		int[][] sayilar = new int[2][3];
		sayilar[0][0] = 1;
		sayilar[0][1] = 2;
		sayilar[0][2] = 3;
		sayilar[1][0] = 4;
		sayilar[1][1] = 5;
		sayilar[1][2] = 6;

		int[][] sayilar2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int satir = 0; satir < sayilar.length; satir++) {
			for (int sutun = 0; sutun < sayilar[satir].length; sutun++) {
				System.out.println("Eleman:" + sayilar[satir][sutun]);
			}
		}
		

		int[][] borclar = { { 0, 100, 200 }, { 350, 0, 250 }, { 150, 500, 0 } };
		String[] isimler= {"ali","veli","hasan"};
		for (int satir = 0; satir < borclar.length; satir++) {
			for (int sutun = 0; sutun < borclar[satir].length; sutun++) {
				if (satir != sutun) {
					int alacak=borclar[satir][sutun]-borclar[sutun][satir];
					if(alacak<0) {
						System.out.println(isimler[satir] + "nin" +  isimler[sutun] +"den alacağı:"+(-alacak) );

					}
				}
			}
		}

	}

}
