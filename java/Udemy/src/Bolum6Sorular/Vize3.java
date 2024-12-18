package Bolum6Sorular;

import java.util.Scanner;

public class Vize3 {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satirSayisi = tara.nextInt();

        for(int i=0; i<satirSayisi; i++){


            for(int j=0; j<satirSayisi; j++){

                if(i==j || j==(satirSayisi-i-1)){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }


            }

            System.out.println(" ");

        }



	}

}
