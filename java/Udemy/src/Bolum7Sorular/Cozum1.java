package Bolum7Sorular;

public class Cozum1 {
	 public static void main(String[] args) {

	        CemberDaire cember1=new CemberDaire(5);
	        System.out.printf("Yarıcapı 5 olan çemberin çevresi : %.2f ", cember1.cevreBul());
	        System.out.println();
	        System.out.printf("Yarıcapı 5 olan dairenin alanı : %.2f ", cember1.alanBul());

	    }
	}

	class CemberDaire{

	    private int yariCap;
	    public final static double PI = 3.14;

	    public CemberDaire(int r){
	        this.yariCap = r;
	    }

	    public double cevreBul(){
	        return 2 * PI * yariCap;
	    }

	    public double alanBul(){
	        return PI * Math.pow(yariCap, 2);
	    }


	

}
