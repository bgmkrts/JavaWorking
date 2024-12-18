package Bolum8;

public class Kompozisyon {

	public static void main(String[] args) {
		Araba myAraba=new Araba();
		myAraba.hareketeGec();
		myAraba.durmayaBasla();

	}
}
	class Motor{
		 private String isim;
		 private int beygirGucu;
		 
		 public Motor(){
			 
		 isim = "Honda";
		 beygirGucu = 135;
		 System.out.println(isim +" isimli ve "+beygirGucu+" beygirgüçlü motor oluşturuldu");
		 }
		 
		 public void calistir(){
		 System.out.println("Motor çalıştırıldı");
		 }
		 
		 public void durdur(){
		 System.out.println("Motor durduruldu");
		 }
		}
	
	
	class Araba{
		
		 private Motor arabaMotoru;
		 
		 private String renk;
		 private String marka;
		 private int uretimYili;
		 
		 public Araba(){
			 
		 arabaMotoru=new Motor();
		 
		 renk="Kırmızı";
		 marka="Toyota";
		 uretimYili = 2019;
		 
		 System.out.println(renk+" renkli "+uretimYili+" model "+ marka +" marka araba oluşturuldu");
		 }
		 
		 
		 public void hareketeGec(){
		 System.out.println("Araba harekete geçiyor");
		 }
		 
		 public void durmayaBasla(){
		 System.out.println("Araba durmaya başladı");
		 }
		}

