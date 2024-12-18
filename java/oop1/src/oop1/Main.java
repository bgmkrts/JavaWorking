package oop1;

public class Main {

	public static void main(String[] args) {
		//set
		

		/*product1.name="delingoo";
		product1.unitPrice=5000;
		product1.discount=5;
		product1.imageUrl="bilmemne.jpg";
		product1.unitInStock=3;
		*/

		Product product1=new Product();
		product1.setName("delingoo");
		product1.setDiscount(5);
		product1.setUnitInStock(3);
		product1.setImageUrl("bilmemne.jpg");
		product1.setUnitPrice(5000);
		
		
		
	
		/*  product2.name="msn";
		product2.unitPrice=5000;
		product2.discount=5;
		product2.imageUrl="bilmemne.jpg";
		product2.unitInStock=2;*/
		
		Product product2=new Product();
		product2.setName("msn");
		product2.setDiscount(5);
		product2.setUnitInStock(2);
		product2.setImageUrl("bilmemne.jpg");
		product2.setUnitPrice(5000);
	
		
		
		
		
		/*product3.name="shjaklp";
		product3.unitPrice=5000;
		product3.discount=4;
		product3.imageUrl="bilmemne.jpg";
		product3.unitInStock=5;*/

		Product product3=new Product();
		product3.setName("shjaklp");
		product3.setDiscount(5);
		product3.setUnitInStock(4);
		product3.setImageUrl("bilmemne.jpg");
		product3.setUnitPrice(5000);
	
		
		
		Product[] products= {product1,product2,product3};
		//get
		//System.out.println(product1.name);
		
		for (Product product : products) {
			/*System.out.println(product.name);*/
			System.out.println(product.getName());
	
		}
		
		IndividualCustomer indv=new IndividualCustomer();
		indv.setCustomerNumber("10");
		indv.setId(2);
		indv.setPhone("0548989456");
		indv.setFirstName("Begüm");
		indv.setLastName("karataş");
		
		CorporateCustomer corpo=new CorporateCustomer();
		corpo.setCustomerNumber("568756");
		corpo.setId(1);
		corpo.setPhone("32245586");
		corpo.setCompanyName("Benim Dünyam");
		corpo.setTaxNumber("1111111111111");
		
		
		Customer[] customers= {IndividualCustomer,CorporateCustomer};
	}

}
