package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1=new Product(1,"Monster","16gb ram",36000,10,16900);
		/*product1.id=1;
		product1.detail="16 gb ram";
		product1.name="Monster";
		product1.unitPrice=36000;*/
		
		Product product2=new Product();
		/*product2.id=2;
		product2.detail="32 gb ram";
		product2.name="Lenovo";
		product2.unitPrice=25000;
		product2.discount=10;
		product2.unitPriceAfterDiscount=14400;*/
		
		product2.setId(2);
		product2.setName("Lenovo"); 
		product2.setDetail("32 gb ram");
		product2.setUnitPrice(25000);
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Product product3=new Product();
		/*product3.id=3;
		product3.detail="64 gb ram";
		product3.name="Asus";
		product3.unitPrice=32000;
		product3.discount=15;
		product3.unitPriceAfterDiscount=17200;*/
		
		product3.setId(3);
		product3.setName("Asus");
		product3.setDetail("64 gb ram");
		product3.setUnitPrice(32000);
		product3.setDiscount(15);
		
		Product[] products= {product1,product2,product3};
		
		for(Product product:products) {
			System.out.println(product.getName());
		}
	//	System.out.println(products.length);
		
		Category category1=new Category();
		/*category1.id=1;
		category1.name="Bilgsayar";*/
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2=new Category();
		/*category2.id=2;
		category2.name="Ev yaşam";*/
		category2.setId(2);
		category2.setName("Ev yaşam");
		
		
	
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		ProductManager promanager=new ProductManager();
		promanager.addToCart(product1);
		promanager.addToCart(product2);
		promanager.addToCart(product3);


}
}
