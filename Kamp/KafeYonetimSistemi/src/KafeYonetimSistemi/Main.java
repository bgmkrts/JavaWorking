package KafeYonetimSistemi;

import MusteriYonetimi.NeroMusteriYonetimi;

public class Main {

	public static void main(String[] args) {
		System.setProperty("org.apache.commons.logging.LogFactory","org.apache.commons.logging.impl.LogFactoryImpl");

		NeroMusteriYonetimi nm=new NeroMusteriYonetimi();
		nm.ekle("Begüm", "karataş", 18);

	}

}
