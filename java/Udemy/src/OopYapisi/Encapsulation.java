package OopYapisi;

public class Encapsulation {
	public static void main(String[] args) {
		
		Ogrenci ogr1=new Ogrenci(87,"yeniOgrenci",(byte) 6,true);
		/*ogr1.ogrBilgileriniYazdir();*/
		ogr1.setOgrenci(398);
		ogr1.ogrBilgileriniYazdir();
		System.out.println("ogr no:"+ogr1.get0grenci());

	}
	
	
}
