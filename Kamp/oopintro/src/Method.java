
public class Method {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	public static void sayiBulmaca() {
		
		int[] sayilar=new int[] {1,2,7,8,9};
		int aranacak=2;
		boolean varMı=false;
		
		for(int sayi:sayilar) {
			if(aranacak==sayi) {
				varMı=true;
				break;
			}
			
		}
		String mesaj="";
		if(varMı) {
			mesaj="Sayi mevcuttur:"+aranacak;
			mesajVer(mesaj);
		}
		else {
			System.out.println("sayı mevcut değil"+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println("mevcut sayı"+mesaj);

	}

}
