package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// sadece db kodları buraya yazılır
		
		System.out.println("Hibernate ile veritabanına eklendi");
	}


}
