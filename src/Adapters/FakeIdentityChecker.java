package Adapters;

import Abstract.CustomerIdentityCheckService;
import Entities.Customer;

public class FakeIdentityChecker implements CustomerIdentityCheckService{

	
	public boolean checkCustomer(Customer customer) {
		if(customer.getFirstName()=="Mehmet Volkan" && customer.getLastName() == "ASLAN" && customer.getYearOfBirth() == 1989 && customer.getIdentityNumber()=="123456") {
			return true;
		}
		return false;
			
	}

}
