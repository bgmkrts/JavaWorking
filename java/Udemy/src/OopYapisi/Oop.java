package OopYapisi;

public class Oop {

	public static void main(String[] args) {
		
	/*	
		Ogrenci[] tumOgr=new Ogrenci[500];
		
		Ogrenci bgm=new Ogrenci();
		bgm.isim="Begüm";
		bgm.ogrNo=983;
		bgm.sinif=3;
		bgm.aktif=true;
		
		bgm.ogrBilgileriniYazdir();
		
		
		Ogrenci mrt=new Ogrenci(500,"mert kal",(byte) 8,true);
		mrt.ogrBilgileriniYazdir();
		
		Ogrenci ysm=new Ogrenci("Yasin");
		ysm.ogrBilgileriniYazdir();
		
	/*	ysm.aktif=true;
		ysm.ogrBilgileriniYazdir();*/
		
		/*bgm=mrt;
		bgm.ogrBilgileriniYazdir();
		
		System.out.println("hsjolş");
		Ogrenci ogr=new Ogrenci(3);
		Ogrenci ogr1=new Ogrenci(259,"ogr");
		Ogrenci ogr2=new Ogrenci(589,"ogr2",(byte) 5);


		tumOgr[0]=ogr;
		tumOgr[1]=ogr1;
		tumOgr[2]=ogr2;
		tumOgr[3]=new Ogrenci(789,"ogr3",(byte) 7,true);
		
		tumOgr[2].aktif=true;		
		tumOgr[2].ogrBilgileriniYazdir();
		
		tumOgr[3].ogrBilgileriniYazdir(); */
		
		
		Televizyon tv=new Televizyon();
		/*tv.acik=true;
		tv.kanal=44;
		tv.sesSeviyesi=24;*/
		tv.setKanal(44);
		tv.setAcik(true);
		tv.setSesSeviyesi(24);
		
		tv.ac();
		tv.goster();


	}

}


