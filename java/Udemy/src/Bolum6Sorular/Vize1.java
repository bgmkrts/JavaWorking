package Bolum6Sorular;

public class Vize1 {

	public static void main(String[] args) {
	/*	SORU 1: 5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
	   Bu matrisi ekrana    yazdıran ve çapraz elemanların toplamını gösteren programı yazınız.*/
		
		
		int[][] matrix = new int[5][5];
	    int genelToplam = 0;

	    for(int i=0; i<5; i++){
	        for(int j=0; j<5; j++){
	            matrix[i][j] = (int) (Math.random() * 10);
	            System.out.print(matrix[i][j]+ "  ");
	        }
	        genelToplam= genelToplam + matrix[i][i];
	        System.out.println();
	    }

	        System.out.println("Çapraz elemanların toplamı :"+genelToplam);
	




	}

}
