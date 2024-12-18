package ilkProje;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
	

		
		/*System.out.println("Hello world");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Birinci sayı giriniz: ");
		int sayi1=input.nextInt();		
		System.out.println("ikinci sayı giriniz: ");
		int sayi2=input.nextInt();
		System.out.println("işlem tipi:");
		byte islem=input.nextByte();
		
		switch(islem) {
		case 1:
			System.out.println(sayi1+sayi2);
			break;
		case 2:
			System.out.println(sayi1-sayi2);
			break;
		case 3:
			System.out.println(sayi1*sayi2);
			break;
		case 4:
			System.out.println(sayi1/sayi2);
			break;
		default:
			System.out.println("Hatalı bir sayı girdiniz");
			break;
		}*/
		
		
		
		
		/*for(int i=0;i<20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}*/
		
		
		
		/*int sayac=1;
		while(sayac<=20) {
			System.out.println(sayac);
			sayac++;
		}*/
		
		
		
		/*Scanner input=new Scanner(System.in);
		int sayi;
		while(true) {
			System.out.println("Lütfen bir sayı giriniz");
			sayi=input.nextInt();
			if(sayi==0) {
				break;
			}
		}
		System.out.println("Döngü bitti.Program çalıştı");*/

		
		
		/*Scanner input=new Scanner(System.in);
		int sayi;
		do {
			System.out.print("Lütfen sayı girin:");
			sayi=input.nextInt();

		}while(sayi!=0);
		System.out.println("Program normal çalışıyor");*/
		
		
		
		
	/*	int[] sayilar= {20,40,60,80,45,70};
		String[] ogrenciler= {"Bahadır","Aysima","Buse","Ali"};
		for(int i=0;i<4;i++) {
			System.out.println(ogrenciler[i]);
				
		}
		*/
		/*kendiniTanit();*/
		
		/* ortalamaAl(5,7); */
		
		System.out.println(ortalamaHesapla(40,20));
		
		
		
		

	}
	
	/*public static void kendiniTanit(){
		System.out.println("Adı:Begüm");
		System.out.println("Soyadı:Karataş");
		System.out.println("Okulu:Fırat Üniversitesi");
		System.out.println("Şehir:Ankara");

		
	}
	*/
	public static void ortalamaAl(int sayi1,int sayi2) {
		int toplam=sayi1+sayi2;
		int ortalama=toplam/2;
		System.out.println(ortalama);
		
	}
	
	public static double ortalamaHesapla(int sayi1,int sayi2) {
		int toplam=sayi1+sayi2;
		double ortalama=toplam/2;
		return ortalama;
		
	}
	
	



}
