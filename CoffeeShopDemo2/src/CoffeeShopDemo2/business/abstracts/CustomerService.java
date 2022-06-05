package CoffeeShopDemo2.business.abstracts;

import java.util.List;

import CoffeeShopDemo2.entities.concretes.Customer;

public interface CustomerService {
	
	void add(Customer customer);

	void update(Customer customer);

	void delete(Customer customer);

	List<Customer> getAll();

	Customer getById(int id);

}
