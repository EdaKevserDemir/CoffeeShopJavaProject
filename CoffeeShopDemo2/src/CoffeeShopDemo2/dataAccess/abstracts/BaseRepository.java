package CoffeeShopDemo2.dataAccess.abstracts;

import java.util.List;

import CoffeeShopDemo2.entities.concretes.Customer;

public interface BaseRepository {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	List<Customer> getAll();
	Customer getById(int id);
	
	

}
