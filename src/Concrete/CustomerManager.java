package Concrete;

import Abstract.CustomerIdentityCheckService;
import Entities.Customer;

public class CustomerManager extends EntityBaseManager{

	CustomerIdentityCheckService identityCheckService;
	
	public CustomerManager(CustomerIdentityCheckService identityCheckService) {
		this.identityCheckService = identityCheckService;
	}

	
	public void add(Customer customer) {
		if(identityCheckService.checkCustomer(customer)) {
			 System.out.println("Customer is Valid !");
			 System.out.println("Added to Database !");
		}
		else System.out.println("Customer is not Valid ! Check Information..");
	}
}
