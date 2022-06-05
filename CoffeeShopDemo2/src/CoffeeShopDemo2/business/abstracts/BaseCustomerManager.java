package CoffeeShopDemo2.business.abstracts;

import java.util.List;

import CoffeeShopDemo2.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public abstract void add(Customer customer);

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public abstract List<Customer> getAll();

	@Override
	public abstract Customer getById(int id);
	

	
}
