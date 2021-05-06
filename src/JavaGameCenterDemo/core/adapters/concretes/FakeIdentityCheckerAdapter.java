package JavaGameCenterDemo.core.adapters.concretes;

import JavaGameCenterDemo.core.adapters.abstracts.CustomerIdentityCheckService;
import JavaGameCenterDemo.entities.concretes.Customer;
import fakeIdentityMicroServise.FakeIdentityChacker;

public class FakeIdentityCheckerAdapter implements CustomerIdentityCheckService{

	FakeIdentityChacker fakeIdentityCheker = new FakeIdentityChacker();
	@Override
	public boolean checkCustomer(Customer customer) {
		return fakeIdentityCheker.checkCustomer(customer);
	}

	
	

}
