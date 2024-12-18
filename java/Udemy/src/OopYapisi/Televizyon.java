package OopYapisi;

public class Televizyon {
	
	private int sesSeviyesi;
	private boolean acik;
	private int kanal;
	
	public void setKanal(int yeniKanal) {
		if(acik && yeniKanal>0 && yeniKanal<500 ) {
		kanal = yeniKanal;
		}
		else {
			System.out.println("tv kapalı veya yanlış bir kanal değeri yazdınız");
		}
	}
	public int getKanal() {
		return kanal;
	}
	
	
	

	public int getSesSeviyesi() {
		return sesSeviyesi;
	}
	public void setSesSeviyesi(int sesSeviyesi) {
		this.sesSeviyesi = sesSeviyesi;
	}
	public boolean getAcik() {
		return acik;
	}
	public void setAcik(boolean acik) {
		this.acik = acik;
	}

	public void ac() {
		if(acik==false) {
		System.out.println("tv açılıyor");
		acik=true;
		}
		else {
			System.out.println("tv zaten açık");
		}
	}
	public void kapat() {
		if(acik==false) {
		System.out.println("tv kapanıyor");
		}
		else {
			System.out.println("tv zaten kapalı");
		}
	}
	
	public void goster() {
		System.out.println("tv açık: " + acik + "kanal: " + kanal + "ses seviyesi" + sesSeviyesi);

	}
}
