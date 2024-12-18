package OopYapisi;

public class StatikKavrami {

	public static void main(String[] args) {

        Memur m1=new Memur();
		m1.setIsim("begüm");
		m1.setMaas(30000);

		Memur m2 = new Memur();
		m2.setIsim("yasin");
		m2.setMaas(20000);

		Memur m3 = new Memur();
		m3.setIsim("onur");
		m3.setMaas(15000);

		m2.bilgileriGoster();
		
		Memur.kanunuSoyle();

	}
	
}
	class Memur {

		public Memur() {
			olusturulanMemurSayisi++;

		}

		private String isim;
		private int maas;
		private static int olusturulanMemurSayisi;

		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}

		public int getMaas() {
			return maas;
		}

		public void setMaas(int maas) {
			this.maas = maas;
		}

		public int getOlusturulanMemurSayisi() {
			return olusturulanMemurSayisi;
		}

		public void setOlusturulanMemurSayisi(int olusturulanMemurSayisi) {
			this.olusturulanMemurSayisi = olusturulanMemurSayisi;
		}
		
		 public static void kanunuSoyle(){
		        System.out.println("657 nolu kanun geçerli" );
		    }

		public void bilgileriGoster() {
			System.out.println("oluşturulan memur sayısı:" + getOlusturulanMemurSayisi());
		}

	}


