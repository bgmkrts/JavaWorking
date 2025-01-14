package Bolum7Sorular;

public class Cozum3 {

	public static void main(String[] args) {

        System.out.println("Topla : " + HesapMakinesi.topla(10,12,14));
        System.out.println("Fark : " + HesapMakinesi.cikar(15,4,3));
        System.out.println("Çarp : " + HesapMakinesi.carp(10,12,5));
        
        if(HesapMakinesi.bol(0,5,2) != -1){
            System.out.println("Böl : " + HesapMakinesi.bol(0,5,2));
        }else{
            System.out.println("Bölme işlemi başarısız");
        }

    }
}

class HesapMakinesi{

    public static int topla(int... parametreler){
        int toplam =0;
        for(int parametre : parametreler){
            toplam = toplam + parametre;
        }
        return toplam;
    }

    public static int cikar(int... parametreler){
        int fark = parametreler[0];
        for (int i=1; i<parametreler.length ; i++){
            fark = fark - parametreler[i];
        }
        return  fark;
    }

    public static int carp(int... parametreler){
        int carpim = 1;
        for(int parametre : parametreler){
            carpim = carpim * parametre;
        }
        return carpim;
    }

    public static double bol(int... parametreler){
        int bolum = parametreler[0];
        for(int i=1; i<parametreler.length; i++){
            if(parametreler[i] != 0){
                bolum = bolum / parametreler[i];
            }else{
                System.out.println("parametrelerden biri 0 bölme yapılamadı");
                return -1;
            }
        }

        return bolum;


    }

	}


