package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class customerCheckManager implements CustomerCheckService{
     
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
}
