package Bolum8;
import java.util.Collections;

public class ArrayList{

    public static void main(String[] args) {
        //Telefon[] telefonlar = new Telefon[20];
    	
        ArrayList<String> telefonlar = new ArrayList();

        Telefon tel1=new Telefon("Mi 8",3000);
        Telefon tel2=new Telefon("Mate 10 Pro",4500);
        Telefon tel3=new Telefon("İphone X",7000);

        telefonlar.add(tel1);
        telefonlar.add(tel2);
        telefonlar.add(tel3);

        System.out.println(telefonlar.size());
        
        listeyiYazdir(telefonlar);


        telefonlar.add(tel1);
        telefonlar.add(0,tel3);
        System.out.println("Değişikliklerden sonra:");
        telefonlar.set(3,tel2);
        telefonlar.remove(tel2);
        telefonlar.remove(0);
        listeyiYazdir(telefonlar);
        System.out.println(telefonlar.contains(tel3));
        System.out.println(telefonlar.contains(tel1));


    }

    private static void listeyiYazdir(ArrayList<Telefon> liste) {

        /*for(int i=0; i<liste.size(); i++){
            System.out.println(liste.get(i));
        }
*/
        for(Telefon oankiDeger : liste){

            System.out.println(oankiDeger);

        }

    }


}

class Telefon{

    String model;
    int fiyat;

    public Telefon(String model, int fiyat) {
        this.model = model;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "model='" + model + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}

