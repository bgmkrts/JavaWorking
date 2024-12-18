import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		StarbucksCustomerManager customerManager =new StarbucksCustomerManager(new MernisServiceAdapter()); 
		customerManager.save(new Customer(1, "Begum", "Karatas", 2001, "12345678910"));
	}

}
