package OopYapisi;

public class Ogrenci {
	
	private int ogrNo;
	private String isim;
	private byte sinif;
	private boolean aktif;
	
	public void setOgrenci(int yeniOgrNo) {
		this.ogrNo=yeniOgrNo;
		
	}
	
	public int get0grenci() {
		return this.ogrNo;
	}
	
	/*int ogrNo;
	String isim;
	byte sinif;
	boolean aktif;*/
	

	/*public Ogrenci() {
		System.out.println("öğrenci nesnesi oluşturuluyor");
		aktif=true;
		ogrNo=8999;
		isim="Henüz isim girilmemiş";
		sinif=5;
	}
	public Ogrenci(int ogrNo,String isim,byte sinif,boolean aktif) {
		this.ogrNo=ogrNo;
		this.isim=isim;
		this.sinif=sinif;
		this.aktif=aktif;
		
	}
	public Ogrenci(String isim) {
		this.isim=isim;
	}
	public void dersAl() {
		System.out.println("ÖĞRENCİ DERS ALIYOR");
	}
	*/
	
	
	public Ogrenci() {
		
	}
	public Ogrenci(int ogrNo) {
		this.ogrNo=ogrNo;
		
	}
	public Ogrenci(int ogrNo,String isim) {
		this(ogrNo);
		this.isim=isim;
		
	}
	public Ogrenci(String isim) {
		this.isim=isim;
		
	}
	
	public Ogrenci(int ogrNo,String isim,byte sinif) {
		this(ogrNo,isim);
		this.sinif=sinif;
		
	}
	public Ogrenci(int ogrNo,String isim,byte sinif,boolean aktif) {
		this(ogrNo,isim,sinif);
		this.aktif=aktif;
		
	}

	public void ogrBilgileriniYazdir() {
		if (aktif == true) {

			System.out.println("Adım: " + isim + "numaram: " + ogrNo + "sinifim" + sinif);
		} else {
			System.out.println("aktif kaydı yoktur");
		}
	}
}
