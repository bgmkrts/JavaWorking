
public class Metot {

	public static void main(String[] args) {
		menuGoster();
		sayilariTopla(10,15);
		sayilariTopla(8,40);
		sayilariTopla(19,48);
		
		int sayi=50;
		sayiyiDeğistir(sayi);
		
		
		System.out.println(farkBul(5,8));

	}
	
	public static void sayiyiDeğistir(int x) {
		x=x+10;
		System.out.println("gönderilen sayının 10 fazlası:"+x);
		
		
	}
	public static void sayilariTopla(int birinci,int ikinci){
		System.out.println(birinci+ikinci);
			
		
	}
	public static int farkBul(int a,int b) {
		return (a-b);
	}
	
	public static void menuGoster() {
		System.out.println("*******Menü***********");
		System.out.println("1-İki sayının toplamını bul");
		System.out.println("1-İki sayının farkını bul");
		System.out.println("1-İki sayının çarpımını bul");
		System.out.println("1-İki sayının bölümünü bul");

		
	}

}
