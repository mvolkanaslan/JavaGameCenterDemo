package JavaGameCenterDemo.business.abstracts;

import JavaGameCenterDemo.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
}
