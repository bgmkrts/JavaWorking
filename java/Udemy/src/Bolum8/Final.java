package Bolum8;

public class Final {

	public static void main(String[] args) {

		int sayi = 10;
		sayi = 15;

		final int sayi2;
		sayi2 = 55;

		Kedi d1 = new Kedi();
		Kedi d2 = new Kaplan();

		d1.goster();
		d2.goster();

	}

}

class Kedi {

	final public void goster() {
		System.out.println("Parentteki goster metotu");
	}
}

class Kaplan extends Kedi {

}
