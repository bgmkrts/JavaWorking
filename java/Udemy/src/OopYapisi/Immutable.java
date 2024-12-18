package OopYapisi;

public class Immutable {

    public static void main(String[] args) {

        //String[] ureticiFirmalari = {"HP,","Fujitsu","Dell"};
        Bilgisayar b1=new Bilgisayar(8,16, new String[]{"HP","Fujitsu","Dell"});
        bilgisayariYazdir(b1);

        String[] ureticiler = b1.getUreticiFirmalari();
        ureticiler[0] = "Apple";

        bilgisayariYazdir(b1);



    }

    public static void bilgisayariYazdir(Bilgisayar yazdirilacakPC){
        System.out.println("Çekirdek sayısı:"+yazdirilacakPC.getCekirdekSayisi()+" ram miktarı :"+yazdirilacakPC.getRamBoyutu()
        +" uretici firmalar :" + yazdirilacakPC.getUreticiFirmalari()[0]);
    }
}

class Bilgisayar{

    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalari;

    public Bilgisayar(int cSayisi, int ramBoyutu, String[] ureticiFirmaAdlari){
        this.cekirdekSayisi = cSayisi;
        this.ramBoyutu = ramBoyutu;
        this.ureticiFirmalari = ureticiFirmaAdlari;

    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }


    public int getRamBoyutu() {
        return ramBoyutu;
    }


    public String[] getUreticiFirmalari() {

        String[] kopyaFirmaIsimleri=new String[ureticiFirmalari.length];

        for(int i=0; i<kopyaFirmaIsimleri.length; i++){
            kopyaFirmaIsimleri[i] = ureticiFirmalari[i];
        }

        return  kopyaFirmaIsimleri;

    }


}