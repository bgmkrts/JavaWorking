package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer bgm=new IndividualCustomer();  //IndividualCustomer, Customer extends ettiginden kullanicilarin ortak alanlarina ulasir
		bgm.customerNumber="96386";
		
		
		CorporoteCustomer hepsiBurada=new CorporoteCustomer();
		hepsiBurada.customerNumber="1285666";
		
		
		SendikaCustomer sdk=new SendikaCustomer();
		sdk.customerNumber="8968";
		
				
		CustomerManager customerManager=new CustomerManager();
		
		/*customerManager.add(hepsiBurada);
		customerManager.add(bgm);
		customerManager.add(sdk);*/
		
		Customer[] customers= {bgm,sdk,hepsiBurada};
		
		customerManager.addMultiple(customers);
		

	}

}
