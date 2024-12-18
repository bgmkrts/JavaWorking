package Bolum8;

public class Polymorphism {

	public static void main(String[] args) {
		Hayvan h1 = new Hayvan();
		Kopek kopek1 = new Kopek("Golden");
		Kedi kedi1 = new Kedi("Van Kedisi");

		adiniSoyle(h1);
		adiniSoyle(kedi1);
		adiniSoyle(kopek1);

	}

	public static void adiniSoyle(Hayvan hayvan) {
		hayvan.adiniSoyle();
	}

}

class Hayvan {

	private int ayakSayisi;

	public int getAyakSayisi() {
		return ayakSayisi;
	}

	public void setAyakSayisi(int ayakSayisi) {
		this.ayakSayisi = ayakSayisi;
	}

	public void adiniSoyle() {
		System.out.println("Ben hayvan sınıfı nesneyim");
	}
}

class Kopek extends Hayvan {

	private String tur;

	public Kopek(String tur) {
		setAyakSayisi(4);
		setTur(tur);
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	@Override
	public void adiniSoyle() {
		System.out.println("Ben bir köpek nesnesiyim");
	}
}

class Kedi extends Hayvan {

	private String cinsi;

	public Kedi(String cins) {
		setAyakSayisi(4);
		setCinsi(cins);
	}

	public String getCinsi() {
		return cinsi;
	}

	public void setCinsi(String cinsi) {
		this.cinsi = cinsi;
	}

	@Override
	public void adiniSoyle() {
		System.out.println("Ben bir kedi nesnesiyim");
	}

}
