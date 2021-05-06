package JavaGameCenterDemo.business.concretes;

import JavaGameCenterDemo.business.abstracts.CustomerService;
import JavaGameCenterDemo.core.adapters.abstracts.CustomerIdentityCheckService;
import JavaGameCenterDemo.dataAccess.abstracts.CustomerDao;
import JavaGameCenterDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	CustomerIdentityCheckService identityCheckService;
	CustomerDao customerDao; 
	
	public CustomerManager(CustomerIdentityCheckService identityCheckService,CustomerDao customerDao) {
		this.identityCheckService = identityCheckService;
		this.customerDao = customerDao;
	}

	
	public void add(Customer customer) {
		if(identityCheckService.checkCustomer(customer)) {
			System.out.println("Customer is Valid !");
			this.customerDao.add(customer);
		}
		else System.out.println("Customer is not Valid ! Check Information..");
	}


	@Override
	public void delete(Customer customer) {
		this.customerDao.delete(customer);
	}


	@Override
	public void update(Customer customer) {
		this.customerDao.update(customer);
		
	}
}
