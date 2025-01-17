package Bolum7Sorular;

public class Cozum4 {

	public static void main(String[] args) {
		/* Bir banka hesabı için sınıf tasarlayın. Bu sınıfta hesabın kime ait oldugunu 
tutan hesapNo, hesaptakiPara, para yatirma ve çekme metotları olsun.
 Ayrıca bu hesaplarda olan tüm parayı, açılan hesap sayısını, yapılan toplam 
paracekme ve para yatırma sayısını gösteren bir metot ve iki hesabı para 
değişkenine göre birbiriyle kıyaslayacak metot bulunmalı*/
		
		 BankaHesap bgm=new BankaHesap(123,500);
	     BankaHesap ysn=new BankaHesap(456,1500);
	     BankaHesap onr=new BankaHesap(987,200);
	     
	        onr.paraYatir(500);
	        bgm.paraCek(600);
	        ysn.paraCek(450);
	        
	        BankaHesap.bankaOzetiGoster();
	        
	        onr.kiyasla(ysn);
	        onr.kiyasla(bgm);
	    }
	 }
	 class BankaHesap{
	    private int hesapNo;
	    private int hesapBakiye;
	    private static int tumBankaBakiyesi=0;
	    private static int tumHesapSayisi=0;
	    private static int operasyonSayisi=0;
	    
	    public BankaHesap(int hesapNo, int hesapBakiye) {
	        this.hesapNo = hesapNo;
	        this.hesapBakiye = hesapBakiye;
	        tumBankaBakiyesi += hesapBakiye;
	        tumHesapSayisi ++;
	    }
	    
	    
	    public int getHesapNo() {
	        return hesapNo;
	    }
	    public void setHesapNo(int hesapNo) {
	        this.hesapNo = hesapNo;
	    }
	    public int getHesapBakiye() {
	        return hesapBakiye;
	    }
	    public void setHesapBakiye(int hesapBakiye) {
	        this.hesapBakiye = hesapBakiye;
	    }
	    
	    
	    
	    
	    public void kiyasla(BankaHesap kiyaslanacakHesap){
	        if(this.getHesapBakiye() < kiyaslanacakHesap.getHesapBakiye()){
	            System.out.println(this.getHesapNo()+" nolu kişinin parası  "+kiyaslanacakHesap.getHesapNo()+" nolu kişinin parasından azdır");
	        }else if(this.getHesapBakiye() > kiyaslanacakHesap.getHesapBakiye()){
	            System.out.println(this.getHesapNo()+" nolu kişinin parası  "+kiyaslanacakHesap.getHesapNo()+" nolu kişinin parasından çoktur");
	        }else{
	            System.out.println(this.getHesapNo()+" nolu kişinin parası  "+kiyaslanacakHesap.getHesapNo()+" nolu kişinin parasına eşittir");
	        }
	    }
	    
	    
	    public void paraYatir(int paraMiktari){
	        this.hesapBakiye += paraMiktari;
	        operasyonSayisi++;
	    }
	    
	    public void paraCek(int paraMiktari){
	        if(this.hesapBakiye >= paraMiktari){
	            this.hesapBakiye -= paraMiktari;
	            operasyonSayisi++;
	            tumBankaBakiyesi -= paraMiktari;
	        }else{
	            System.out.println("Hesabınızda yeterli para yok");
	        }
	    }
	    
	    public static void bankaOzetiGoster(){
	        System.out.println("Bankadaki hesap sayısı :" +tumHesapSayisi);
	        System.out.println("Bankadaki toplam para :" +tumBankaBakiyesi);
	        System.out.println("Bankada yapılan tüm operasyonların sayısı :" +operasyonSayisi);
	    }
	}


