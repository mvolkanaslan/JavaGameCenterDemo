package fakeIdentityMicroServise;

import JavaGameCenterDemo.entities.concretes.Customer;

public class FakeIdentityChacker {
	public boolean checkCustomer(Customer customer) {
		if(customer.getFirstName()=="Mehmet Volkan" && customer.getLastName() == "ASLAN" && customer.getYearOfBirth() == 1989 && customer.getIdentityNumber()=="123456") {
			return true;
		}
		return false;
			
	}

}
